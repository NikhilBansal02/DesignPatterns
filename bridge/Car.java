package bridge;

public class Car extends  Vehicle {
	
	public Car(WorkShop workshopMake, WorkShop workshopAssemble) {
		super(workshopMake, workshopAssemble);
	}

	@Override
	void manufacture() {
		System.out.println("Maunfacturing Car in Workshop");
		workshopMake.stateOfmanufacture();
		workshopAssemble.stateOfmanufacture();
	}

}
