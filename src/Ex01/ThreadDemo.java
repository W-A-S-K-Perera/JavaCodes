package Ex01;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create object of child thread
		//TestThread testThread = new TestThread();
		//testThread.start();
		ThreadDemo threadobj = new ThreadDemo();
		threadobj.run();
	
		
		for(int i = 0;i<10;i++) {
			System.out.println("Parent Thread :"+i);
		}

	}
	
	public void run() {
		
		//create object of child thread
				TestThread testThread = new TestThread();
				testThread.start();
		
		for(int j = 0;j<10;j++) {
			System.out.println("Child  Thread2   :" +j);
		}
	}

}
