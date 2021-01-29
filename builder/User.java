package builder;

public class User {
	
	private final String firstName;
	private final String lastName;
	private final int age;
	private final String address;
	private final int salary;
	
	public User(UserDetails userDetails) {
		this.firstName = userDetails.firstName;
		this.lastName = userDetails.lastName;
		this.age = userDetails.age;
		this.address = userDetails.address;
		this.salary = userDetails.salary;
	}
	
	
	public static class UserDetails{
		
		private String firstName;
		private String lastName;
		private int age;
		private String address;
		private int salary;
				
		public UserDetails firstName(String firstName) {
			this.firstName = firstName;
			return this;
		}
		
		public UserDetails lastName(String lastName) {
			this.lastName = lastName;
			return this;
		}
		
		public UserDetails age(int age) {
			this.age = age;
			return this;
		}
		
		public UserDetails address(String address) {
			this.address = address;
			return this;
		}
		
		public UserDetails salary(int salary) {
			this.salary = salary;
			return this;
		}
		
		public User build() {
			return new User(this);
		}
		
	}


	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", address=" + address
				+ ", salary=" + salary + "]";
	}
	
	

}
