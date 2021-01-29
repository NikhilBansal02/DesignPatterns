package mediator;

public class AirCraftImpl extends AirCraft{

	public AirCraftImpl(ATCMediator atcMediator, String name) {
		super(atcMediator,name);
	}
	
	@Override
	void send(String message) {
		
		System.out.println(this.name +" : Sending Message: "+ "\"" +message+"\"");
		atcMediator.sendMessage(message, this);
	}

	@Override
	void receive(String message) {
		System.out.println(name +" : Received Message: " +message);
		
	}

}
