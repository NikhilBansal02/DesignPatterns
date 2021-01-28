package decorator;

public class Chocolate extends IceCreamDecorator{

	public Chocolate(IceCream iceCream) {
		super(iceCream);
	}
	
	@Override
	public double cost() {
		return 15 + super.cost();
	}
	
	
}
