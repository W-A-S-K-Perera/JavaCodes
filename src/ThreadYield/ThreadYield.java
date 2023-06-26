package ThreadYield;



public class ThreadYield extends Thread{
	
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("Started executing " + t.getName());
		
		for(int i = 0;i<10;i++) {
			System.out.println(t.getName()+i);
		}
		System.out.println("Finished executing " + t.getName());
	}


	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Thread t = new  Thread(new ThreadYield(),"New Thread");
		t.start();
		System.out.println("Started executing main Thread" );
		t.yield();//temporallely stop excuting main thread and give chance to newly created thread
		
		for(int i = 0;i<10;i++) {
			System.out.println(Thread.currentThread().getName() + i);
		}
		System.out.println("Finished executing  " + Thread.currentThread().getName());
		//System.out.println();

	}

}
