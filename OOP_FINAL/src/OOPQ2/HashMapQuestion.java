package OOPQ2;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapQuestion {
	public static void main(String[] args) {
		
		//Create a HashMap
		HashMap<Integer, String> studentRecords = new HashMap();
		
		//Create a scanner object
		Scanner scanner = new Scanner(System.in);
		int stdID =0;
		String stdName= null;
		
		while(true) {
			System.out.print("Enter Student ID (To exit enter -99): ");
			stdID = scanner.nextInt();
			
			if(stdID== -99) {
				break;
			}
			System.out.print("Enter Student name: ");
			 stdName = scanner.next();
			
			//Add details to HashMap
			studentRecords.put(stdID, stdName);
			
		}
		System.out.println(studentRecords);
		
		System.out.println("Enter 1 to remove details: ");
		int des = scanner.nextInt();
		
		if(des == 1) {
			System.out.print("Enter student ID to remove: ");
			int stdID1 = scanner.nextInt();
			if( studentRecords.containsKey( stdID1 )) {
				studentRecords.remove( stdID1 );
				
			}
			
			System.out.println(studentRecords);

			
			
		}
		
	}

}
