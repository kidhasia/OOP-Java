package DesignPattern;

public class MotobikeFP implements VehicleFP {

	@Override
	public void drive() {
		System.out.print("Driving a car with 2 wheels");
	}

	@Override
	public void getFuelType() {
		System.out.print("Petrol");
	}

}
