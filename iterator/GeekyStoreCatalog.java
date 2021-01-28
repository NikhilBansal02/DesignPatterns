package iterator;

import java.util.ArrayList;

public class GeekyStoreCatalog {
	
	ArrayList<Product> catalog;
	
	public GeekyStoreCatalog() {
		
		catalog = new ArrayList<>();
		
		addItem("Superman", "T-Shirt",100);
		addItem("Batman", "Cap",50);
		addItem("Iron-Man", "Mouse Pad",800);
		addItem("He-Man", "Box",200);
		
	}

	public void addItem(String name, String description, double price) {
		Product product = new Product(name, description, price);
			catalog.add(product);
	}
	
	public GeekyStoreIterator getIterator() {
		return new GeekyStoreIterator(catalog);
	}
	
}
