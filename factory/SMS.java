package factory;

public class SMS implements Notification{

	@Override
	public void notification() {
		System.out.println("SMS notification");
	}

}
