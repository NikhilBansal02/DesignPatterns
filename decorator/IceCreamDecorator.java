package decorator;

public class IceCreamDecorator implements IceCream {
	
	public IceCream iceCream;
	
	public IceCreamDecorator(IceCream iceCream) {
		this.iceCream = iceCream;
	}
	
	@Override
	public double cost() {
		return iceCream.cost();
	}

}
