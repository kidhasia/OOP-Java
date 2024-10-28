package Threads;

public class ObservationController {
	public static void main(String[] args) {
		
		Object lock = new Object();
		
		Thread TeleThread = new Telescope(lock,5);
		Thread SateThread = new Satellite(lock,5);
		
		TeleThread.start();
		SateThread.start();
		
		try {
			TeleThread.join();
			SateThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

		
	}

}
