package Runnable;

import Ex01.TestThread;

public class Threaddemo extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threaddemo threddemo = new Threaddemo();
		threddemo.start();
		
		for(int i = 0;i<10;i++) {
			System.out.println("Parent Thread :"+i);
		}
	}
	public void run() {
		
		//create object of child thread
				TestThread testThread = new TestThread();
				Thread thread = new Thread(testThread);
				thread.start();
		
		for(int j = 0;j<10;j++) {
			System.out.println("Child  Thread2   :" +j);
		}
	}

}
