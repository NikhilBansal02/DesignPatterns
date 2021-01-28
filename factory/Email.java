package factory;

public class Email implements Notification{

	@Override
	public void notification() {
		System.out.println("Email notification");
	}

}
