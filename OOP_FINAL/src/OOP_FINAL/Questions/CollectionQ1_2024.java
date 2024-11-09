package OOP_FINAL.Questions;

import java.util.HashMap;
import java.util.Scanner;

public class CollectionQ1_2024 {
	public static void main(String[] args) {
		

		//Creating a HashMap
		HashMap <Integer, String> studentMap = new HashMap();
		
		Scanner sc = new Scanner (System.in);
		
		//Accepting User Inputs
		while(true) {
			System.out.print("Enter Student ID(To exit enter -99) : ");
			int stdID = sc.nextInt();
			
			if(stdID == -99) {
				break;
			}
			System.out.print("Enter Student Name : ");
			String stdName = sc.next();
			System.out.println();
			
			//Adding to studentMap
			studentMap.put(stdID, stdName);
			
		}

		System.out.println(studentMap);
		
		System.out.print("Enter ID to remove: ");
		int rstdID = sc.nextInt();
		
		//Checking whether that ID is containing in HashMap
		boolean isTrue = studentMap.containsKey(rstdID);
		
		if(isTrue == true) {
			studentMap.remove(rstdID);
			System.out.print("Student ID "+rstdID+" is Successfully removed!");
			System.out.println();

		}
		else {
			System.out.print(" Product not found");
			System.out.println();

		}
		
		//Display the total number of students
		System.out.print("Total number of students : "+ studentMap.size());
		System.out.println();
		
		//Printing all the remaining number of students
		for(Integer i : studentMap.keySet()){
			System.out.print("Student ID: "+i+" Student Name: "+studentMap.get(i));
			System.out.println();	
		}
		
		
	}

}
