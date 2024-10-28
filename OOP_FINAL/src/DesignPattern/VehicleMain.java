package DesignPattern;

import java.util.Scanner;

public class VehicleMain {

	public static void main(String[] args) {
		

		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Enter Vehicle type: ");
		String type = scanner.next();
		
		VehicleFP vehicle =  VehicleFactory.createVehicle(type);
	
		if (vehicle != null) {
            vehicle.drive();
            vehicle.getFuelType();
        } 
		
		
		
	}
}
