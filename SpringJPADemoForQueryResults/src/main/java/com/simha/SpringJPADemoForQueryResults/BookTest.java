package com.simha.SpringJPADemoForQueryResults;

import java.util.List;
import java.util.stream.Collectors;

public class BookTest {
	public static void main(String[] args) {

		List<Book> listBooks = getTaxPay("tax");
		for (Book book : listBooks) {
			System.out.println(book);
		}

	}

	public static List<Book> getTaxPay(String taxDeclaration) {
		List<Book> listOfBooks = BookDataFromBase.getBooks();

		return listOfBooks.stream().filter(salary -> salary.getSalary() >= 500000).collect(Collectors.toList());
	}

}
