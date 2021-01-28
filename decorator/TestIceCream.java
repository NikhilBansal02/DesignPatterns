package decorator;

public class TestIceCream {

	public static void main(String[] args) {
		
		BasicIceCream basic = new BasicIceCream();
		System.out.println("Basic Ice-Cream Cost :"+basic.cost());
		
		IceCreamDecorator chocolate = new Chocolate(basic);
		
		System.out.println("Chocolate cost Added :"+chocolate.cost());
		
		IceCreamDecorator mint = new Mint(chocolate);
		
		System.out.println("Mint cost Added :"+mint.cost());
		
	}

}
