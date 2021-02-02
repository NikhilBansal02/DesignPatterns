package bridge;

public class TestBridge {

	public static void main(String[] args) {

		Vehicle car = new Car(new Make(), new Assemble());
		car.manufacture();

		Vehicle bike = new Bike(new Make(), new Assemble());
		bike.manufacture();

	}

}
