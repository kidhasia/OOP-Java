package Threads;

public class Telescope extends Thread {
	
	private Object lock;
	private int counter;
	
	public Telescope(Object lock, int counter) {
		super();
		this.lock = lock;
		this.counter = counter;
	}
	
	public void run() {
		synchronized(lock) {
			for(int i=0; i<=counter; i++) {
				System.out.println("Telescope Observing");
			}
			System.out.println();
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			lock.notify();
			try {
				lock.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
		

}
