package visitor;

public interface Visitor {
	
	double visit(Shirt shirt);
	double visit(TShirt tshirt);
	double visit(Jacket jacket);

}
