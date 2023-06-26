package ThreadWaitNotify;

public class Thread1 extends Thread {
	ThreadNotifytest object;

	public Thread1(ThreadNotifytest object,String name) {
		super(object,name);
		this.object = object;
	}
       
	public void run() {
		synchronized(object) {
			try {
				
				System.out.println("Stated " +Thread.currentThread().getName() + "Wait");
				object.wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
				
			}
			for(int i=0;i<10;i++) {
				System.out.println(Thread.currentThread().getName() + " " + i);
			}
		}
		
	}
       
}
