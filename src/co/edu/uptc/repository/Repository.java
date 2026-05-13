package co.edu.uptc.repository;
import java.util.HashMap;
import co.edu.uptc.domain.Order;
import co.edu.uptc.domain.Restaurant;

public class Repository {
	private HashMap<String, Restaurant>restaurants;
	
	public void addRestaurant(String name, String id) {
		HashMap<String, Order> orders = new HashMap<>();
		restaurants.put(id, new Restaurant(id, name, orders));
	}

	public HashMap<String, Restaurant> getRestaurants() {
		return restaurants;
	}
	
	
}
