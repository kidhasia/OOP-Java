package OOPQ1P2;

import java.util.Scanner;

class GenericIventory{
	
	//Generic method to calculate maximum number
	public <T extends Number> double calculateMaximun(T [] arrayNumb) {
		
		double maxNum = arrayNumb[0].doubleValue();
		
		for(int i=0; i<arrayNumb.length; i++) {
			if(maxNum < arrayNumb[i].doubleValue()) {
			
				maxNum = arrayNumb[i].doubleValue(); 
				
			}
		}
		return maxNum;	
	}
	
	public <T extends Number> double calculateProduct(T [] arrayNumb) {
		
		double product = 1;
		double total = 0;
		
		for (T number: arrayNumb) {
			product *= number.doubleValue();
		}
		
		return product;
				
	}

	
}
public class OOP2024Q2{
	
		public static void main(String[] args) {
					
			//Instance of GenericInventory
			
			GenericIventory GObj1 = new GenericIventory();		
			GenericIventory GObj2 = new GenericIventory();		
			
			//Creating a Scanner object
			Scanner scanner = new Scanner(System.in);
			
			//User input
			System.out.print("Enter the size of the array: ");
//			
			
			//Creating an array to store user inputs
			Double [] productArray = new Double [scanner.nextInt() ];
			
			for(int i=0; i<scanner.nextInt() ;i++) {
				System.out.print("Enter product numbers: ");
				productArray[i] = scanner.nextDouble();
				
			}
			
			Double productMax =  GObj1.calculateMaximun(productArray);
			Double productTotal =  GObj2.calculateProduct(productArray);
			
			System.out.println();
			System.out.println("Product maximum is: "+productMax);
			System.out.println("Product Total is: "+productTotal);
			
			
			
		
	
}
}
