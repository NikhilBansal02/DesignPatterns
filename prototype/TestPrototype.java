package prototype;

public class TestPrototype {

	public static void main(String[] args) {
		
		Prototype person = new Person("Nikhil", "Bansal");
		
		System.out.println("Actual Person : "+person);
		System.out.println("Hashcode Person:"+person.hashCode());
		
		Prototype cloned = person.clone();
		
		System.out.println("Cloned Person : "+cloned);
		System.out.println("Hashcode Cloned:"+cloned.hashCode());
	}

}
