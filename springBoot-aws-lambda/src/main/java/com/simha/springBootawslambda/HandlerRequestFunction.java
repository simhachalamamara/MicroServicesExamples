package com.simha.springBootawslambda;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class HandlerRequestFunction implements RequestHandler<String, List> {
	@Autowired
	private BookDAORepo bookDaoRepo;
	@Override
	public List handleRequest(String name, Context arg1) {
		// TODO Auto-generated method stub
		bookDaoRepo =new BookDAORepo();

		List<Orders> ordrelist = bookDaoRepo.getOrders();
		return ordrelist;
	}

}
