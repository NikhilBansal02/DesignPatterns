package prototype;

public class Person implements Prototype{
	
	private String firstName;
	private String lastName;
	
	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Person clone() {// Return type Person is sub-type of Prototype type. 
							//This is covariant types in aaction.
		return new Person(firstName,lastName);
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
}
