package proxy;

import java.util.ArrayList;
import java.util.List;

public class ATMProxy implements Bank {
	
	private RealBank realBank = new RealBank();
	private static List<String> bannedClients = new ArrayList<String>();
	
	static {
		
		bannedClients.add("nikhil");
		bannedClients.add("mukesh");
	}
	

	@Override
	public void withdrawMoney(String ClientName) throws Exception {
		
		if(bannedClients.contains(ClientName.toLowerCase())) {
			throw new Exception(ClientName +" bad client");
		}
		
		realBank.withdrawMoney(ClientName);
		System.out.println("Withdrwan completed..Please collect your cash.");
	}

}
