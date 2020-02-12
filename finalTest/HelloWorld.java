package finalTest;

public class HelloWorld {

	public static void main(String[] args) {

		System.out.println("Hello World");
		
		int age = 20;
		double salary = 2000.00;
		char bloodType = 'O';
		boolean employee = true;
		
		if (employee) {
			System.out.println("employee is " + age + " years old and has blood type " +
		       bloodType + " and earns $" + salary + " per week" );
		}
		
		int a = 40;
		int b = 66;
		
		int sum = a + b;
		System.out.println("a + b = " + sum);
		
		
		int x = 100;
		int y = 44;
		
		int diff = x - y;
		System.out.println("x - y = " + diff);
		
		int m = 33;
		int n = 2;
		
		int mult = m*n;
		System.out.println("m X n = " + mult);
	}

}
