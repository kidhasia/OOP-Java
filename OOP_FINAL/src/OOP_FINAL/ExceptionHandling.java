package OOP_FINAL;
import java.util.Scanner;

public class ExceptionHandling {
	
	public static void main (String args []) {
		
		int maxSubjects;
		int [] marks = new int[5];
		int total = 0;
		double average =0; 
		
		//Creating scanner class
		Scanner scanner = new Scanner (System.in);
		
		
		try {
			//input values for maxSubject 
			System.out.print("Enter  your Max Subjects  (1-5) :");
			maxSubjects = scanner.nextInt();
			
			//Enter marks using a for loop
			for(int i=0; i < maxSubjects; i++) {
				System.out.print("Enter marks for subject "+(i+1) +" : ");
				marks[i] = scanner.nextInt();
				

				
				total += marks[i];
			}
			
			//Calculate the average
			average = total / (double) maxSubjects;
			System.out.println();
			
			
		}
		catch (ArithmeticException ae) {
			System.out.println("Cannot divied by 0");
			
		}
		
		catch(ArrayIndexOutOfBoundsException aiobe) {
			System.out.println("Error : Enter a valid number range");

		}
		
		catch(Exception e) {
			System.out.println("Please enter valid number");
		}
		System.out.println("Total is "+ total);
		System.out.println("Average is "+ average);
	}

}
