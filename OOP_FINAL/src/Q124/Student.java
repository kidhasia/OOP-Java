package Q124;

public class Student {
	private int studentID;
	private String name;
	private int age;
	private String major;
	private double GPA;
	
	//Default constructor
	public Student() {
		
	}

	//Overloaded constructor
	public Student(int studentID, String name, int age, String major, double gPA) {
		super();
		this.studentID = studentID;
		this.name = name;
		this.age = age;
		this.major = major;
		GPA = gPA;
	}
	
	
	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double gPA) {
		GPA = gPA;
	}

	public double updateGPA(double newGPA) {
		newGPA = GPA;
		return GPA;
	}
	
	public void displayStudentDetails() {

		System.out.print("Student ID: "+studentID+"\n");
		System.out.print("Student name: "+name+"\n");
		System.out.print("Student age: "+age+"\n");
		System.out.print("Student major: "+major+"\n");
		System.out.print("Student GPA: "+GPA+"\n");
	}
	
	
	
	

}
