package mediator;

public abstract class AirCraft {
	
	protected String name;
	protected ATCMediator atcMediator;
	
	public AirCraft(ATCMediator atcMediator, String name) {
		this.atcMediator = atcMediator;
		this.name = name;
		atcMediator.addAirCraft(this);
	}
	
	abstract void send(String message);
	abstract void receive(String message);
	

}
