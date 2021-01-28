package singleton;
import singleton.DoubleCheckThreadLock;
import singleton.EagerInitialization;
import singleton.MyClass;
import singleton.ThreadSafeSingleton;

public class TestSingletons {

	public static void main(String[] args) {
		
		MyClass obj1 = MyClass.getInstance();
		MyClass obj2 = MyClass.getInstance();
		
		System.out.println(obj1);
		System.out.println(obj2);
		
		EagerInitialization first = EagerInitialization.getInstance();
		EagerInitialization second = EagerInitialization.getInstance();
		System.out.println("First :"+first);
		System.out.println("Second:"+second);
		
		ThreadSafeSingleton t1 = ThreadSafeSingleton.getInstance();
		ThreadSafeSingleton t2 = ThreadSafeSingleton.getInstance();
		System.out.println("ThreadSafeSingleton :"+t1);
		System.out.println("ThreadSafeSingleton :"+t2);
		
		DoubleCheckThreadLock d1 = DoubleCheckThreadLock.getInstance();
		DoubleCheckThreadLock d2 = DoubleCheckThreadLock.getInstance();
		System.out.println("DoubleCheckThreadLock :"+d1);
		System.out.println("DoubleCheckThreadLock :"+d2);
		
		
	}

}
