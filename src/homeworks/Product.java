package homeworks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Product implements Comparable<Product> {

	private String name;
	private String dateOfManufacture;
	private Double price;

	public Product() {

	}

	public Product(String name, String dateOfManufacture, Double price) {
		super();
		this.name = name;
		this.dateOfManufacture = dateOfManufacture;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateOfManufacture() {
		return dateOfManufacture;
	}

	public void setDateOfManufacture(String dateOfManufacture) {
		this.dateOfManufacture = dateOfManufacture;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	@Override
	public int compareTo(Product o) {
		return (int) (this.getPrice() - o.getPrice());
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", dateOfManufacture=" + dateOfManufacture + ", price=" + price + "]";
	}
}

