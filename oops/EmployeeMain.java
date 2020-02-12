package oops;

public class EmployeeMain {

	public static void main(String[] args) {

		Employee emp1 = new Employee(101, "john", 130000, 1010, "manager");
//		emp1.empId = 101;
//		emp1.empName = "john";
//		emp1.sal= 130000.00;
//		emp1.jobTitle = "manager";
//		emp1.deptNum = 1010;
		
		emp1.display();
	}

}
