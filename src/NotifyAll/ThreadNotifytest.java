package NotifyAll;

public class ThreadNotifytest extends Thread {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		ThreadNotifytest threadnotifytest = new ThreadNotifytest();
		Thread1 t1 = new Thread1(threadnotifytest , "New Thread1 ");
		Thread2 t2 = new Thread2(threadnotifytest , "New Thread2 ");
		Thread3 t3 = new Thread3(threadnotifytest , "New Thread3 ");
		t1.start();
		t2.start();
		t3.start();

	}

}
