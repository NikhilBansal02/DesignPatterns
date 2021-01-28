package factory;

public class TestNotification {
	
		public static void main(String[] args) {
			NotificationFactory factory = new NotificationFactory();
			Notification notification = factory.getInstance("sms");
			if(notification !=null) notification.notification();
			
			notification= factory.getInstance("push");
			if(notification !=null) notification.notification();
			
			notification= factory.getInstance("email");
			if(notification !=null) notification.notification();
			
			notification= factory.getInstance("abcd");
			if(notification !=null) notification.notification();
		}
		
}
