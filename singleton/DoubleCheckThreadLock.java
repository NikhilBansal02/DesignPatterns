package singleton;

public class DoubleCheckThreadLock {
	
private static DoubleCheckThreadLock doubleCheckThreadLock;
	
	private DoubleCheckThreadLock() {
		
	}
		
	public static DoubleCheckThreadLock getInstance() {
		if(doubleCheckThreadLock == null) {
			synchronized(DoubleCheckThreadLock.class) {
				if(doubleCheckThreadLock == null) {
					doubleCheckThreadLock = new DoubleCheckThreadLock();
				}
			}
		}
		
		return doubleCheckThreadLock;
	}

}
