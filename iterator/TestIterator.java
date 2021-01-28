package iterator;

public class TestIterator {

	public static void main(String[] args) {
		
		DevStoreCatalog devStoreCatalog = new DevStoreCatalog();
		GeekyStoreCatalog geekyStoreCatalog  = new GeekyStoreCatalog();
		
		Seller seller = new Seller(devStoreCatalog, geekyStoreCatalog);
		seller.printCatalog();
		
	}
	
}
