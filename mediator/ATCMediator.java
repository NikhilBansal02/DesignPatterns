package mediator;

public interface ATCMediator {
	
	void sendMessage(String message, AirCraft airCraft);
	void addAirCraft(AirCraft airCraft);

}
