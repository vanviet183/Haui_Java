package homeworks;

import java.util.List;

public interface IProduct {

	void sortByName(List<Product> products, boolean isINC);
	
	void sortByDateOfManufacture(List<Product> products, boolean isINC);
	
	void sortByPrice(List<Product> products, boolean isINC);
	
	Product searchByName(List<Product> products, String name);
	
	Product searchByDateOfManufacture(List<Product> products, String date);
	
	Product searchByPrice(List<Product> products, Double price);
	
}
