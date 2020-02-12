package overloading;

public class MethodOverloading {
	
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public void add(int a, double b) {
		System.out.println(a+b);
	}
	
	public void add(double a, double b) {
		System.out.println(a+b);
	}
	
	public void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	

	public static void main(String[] args) {

		MethodOverloading mo = new MethodOverloading();
		
		mo.add(10, 20.22);
		mo.add(10, 15.5);
		mo.add(10.0, 20.0);
		mo.add(29, 10, 25);
		
	}

}
