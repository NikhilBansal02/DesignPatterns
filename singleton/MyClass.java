package singleton;

//This is for Lazy Initialization of Singletons DP.
public class MyClass {
	
	private static MyClass myClass;
	
	private MyClass() {
		
	}
		
	public static MyClass getInstance() {
		if(myClass == null) {
			myClass = new MyClass();
		}
		
		return myClass;
	}
}
