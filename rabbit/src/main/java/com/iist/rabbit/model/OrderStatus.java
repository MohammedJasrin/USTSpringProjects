package com.iist.rabbit.model;

public class OrderStatus {
private PurchaseOrder order;
private String status;
private String message;
public PurchaseOrder getOrder() {
	return order;
}
public void setOrder(PurchaseOrder order) {
	this.order = order;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public OrderStatus(PurchaseOrder order, String status, String message) {
	super();
	this.order = order;
	this.status = status;
	this.message = message;
}
public OrderStatus() {
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "OrderStatus [order=" + order + ", status=" + status + ", message=" + message + "]";
}


}
