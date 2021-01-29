package proxy;

public class TestProxy {

	public static void main(String[] args) {
		
		ATMProxy atmProxy = new ATMProxy();
		
		try {
			atmProxy.withdrawMoney("ajay");
			atmProxy.withdrawMoney("nikhil");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
