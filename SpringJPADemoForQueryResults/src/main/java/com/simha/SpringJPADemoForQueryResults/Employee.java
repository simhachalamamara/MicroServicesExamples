package com.simha.SpringJPADemoForQueryResults;

import java.util.List;

public class Employee {
	private int Id;
	private String name;
	private String Address;
	private List<Integer> PhoneNumber;
	

	public Employee(int id, String name, String address, List<Integer> phoneNumber) {
		super();
		Id = id;
		this.name = name;
		Address = address;
		PhoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", name=" + name + ", Address=" + Address + ", PhoneNumber=" + PhoneNumber + "]";
	}

	public int getId() {
		return Id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return Address;
	}

	public List<Integer> getPhoneNumber() {
		return PhoneNumber;
	}

	public void setId(int id) {
		Id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public void setPhoneNumber(List<Integer> phoneNumber) {
		PhoneNumber = phoneNumber;
	}

}
