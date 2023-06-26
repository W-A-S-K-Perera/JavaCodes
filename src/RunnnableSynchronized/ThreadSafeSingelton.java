package RunnnableSynchronized;

public class ThreadSafeSingelton {
	private ThreadSafeSingelton() {
		
	}
	private static ThreadSafeSingelton instance;
	
	public static ThreadSafeSingelton getInstance() {
		if (instance == null) {
			synchronized (ThreadSafeSingelton.class) {
				 if(instance == null) {
					 instance = new ThreadSafeSingelton();
					 System.out.println("Thread safe instance created" + Thread.currentThread().getName());
				 }
			}
		}
		return instance;
		
	}

}
