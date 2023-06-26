package Ex01;

public class TestThread extends Thread{

	public void run() {
		for(int j = 0;j<10;j++) {
			System.out.println("Child  Thread :"+j);
		}
	}
}
