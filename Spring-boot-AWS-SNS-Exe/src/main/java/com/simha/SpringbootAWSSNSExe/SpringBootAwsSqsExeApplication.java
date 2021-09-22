package com.simha.SpringbootAWSSNSExe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.awspring.cloud.autoconfigure.context.ContextRegionProviderAutoConfiguration;
import io.awspring.cloud.autoconfigure.context.ContextStackAutoConfiguration;

@SpringBootApplication(exclude= {ContextStackAutoConfiguration.class,ContextRegionProviderAutoConfiguration.class})
public class SpringBootAwsSqsExeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAwsSqsExeApplication.class, args);
	}

}
