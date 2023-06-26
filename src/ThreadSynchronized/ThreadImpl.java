package ThreadSynchronized;

public class ThreadImpl extends Thread{
	
	Sample sample;
	String name ;
	public static final String THREAD0 ="Thread 0";
	public static final String THREAD1 ="Thread 1";
	
	

	public ThreadImpl(Sample sample, String name) {
		//super();
		this.sample = sample;
		this.name = name;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sample sample = new Sample();
		ThreadImpl threadImpl1 = new ThreadImpl(sample, THREAD0);
		ThreadImpl threadImpl2 = new ThreadImpl(sample, THREAD1);
		
		threadImpl1.start();
        threadImpl2.start();
	}
    public void run() {
	sample.displayOutput(sample);
    }
}
