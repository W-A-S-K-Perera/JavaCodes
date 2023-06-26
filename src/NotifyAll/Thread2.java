package NotifyAll;



public class Thread2 extends Thread {
	ThreadNotifytest object;

	public Thread2(ThreadNotifytest object,String name) {
		super(object,name);
		this.object = object;
	}
       
	public void run() {
		synchronized(object) {
			try {
				
				System.out.println("Stated " +Thread.currentThread().getName() + "Wait");
				object.wait();
				System.out.println("Started" + Thread.currentThread().getName() + "notified");
			}catch(InterruptedException e) {
				e.printStackTrace();
				
			}
			for(int i=0;i<10;i++) {
				System.out.println(Thread.currentThread().getName() + " " + i);
			}
		}
		
	}

}
