package DesignPattern;

public class VehicleFactory {

    public static VehicleFP createVehicle(String vType) {
        if (vType.equals("Car")) {
            return new CarFP(); // No need to create a variable if it's not used
        }
        if (vType.equals("Motobike")) {
            return new MotobikeFP();
        }
        if (vType.equals("Truck")) {
            return new TruckFP();
        }
        return null; // If no match, return null
    }
}
