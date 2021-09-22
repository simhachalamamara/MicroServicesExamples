package com.simha.SpringJPADemoForQueryResults;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import ch.qos.logback.core.net.SyslogOutputStream;

public class SortTest {
	public static void main(String[] args) {
		
		List<Integer> listInteger=new ArrayList<Integer>();
		listInteger.add(1);
		listInteger.add(20);
		listInteger.add(30);
		listInteger.add(3);
		listInteger.add(7);
		//.stream().sorted(Comparator.reverseOrder()).forEach(x->System.out.println(x));
		List<Book> books=BookDataFromBase.getBooks();
		
	//	books.stream().sorted((b1,b2)->b1.getName().compareTo(b2.getName())).forEach((obj)->System.out.println(obj));
	/*	books.stream().sorted(Comparator.comparing(books->b)*/
		
	}

}
