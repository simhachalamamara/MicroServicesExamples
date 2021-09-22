package com.simha.SpringJPADemoForQueryResults;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class CollectMap {

	public static List<Employee> getEmployee()

	{
		List<Integer> listOfPhoneNumber = new ArrayList<>();
		List<Integer> listOfPhoneNumber1 = new ArrayList<>();
		List<Integer> listOfPhoneNumber3 = new ArrayList<>();
		listOfPhoneNumber.add(12345566);
		listOfPhoneNumber.add(243434232);
		listOfPhoneNumber1.add(89373673);
		listOfPhoneNumber1.add(65634624);
		listOfPhoneNumber3.add(98297287);

		List<Employee> listOfEMployee = new ArrayList<>();

		Employee e1 = new Employee(1, "Johny", "Hyd", listOfPhoneNumber);
		Employee e2 = new Employee(1, "holk", "USA", listOfPhoneNumber1);
		Employee e3 = new Employee(1, "jokes", "UK", listOfPhoneNumber3);
		listOfEMployee.add(e1);
		listOfEMployee.add(e2);
		listOfEMployee.add(e3);
		return listOfEMployee;

	}

}

public class FlatMapTest {
	public static void main(String[] args) {
		List<Employee> emp=CollectMap.getEmployee();
		
		List<Integer> listInteger = emp.stream().flatMap((e1)->e1.getPhoneNumber().stream()).collect(Collectors.toList());
		for (Integer list : listInteger) {
			
			System.out.println(list);
			
		}
		
	}

}
