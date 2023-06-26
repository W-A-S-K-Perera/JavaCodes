package ThreadSynchronizedBolckWithLock;



class Sample{
	public void displayOutput(Sample sample) {
		synchronized (new Sample ()) {
			try {
				for(int i=0; i<10; i++) {
					Thread.sleep(1000);
					System.out .println(Thread.currentThread().getName());
				}
				
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			
		}
	}
}


public class ThreadImplements  extends Thread{
	
	Sample sample;
	String name ;
	public static final String THREAD0 ="Thread 0";
	public static final String THREAD1 ="Thread 1";
	
	

	public ThreadImplements(Sample sample, String name) {
		//super();
		this.sample = sample;
		this.name = name;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample sample = new Sample();
		ThreadImplements threadImpl1 = new ThreadImplements(sample, THREAD0);
		ThreadImplements threadImpl2 = new ThreadImplements(sample, THREAD1);
		
		threadImpl1.start();
        threadImpl2.start();
	}
    public void run() {
	sample.displayOutput(sample);
    }

	

}
