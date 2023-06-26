package Runnable;

public class TestThread implements Runnable{
	
	public void run() {
		for(int j = 0;j<10;j++) {
			System.out.println("Child  Thread :"+j);
		}
	}

}
