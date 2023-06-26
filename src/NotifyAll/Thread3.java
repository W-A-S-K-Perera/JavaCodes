package NotifyAll;

public class Thread3 extends Thread {
	ThreadNotifytest object;
	
	public Thread3(ThreadNotifytest object,String name) {
		super(object,name);
		this.object = object;
	}
	public void run() {
		synchronized(object) {
			System.out.println("Notify all thread executed");
			
			object.notifyAll();
		}
	}

}
