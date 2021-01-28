package decorator;

public class Mint extends IceCreamDecorator {

	public Mint(IceCream iceCream) {
		super(iceCream);
	}
	
	@Override
	public double cost() {
		return 15 + super.cost();
	}

}
