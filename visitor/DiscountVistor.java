package visitor;

public class DiscountVistor implements Visitor {

	@Override
	public double visit(Shirt shirt) {
		
		return (shirt.getPrice() * 0.05); 
	}

	@Override
	public double visit(TShirt tshirt) {
		return (tshirt.getPrice() * 0.05); 
	}

	@Override
	public double visit(Jacket jacket) {
		return (jacket.getPrice() * 0.05); 
	}

}

