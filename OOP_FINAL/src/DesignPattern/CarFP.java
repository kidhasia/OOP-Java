package DesignPattern;

public class CarFP implements VehicleFP {

	@Override
	public void drive() {
		System.out.print("Driving a car with 4 wheels");
	}

	@Override
	public void getFuelType() {
		System.out.println("Petrol");
	}
	
	

}
