package day6;

public class Car implements Runnable {
	public void run() {
		System.out.println("Hello from Car Thread!");
		synchronized (this) {
			System.out.println("Hello from the Car Thread! This is synchronized so only this thread can access this right now and no others.");
		}
	}
}
