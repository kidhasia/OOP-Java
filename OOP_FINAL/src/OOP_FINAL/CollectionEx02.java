package OOP_FINAL;

import java.util.ArrayList;
import java.util.Scanner;

class Student{
	private int stdID;
	private String stdName;
	private int stdGPA;
	public Student(int stdID, String stdName, int stdGPA) {
		super();
		this.stdID = stdID;
		this.stdName = stdName;
		this.stdGPA = stdGPA;
	}
	public int getStdID() {
		return stdID;
	}
	public void setStdID(int stdID) {
		this.stdID = stdID;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public int getStdGPA() {
		return stdGPA;
	}
	public void setStdGPA(int stdGPA) {
		this.stdGPA = stdGPA;
	}
	
	public void displayDetails() {
		
		System.out.println("Student name: "+stdName+ " Student Id: "+stdID+" Student GPA: "+stdGPA);
}
}

public class CollectionEx02{
	
	public static void main(String[] args) {
		
		//Scanner object creation
		Scanner scanner = new Scanner (System.in);
		
		int id =0;
		String name= null;
		int gpa=0;
		
		
		//Getting user inputs
		for(int i=0; i<3; i++) {
			
			System.out.print("Enter Student's ID: ");
			 id = scanner.nextInt();
			 scanner.nextLine(); 
			
			System.out.print("Enter Student's Name: ");
			 name = scanner.nextLine();

			System.out.print("Enter Student's GPA: ");
			 gpa = scanner.nextInt();
			 System.out.println();

		}
		
		//Creating instance of Students class
		Student std1 =  new Student(id, name, gpa);
		Student std2 =  new Student(id, name, gpa);
		Student std3 =  new Student(id, name, gpa);
		
		
		//Array list creation
		ArrayList <Student> studentList = new ArrayList();	
		
		studentList.add(std1);
		studentList.add(std2);
		studentList.add(std3);
		
		for(Student s: studentList) {
			s.displayDetails();
		}
		
		
		
		
		
		
		
	}
	
}