package DesignPattern;

public class TruckFP implements VehicleFP {

	@Override
	public void drive() {
		System.out.print("Driving a truck with 8 wheels");
	}

	@Override
	public void getFuelType() {
		System.out.println("Diesel");
	}

}
