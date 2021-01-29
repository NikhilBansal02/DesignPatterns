package mediator;

public class TestMediator {

	public static void main(String[] args) {
			
		//Creating ATCMediator
		ATCMediator atcMediator = new ATCMediatorImpl();
		
		//Creating AirCrafts
		AirCraft Boing707 = new AirCraftImpl(atcMediator, "Boeing 707");
		AirCraft Boing110 = new AirCraftImpl(atcMediator, "Boeing 110");
		AirCraft Delta = new AirCraftImpl(atcMediator, "Delta");
		AirCraft MachOne = new AirCraftImpl(atcMediator, "MachOne");
		
//		atcMediator.addAirCraft(Boing707);
//		atcMediator.addAirCraft(Boing110);
//		atcMediator.addAirCraft(Delta);
//		atcMediator.addAirCraft(MachOne);
		
		Boing707.send("Hello, Fellow Pilots. This is Boeing 707.");
		
		
		
	}

}
