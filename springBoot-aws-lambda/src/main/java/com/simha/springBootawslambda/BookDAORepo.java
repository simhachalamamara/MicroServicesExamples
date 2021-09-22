package com.simha.springBootawslambda;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class BookDAORepo {

	
	public List<Orders>  getOrders()
	{
		List<Orders> orders=new ArrayList<>();
		
		Orders order1=new Orders(1, "book1", 1245);
		Orders order2=new Orders(1, "book1", 1245);
		Orders order3=new Orders(1, "book1", 1245);
		Orders order4=new Orders(1, "book1", 1245);
		orders.add(order1);
		orders.add(order2);
		orders.add(order3);
		orders.add(order4);
		return orders;
	}
}
