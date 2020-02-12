package oops;

public class Employee {
	
		int empId;
		String empName;
		double sal;
		int deptNum;
		String jobTitle;
		
		public Employee(int empId, String empName, double sal, int deptNum, String jobTitle) {
			super();
			this.empId = empId;
			this.empName = empName;
			this.sal = sal;
			this.deptNum = deptNum;
			this.jobTitle = jobTitle;
		}



		public void display() {
			System.out.println("employee name: " + empId);
			System.out.println("employee name: " + empName);
			System.out.println("employee salary: " + sal);
			System.out.println("employee department: " + deptNum);
			System.out.println("employee job title: " + jobTitle);
			
		}
	

}
