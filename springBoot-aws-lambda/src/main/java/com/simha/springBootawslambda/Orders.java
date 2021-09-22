package com.simha.springBootawslambda;

public class Orders {
	private int id;
	public int getId() {
		return id;
	}
	public String getOrderName() {
		return OrderName;
	}
	public double getPrice() {
		return price;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setOrderName(String orderName) {
		OrderName = orderName;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	private String OrderName;
	private double price;
	public Orders(int id, String orderName, double price) {
		super();
		this.id = id;
		OrderName = orderName;
		this.price = price;
	} 

}
