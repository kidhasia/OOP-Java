package DesignPattern;

public class DatabaseConnection {
	
	//Private instance creation
	private static DatabaseConnection instance = new DatabaseConnection();

	private DatabaseConnection() {
		// TODO Auto-generated constructor stub
	}
	
	//Public method to access instance 
	public static DatabaseConnection getInstance() {
		
		if(instance == null) {
			
			instance =  new DatabaseConnection();
		}

		return instance;
		
	}
	
	

}
