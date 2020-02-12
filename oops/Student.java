package oops;

public class Student {

	int studentId;
	String studentName;
	char grade;
	
	
	
	public Student(int studentId, String studentName, char grade) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.grade = grade;
	}



	public void display() {
		System.out.println("student id is " + studentId + ", student name is " + studentName +
				", and student's grade is " + grade);
	}
}
