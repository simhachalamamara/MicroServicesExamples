package com.simha.SpringJPADemoForQueryResults;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class Employees {
	private int id;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	private String name;
	private String address;

	public Employees(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

}

public class OptionalTest {
	public static Employees findEmploye(List<Employees> listemp, String name) throws Exception {
		
		return listemp.stream().filter(emp->emp.getName().equals(name)).findAny().orElseThrow(()->new Exception("name not found in our DB"));

	}

	public static void main(String[] args) throws Exception {

		Employees emp = new Employees(102, "james", "Hyd");
		Employees emp1 = new Employees(102, "Steve", "Hyd");

		List<Employees> listOfEmp = new ArrayList<Employees>();
		listOfEmp.add(emp);
		listOfEmp.add(emp1);

		 Employees employee = findEmploye(listOfEmp, "james");
		 System.out.println(employee);
		

		/*Optional<Object> opt = Optional.empty();
		System.out.println(opt);
		Optional<String> opts = Optional.ofNullable(emp.getName());
		// System.out.println(opts.get());
		Optional<String> optEmp = Optional.of(emp.getName());
		// System.out.println(optEmp.get());
*/
	}

}
