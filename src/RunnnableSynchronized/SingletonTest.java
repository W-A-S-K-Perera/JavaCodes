package RunnnableSynchronized;

public class SingletonTest implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(new SingletonTest()).start();
		
		for(int i=0;i<10;i++) {
			Singelton.getInstance();
			ThreadSafeSingelton.getInstance();
		}

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			Singelton.getInstance();
			ThreadSafeSingelton.getInstance();
		}
	}

}
