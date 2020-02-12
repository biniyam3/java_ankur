package operators;

public class OOPsDemo1 {
	
	int empId;
	String empName;
	double sal;
	int deptNo;
	String job;

	public static void main(String[] args) {

// class --> collection of variables and methods
// method --> block of codes which contain logics
// object --> an instance of a class
		
		OOPsDemo1 emp1 = new OOPsDemo1();
		emp1.empId = 103;
		emp1.empName = "bin";
		emp1.sal = 200000.00;
		emp1.deptNo = 110;
		emp1.job = "manager";
		emp1.display();
		
		System.out.println("***************************");
		
		
		
		OOPsDemo1 emp2 = new OOPsDemo1();
		emp2.empId = 400;
		emp2.empName = "ysf";
		emp2.sal = 47821.00;
		emp2.deptNo = 110;
		emp2.job = "tester";
		
		emp2.display();
	}
	
	public void display() {
		System.out.println("employee id is " + empId);
		System.out.println("employee name is " + empName);
		System.out.println("salary is " + sal);
		System.out.println("department number is " + deptNo);
		System.out.println("job title is " +   job);
	}

}
