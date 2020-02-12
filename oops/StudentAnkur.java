package oops;

public class StudentAnkur {
 int sId;
 String sName;
 char grade;
 
 public void getValues(int id, String name, char g) {
	 sId = id;
	 sName = name;
	 grade = g;
	 
 }
 
 public void display() {
	 System.out.println("student id: - " + sId + " student name: - " + 
        sName + " grade: - " + grade);
 }
}
