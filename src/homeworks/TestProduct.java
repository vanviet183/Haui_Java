package homeworks;

import java.util.*;

public class TestProduct {

	public static void main(String[] args) {
		Product p1 = new Laptop("Dell G3", "2022-11-10", 21_600_000.0);
		Product p2 = new Car("Mercedes G63", "2018-03-06",10_950_000_000.0);
		Product p3 = new TV("LG", "2022-03-10", 25_000_000.0);
		
		List<Product> products = new ArrayList<>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
		
		ProductImpl productImpl = new ProductImpl();
		System.out.println("Sort by name: ");
		productImpl.sortByName(products, true);
		System.out.println(products);
		
		System.out.println("Sort by date of manufacture: ");
		productImpl.sortByDateOfManufacture(products, true);
		System.out.println(products);
		
		System.out.println("Sort by price: ");
		productImpl.sortByPrice(products, true);
		System.out.println(products);
		
		System.out.println("Search product name Mercedes: ");
		System.out.println(productImpl.searchByName(products, "Mer"));
		
	}
}
