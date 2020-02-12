package overloading;

public class ConstructorOverLoading {
	
	ConstructorOverLoading (int a, int b) {
		System.out.println(a+b);
	}
	
	ConstructorOverLoading (int a, double b) {
		System.out.println(a+b);
	}
	
	ConstructorOverLoading (double a, double b) {
		System.out.println(a+b);
	}
	
	ConstructorOverLoading (int a, int b, int c) {
		System.out.println(a+b+c);
	}
	

	public static void main(String[] args) {
		
		ConstructorOverLoading con1 = new ConstructorOverLoading(100, 150);
		ConstructorOverLoading con2 = new ConstructorOverLoading(100, 150, 400);
		ConstructorOverLoading con4 = new ConstructorOverLoading(100, 150.15);
		ConstructorOverLoading con3 = new ConstructorOverLoading(100.00, 150.00);
		
	}

}
