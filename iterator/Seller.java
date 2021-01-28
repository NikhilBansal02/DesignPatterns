package iterator;

public class Seller {
	
	private DevStoreCatalog devStoreCatalog;
	private GeekyStoreCatalog geekyStoreCatalog;
	
	public Seller(DevStoreCatalog devStoreCatalog, GeekyStoreCatalog geekyStoreCatalog) {
		this.devStoreCatalog = devStoreCatalog;
		this.geekyStoreCatalog = geekyStoreCatalog;
	}
	
	public void printCatalog() {
		
		Iterator devIterator = devStoreCatalog.getIterator();
		Iterator geekyIterator = geekyStoreCatalog.getIterator();
		printCatalog(devIterator,geekyIterator);
		
	}

	private void printCatalog(Iterator devIterator, Iterator geekyIterator) {
			
		while(devIterator.hasNext()) {
			Product product = (Product)devIterator.next();
			System.out.println(product);
		}
		
		while(geekyIterator.hasNext()) {
			Product product = (Product)geekyIterator.next();
			System.out.println(product);
		}
		
	}
	
	

}
