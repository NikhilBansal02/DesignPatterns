package mediator;

import java.util.ArrayList;
import java.util.List;

public class ATCMediatorImpl implements ATCMediator {
	
	private List<AirCraft> airCrafts = null;

	public ATCMediatorImpl() {
		airCrafts = new ArrayList<AirCraft>();
	}

	@Override
	public void sendMessage(String message, AirCraft airCraft) {
		
		for(AirCraft a: airCrafts) {
			if(a != airCraft) {
				a.receive(message);
			}
		}
		
	}

	@Override
	public void addAirCraft(AirCraft airCraft) {
		airCrafts.add(airCraft);
	}

}
