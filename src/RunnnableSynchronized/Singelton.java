package RunnnableSynchronized;

public class Singelton {
	 private Singelton() {
		 
	 }
	 public static Singelton instance;
	 public static Singelton getInstance() {
		 if(instance == null) {
			 instance = new Singelton();
			 System.out.println("Instance created" + Thread.currentThread().getName());
		 }
		 return instance;
	 }

}
