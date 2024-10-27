package OOPQ1P2;


import java.io.InputStream;
import java.util.Scanner;

class GenericInventory{
	
	 //Generic method for calculate the total
	public <T extends Number> double calculateAverage(T numbArray []) {
		
		
		double total = 0.0;
		
		for(T element : numbArray) {
			total = total+ element.doubleValue();
		}
		double average = total / numbArray.length;
		
		 return average ;
		
		
	}
	
	public <T extends Number> double calculateMin(T numbArray[]) {
		
		double min = numbArray[0].doubleValue();
		
		for(int i =0; i<numbArray.length; i++){
			 
			if(min > numbArray[i].doubleValue()) {
				min = numbArray[i].doubleValue(); 
				
			}
			
		 }

		return min;
		
	}
}

public class InventoryManager{
	public static void main(String[] args) {
		
		//Creating an instance of GenericInventory
		GenericInventory giObj1 = new GenericInventory();
		GenericInventory giObj2 = new GenericInventory();
		
		//Creating a scanner object
		Scanner scanner = new Scanner (System.in);
		
		//Create an array
		
		System.out.print("Enter the size of the array: ");
		int arraySize = scanner.nextInt();
		
		Double [] numbers = new Double [arraySize];	
		
		for(int i=0; i<arraySize; i++) {
			System.out.print("Enter values: ");
			numbers[i] = scanner.nextDouble();
		}
		
		double average  = giObj1.calculateAverage(numbers);
		double min = giObj2.calculateMin(numbers);
		
		System.out.print("Average is: "+average+"\n");
		System.out.print("Minimum is: "+min);
		
		
		
		
	}
}
 class GenericInventory{
	 
	 //Creating a bound array
	 public <T extends Number> void calculateAvaerage(T [] numArray) {
		 
		 
	 }
	 
	 public <T extends Number> void calculateMinimum(T [] numArray) {
		 
		 
	 }
	
}


public class InventoryManager{
	
}
