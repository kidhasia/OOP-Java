package DesignPattern;

public class Singleton2024 {
	
	//Creating private instance
	private static Singleton2024 instance;
	
	//Creating private constructor
	private Singleton2024() {
		
	}
	
	//Creating public singleton method
	public static Singleton2024 getInstance() {
		if(instance == null) {
			instance = new Singleton2024 ();		
		}
		return instance;
	}
	
	
	
	

}
