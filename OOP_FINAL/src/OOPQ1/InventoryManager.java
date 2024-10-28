package OOPQ1;

import java.util.Scanner;

public class InventoryManager {
	
	public static void main(String[] args) {

		GenericInventory <Integer> GenInvInt = new GenericInventory();
		GenericInventory <Double> GenInvDouble = new GenericInventory();

		Scanner scanner = new Scanner(System.in);
		
		Integer [] intArray = {1,2,3,4,5,6,7};
		
		Double [] doubleArray = {1.1,2.2,3.3,4.3,5.5,6.7,7.8};

		GenInvInt.calculateAverage(intArray);
		GenInvDouble.calculateAverage(doubleArray);
		
		GenInvInt.calculateMinimum(intArray);
		GenInvDouble.calculateMinimum(doubleArray);
		
		System.out.print("Average is: "+GenInvInt.calculateAverage(intArray));
		
	}
	
	
}
//Creating objects to generic class
// Generic_Class_name <Data_Type> name = new Generic_Class_name();
// int arrayName [] = {1,2,3,4,5};