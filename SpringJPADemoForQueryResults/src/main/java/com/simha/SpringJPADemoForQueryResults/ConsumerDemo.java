package com.simha.SpringJPADemoForQueryResults;

import java.util.List;
import java.util.function.Consumer;

import java.util.Arrays;

public class ConsumerDemo {
	public static void main(String[] args) {

		Consumer<Integer> consumer = (t) -> System.out.println("printing.... " + t);
		consumer.accept(40);

		List<Integer> listIntegers = Arrays.asList(1, 2, 3, 4);
		listIntegers.stream().forEach(consumer);
		
		System.out.println("hi hello mr tingers Mr Simhachalam Amara ");
	}

}
