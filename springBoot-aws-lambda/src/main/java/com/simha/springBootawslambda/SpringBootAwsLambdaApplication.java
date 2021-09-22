package com.simha.springBootawslambda;

import java.util.List;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootAwsLambdaApplication {
	
	@Autowired
	private BookDAORepo bookDaoRepo;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAwsLambdaApplication.class, args);
	}
	
	@Bean
	
	public Supplier<List<Orders>> getAllOrders()
	
	{
		return ()->bookDaoRepo.getOrders();
		
	}
	

}
