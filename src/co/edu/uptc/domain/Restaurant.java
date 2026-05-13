package co.edu.uptc.domain;
import java.util.HashMap;

public class Restaurant {
	private String id;
	private String name;
	private HashMap<String, Order>orders;
	public Restaurant() {
		super();
	}
	
	public Restaurant(String id, String name, HashMap<String, Order> orders) {
		super();
		this.id = id;
		this.name = name;
		this.orders = orders;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public HashMap<String, Order> getOrders() {
		return orders;
	}

	public int quantityOrders() {
		return orders.size();
	}
	
	
}
