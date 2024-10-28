package Q124;

public class StudentManagemnetApp {
	public static void main(String[] args) {
		
//		Student std1 = new Student(11,"AB",15,"Bio",2.7);
//		Student std2 = new Student(12,"ABC",16,"Bio",2.7);
//		Student std3 = new Student(13,"ABCD",17,"Bio",2.7);
//		Student std4 = new Student(14,"ABCDE",18,"Bio",2.7);
//		Student std5 = new Student(15,"ABCEF",19,"Bio",2.7);
		
		StudentManager stdManager = new StudentManager();
		
		stdManager.addStudent(new Student(11,"ABQ",15,"Bio",2.72));
		stdManager.addStudent(new Student(112,"ABW",15,"Bio",2.73));
		stdManager.addStudent(new Student(113,"ABR",15,"Bio",2.74));
		stdManager.addStudent(new Student(114,"ABT",15,"Bio",2.75));
		stdManager.addStudent(new Student(115,"ABY",15,"Bio",2.76));
		
		
		//Update Student GPA
		stdManager.updateStudentGPA(11, 31.0);
		System.out.println();
		
		stdManager.displayAllStudents();
		
	}

}
