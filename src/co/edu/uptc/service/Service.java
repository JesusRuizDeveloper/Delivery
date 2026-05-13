package co.edu.uptc.service;
import java.util.HashMap;

import javax.swing.JOptionPane;

import co.edu.uptc.domain.Order;
import co.edu.uptc.domain.Restaurant;
import co.edu.uptc.enums.OrderCategory;
import co.edu.uptc.repository.Repository;

public class Service {
	Repository repository = new Repository();
	HashMap<String, Restaurant> restaurants = repository.getRestaurants();
	
	public String totalCost(Restaurant restaurant, String idOrder) {
		Order total = restaurant.getOrders().get(idOrder);
		
		return "";
	}
	
	public String addOrder(String idOrder, String idRestaurant, String productName, OrderCategory orderCategory, float basePrice, float quantity) {
		if (basePrice <= 0) {
			return "El precio debe mayor que 0.";
		}else if(quantity <= 0) {
			return "La cantidad de productos debe ser mayor o igual a cero.";
		}else if(productName == "") {
			return "El nombre no puede estar vacio.";
		}
		restaurants.get(idRestaurant).getOrders().put(idOrder, new Order(idOrder, productName, orderCategory, basePrice, quantity));
		return "La orden fue agregada";
	}
	
	public String totalOrders(String idRestaurant) {
		if(restaurants.containsValue(idRestaurant)) {
			return "El restaurante seleccionado no existe.";
		}
		return "El total de ordenes del restaurante " + restaurants.get(idRestaurant).getName() + " es: " + restaurants.get(idRestaurant).quantityOrders();
	}
}
