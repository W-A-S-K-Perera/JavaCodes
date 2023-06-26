package ThreadWaitNotify;

public class ThreadNotifytest extends Thread {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ThreadNotifytest threadnotify = new ThreadNotifytest();
		Thread1 t1= new Thread1(threadnotify,"new thread1");
		Thread2 t2= new Thread2(threadnotify,"new thread2");
		
		t1.start();
		t2.start();

	}

}
