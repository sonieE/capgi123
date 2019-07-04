package com.cg.Firstproject;

public class OrderDetails {
	private int orderNumber;
	private String productName;
	public int getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public OrderDetails(int orderNumber, String productName) {
		super();
		this.orderNumber = orderNumber;
		this.productName = productName;
	}


}
