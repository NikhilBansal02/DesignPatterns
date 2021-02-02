package visitor;

public class TestVisitor {

	public static void main(String[] args) {
		
		//Create a visitor first to add Tax on item.
		TaxVisitor taxVisitor = new TaxVisitor();
		DiscountVistor discountVistor = new DiscountVistor();
		
		//Create Items
		Jacket jacket = new Jacket(5000); 
		Shirt shirt = new Shirt(1200);
		TShirt tshirt = new TShirt(1500);
		
		System.out.println("Final price after tax for Jacket: "+ jacket.accept(taxVisitor));
		System.out.println("Final price after tax for Jacket plus discount: "+ (jacket.accept(taxVisitor) - jacket.accept(discountVistor)));
		
		System.out.println("Final price after tax for shirt: "+ shirt.accept(taxVisitor));
		System.out.println("Final price after tax for shirt plus discount: "+ (shirt.accept(taxVisitor) - shirt.accept(discountVistor)));
		
		System.out.println("Final price after tax for TShirt: "+ tshirt.accept(taxVisitor));
		System.out.println("Final price after tax for TShirt plus discount: "+ (tshirt.accept(taxVisitor)  - tshirt.accept(discountVistor)));
		
	}	
	

}
