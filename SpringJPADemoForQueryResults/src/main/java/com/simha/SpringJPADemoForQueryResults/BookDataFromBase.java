package com.simha.SpringJPADemoForQueryResults;

import java.util.ArrayList;
import java.util.List;

public class BookDataFromBase {
	
	public static List<Book> getBooks()
	{
		List<Book> books=new ArrayList<>();
		books.add(new Book(1001,"Java",2000,400000));
		books.add(new Book(1009,"Oracle",5000,500000));
		books.add(new Book(1007,"DBMS",5000,200000));
		books.add(new Book(1008,"Collections",8000,600000));
		books.add(new Book(1003,"OOPS",5000,800000));
		books.add(new Book(1004,"Electronics",3000,700000));
		books.add(new Book(1002,"Threads",12000,110000));
		return books;
		
	}

}
