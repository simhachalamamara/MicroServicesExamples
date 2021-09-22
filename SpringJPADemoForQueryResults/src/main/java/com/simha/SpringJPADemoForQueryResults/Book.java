package com.simha.SpringJPADemoForQueryResults;

public class Book {
	private int id;
	private String name;
	private int pages;
	private double salary;
	

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Book(int id, String name, int pages,double salary) {
		super();
		this.id = id;
		this.name = name;
		this.pages = pages;
		this.salary=salary;
	}

	

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", pages=" + pages + ", salary=" + salary + "]";
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getPages() {
		return pages;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

}
