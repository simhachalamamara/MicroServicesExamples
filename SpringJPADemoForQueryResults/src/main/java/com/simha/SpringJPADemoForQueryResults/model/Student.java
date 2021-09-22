package com.simha.SpringJPADemoForQueryResults.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "studentDemo")

public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="lastName")
	private String lastName;
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	private double salary;
	private String address;
	private int age;
	@Column(name="firstName")
    private String firstName;
    
	public int getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	
	public double getSalary() {
		return salary;
	}
	public String getAddress() {
		return address;
	}
	public int getAge() {
		return age;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
