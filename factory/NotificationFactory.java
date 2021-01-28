package factory;

public class NotificationFactory {
	
	Notification notification = null;
	
	public Notification getInstance(String type) {
		notification = null;
				
		if(type.equalsIgnoreCase("SMS")) {
			notification = new SMS();
		}else if(type.equalsIgnoreCase("Push")) {
			notification = new Push();
		}else if(type.equalsIgnoreCase("Email")) {
			notification = new Email();
		}	
		
		return notification;
		
	}
	

}
