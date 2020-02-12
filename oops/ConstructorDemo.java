package oops;

public class ConstructorDemo {

	int x;
	int y;
	
	public ConstructorDemo() { // this is default constructor because we define the 
								// value in the constructor by hard coding
		x = 10;
		y = 20;
	}
	
	public void display() {
		System.out.println(x+y);
	}
	
	

	public static void main(String[] args) {

		ConstructorDemo cm1 = new ConstructorDemo();
		cm1.display();
	}

}
