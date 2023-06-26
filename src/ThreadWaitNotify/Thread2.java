package ThreadWaitNotify;

public class Thread2 extends Thread {
	
	ThreadNotifytest object;

	public Thread2(ThreadNotifytest object,String name) {
		super(object,name);
		this.object = object;
	}
	
	public void run() {
		synchronized(object) {
			System.out.println(Thread.currentThread().getName()+ "notify thread");
			object.notify();
		}
	}
	
	

}
