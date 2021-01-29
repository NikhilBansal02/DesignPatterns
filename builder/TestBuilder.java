package builder;

public class TestBuilder {

	public static void main(String[] args) {
		
		User user = new User.UserDetails()
				.firstName("nikhil")
				.lastName("bansal")
				.age(30)
				.address("Meerut")
				.salary(500)
				.build();
		
		System.out.println(user);
	}

}
