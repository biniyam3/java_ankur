package oops;

public class ConstructorParameter {
	
	
	int x;
	int y;
	
	public ConstructorParameter(int a, int b) {
		x = a;
		y = b;
	}
	
	public void display() {
		System.out.println(x+y);
	}

	public static void main(String[] args) {

		ConstructorParameter cm1 = new ConstructorParameter(25, 30);
		cm1.display();
	}

}
