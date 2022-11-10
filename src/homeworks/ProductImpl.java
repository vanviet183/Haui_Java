package homeworks;

import java.util.*;

public class ProductImpl implements IProduct {

	@Override
	public void sortByName(List<Product> products, boolean isINC) {
		if (isINC) {
			Collections.sort(products, new sortByName());
		} else {
			Collections.sort(products, new sortByName().reversed());
		}
	}

	@Override
	public void sortByDateOfManufacture(List<Product> products, boolean isINC) {
		if (isINC) {
			Collections.sort(products, new sortByDateOfManufacture());
		} else {
			Collections.sort(products, new sortByDateOfManufacture().reversed());
		}
	}

	@Override
	public void sortByPrice(List<Product> products, boolean isINC) {
		if (isINC) {
			Collections.sort(products);
		} else {
			Collections.sort(products, Collections.reverseOrder());
		}
	}

	@Override
	public Product searchByName(List<Product> products, String name) {
		for (Product product : products) {
			if (product.getName().contains(name)) {
				return product;
			}
		}
		return null;
	}

	@Override
	public Product searchByDateOfManufacture(List<Product> products, String date) {
		for (Product product : products) {
			if (product.getDateOfManufacture().contains(date)) {
				return product;
			}
		}
		return null;
	}

	@Override
	public Product searchByPrice(List<Product> products, Double price) {
		for (Product product : products) {
			if (price >= product.getPrice() - 500_000 && price <= product.getPrice() + 500_000) {
				return product;
			}
		}
		return null;
	}

}

class sortByName implements Comparator<Product> {
	@Override
	public int compare(Product o1, Product o2) {
		return o1.getName().compareTo(o2.getName());
	}
}

class sortByDateOfManufacture implements Comparator<Product> {
	@Override
	public int compare(Product o1, Product o2) {
		return o1.getDateOfManufacture().compareTo(o2.getDateOfManufacture());
	}
}
