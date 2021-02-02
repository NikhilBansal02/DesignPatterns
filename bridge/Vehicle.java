package bridge;

abstract class Vehicle {
	
	public WorkShop workshopMake;
	public WorkShop workshopAssemble;
	
	public Vehicle(WorkShop workshopMake, WorkShop workshopAssemble) {
		this.workshopMake = workshopMake;
		this.workshopAssemble = workshopAssemble;
	}
	
	abstract void manufacture();
}
