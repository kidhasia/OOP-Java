package Q124;

import java.util.ArrayList;

public class StudentManager {
	
	ArrayList <Student> studentList = new ArrayList();

	public StudentManager() {
		
	}
	
	public void addStudent(Student student) {
			studentList.add(student);	
		
	}
	
	public void searchStudent(int studentID) {
		for(Student std: studentList) {
			if(std.getStudentID()==studentID) {
				std.displayStudentDetails();
				break;
			}
		}
	}
	
	public void updateStudentGPA(int studentID,double newGPA) {
		for(Student std: studentList) {
			if(std.getStudentID()==studentID) {
				double updateGPA = std.getGPA();
				updateGPA = newGPA;
				System.out.println("Updated GPA = "+newGPA);
			}
		}
	}
	
	public void displayAllStudents() {
		for(Student std: studentList) {
			std.displayStudentDetails();
			System.out.println();
		}
	}
	
	

}
