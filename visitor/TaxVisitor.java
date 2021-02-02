package visitor;

public class TaxVisitor implements Visitor {

	@Override
	public double visit(Shirt shirt) {
		
		return (shirt.getPrice() * 0.10) + shirt.getPrice(); 
	}

	@Override
	public double visit(TShirt tshirt) {
		return (tshirt.getPrice() * 0.20) + tshirt.getPrice(); 
	}

	@Override
	public double visit(Jacket jacket) {
		return (jacket.getPrice() * 0.05) + jacket.getPrice(); 
	}

}
