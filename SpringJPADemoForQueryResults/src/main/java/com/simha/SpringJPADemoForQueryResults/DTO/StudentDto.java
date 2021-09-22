package com.simha.SpringJPADemoForQueryResults.DTO;

public class StudentDto {
	
	private int id;
	private String address;
	private String lastName;
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	private double salary;
	
	private int age;
    private String firstName;
	public int getId() {
		return id;
	}
	public String getAddress() {
		return address;
	}
	
	public double getSalary() {
		return salary;
	}
	public int getAge() {
		return age;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	

}
