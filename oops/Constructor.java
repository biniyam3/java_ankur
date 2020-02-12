package oops;

public class Constructor {

	int sId;
	String sName;
	char grade;
	
	public Constructor(int id, String name, char g) {
		sId = id;
		sName = name;
		grade = g;
	
	}
	
	public void display() {
		System.out.println("student id: - " + sId + " student name: - " + 
		        sName + " grade: - " + grade);
	}
	
	

}
