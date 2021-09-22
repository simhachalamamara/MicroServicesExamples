package com.simha.SpringJPADemoForQueryResults;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;

class Employe {
	private int id;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	private String name;
	private double salary;

	public Employe(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

}

public class SumOfValues {

	public static List<Employe> getEmployeeFromDataBase()

	{
		Employe emp1 = new Employe(1, "Simha", 1000);
		Employe emp2 = new Employe(2, "Simha1", 2000);
		Employe emp3 = new Employe(4, "Simha2", 3000);

		List<Employe> listEmploye = new ArrayList<>();
		listEmploye.add(emp1);
		listEmploye.add(emp2);
		listEmploye.add(emp3);

		return listEmploye;

	}

	public static void main(String[] args) {

		List<Employe> listEmploye=getEmployeeFromDataBase();
		
		OptionalDouble doubles = listEmploye.stream().filter(e->e.getId()>1).mapToDouble(x->x.getSalary()).average();
		
		System.out.println(doubles.getAsDouble());
		
		
	
	}

}
