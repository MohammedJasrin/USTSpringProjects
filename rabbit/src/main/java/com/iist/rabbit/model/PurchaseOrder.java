package com.iist.rabbit.model;

public class PurchaseOrder {
private String orderId;
private String company;
private int qty;
private int price;
public String getOrderId() {
	return orderId;
}
public void setOrderId(String orderId) {
	this.orderId = orderId;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
@Override
public String toString() {
	return "PurchaseOrder [orderId=" + orderId + ", company=" + company + ", qty=" + qty + ", price=" + price + "]";
}
public PurchaseOrder() {
	// TODO Auto-generated constructor stub
}
public PurchaseOrder(String orderId, String company, int qty, int price) {
	super();
	this.orderId = orderId;
	this.company = company;
	this.qty = qty;
	this.price = price;
}

}
