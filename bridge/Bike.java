package bridge;

public class Bike extends  Vehicle {
	
	public Bike(WorkShop workshopMake, WorkShop workshopAssemble) {
		super(workshopMake, workshopAssemble);
	}

	@Override
	void manufacture() {
		System.out.println("Maunfacturing Bike in Workshop");
		workshopMake.stateOfmanufacture();
		workshopAssemble.stateOfmanufacture();
	}

}
