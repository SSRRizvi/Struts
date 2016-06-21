package com.orders.model;
/**
 * Model to store data
 * @author SRizvi2
 *
 */
public class Order {
	
	String orderId;
	String message;
	String items;
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getItems() {
		return items;
	}
	public void setItems(String items) {
		this.items = items;
	}
	
	

}
