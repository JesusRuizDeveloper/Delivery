package co.edu.uptc.domain;
import javax.swing.JOptionPane;

import co.edu.uptc.enums.OrderCategory;

public class Order {
	private String idOrder;
	private String productName;
	private OrderCategory orderCategory;
	private float basePrice;
	private float quantity;
	
	public Order() {
		super();
	}

	

	public Order(String idOrder, String productName, OrderCategory orderCategory, float basePrice, float quantity) {
		super();
		this.idOrder = idOrder;
		this.productName = productName;
		this.orderCategory = orderCategory;
		this.basePrice = basePrice;
		this.quantity = quantity;
	}



	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public OrderCategory getOrderCategory() {
		return orderCategory;
	}

	public void setOrderCategory(OrderCategory orderCategory) {
		this.orderCategory = orderCategory;
	}

	public float getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(float basePrice) {
		this.basePrice = basePrice;
	}

	public float getQuantity() {
		return quantity;
	}

	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}



	public String getIdOrder() {
		return idOrder;
	}



	public void setIdOrder(String idOrder) {
		this.idOrder = idOrder;
	}
	
	
	
	
	
	
}
