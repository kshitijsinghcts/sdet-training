package day6;

public class ThreadTest {

	public static void main(String[] args) throws InterruptedException {
		Car car = new Car();					// create instance
		Thread carThread = new Thread(car);		// pass to thread
		carThread.start();						// start thread
		carThread.join(); 						// ends thread
	}

}
