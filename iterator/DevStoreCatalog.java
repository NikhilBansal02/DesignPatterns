package iterator;

public class DevStoreCatalog {
	
	private static final int MAX_ITEMS = 4;
	private int numberOfProducts = 0;
	Product[] catalog;
	
	public DevStoreCatalog() {
		
		catalog = new Product[MAX_ITEMS];
		addItem("C++", "T-Shirt",100);
		addItem("Java", "Cap",50);
		addItem("Python", "Mouse Pad",800);
		addItem("HTML", "Book",200);
		
		
	}

	public void addItem(String name, String description, double price) {
		Product product = new Product(name, description, price);
		
		if(numberOfProducts >= MAX_ITEMS) {
			System.out.println("Catalog is full");
		}else {
			catalog[numberOfProducts] = product;
			numberOfProducts++;
			
		}
		
	}
	
	public DevStoreIterator getIterator() {
		return new DevStoreIterator(catalog);
	}
	
	
}
