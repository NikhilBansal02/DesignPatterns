package proxy;

public class RealBank implements Bank {

	@Override
	public void withdrawMoney(String ClientName) throws Exception {
		System.out.println(ClientName +" is withdrawing money from ATM...");
	}

}
