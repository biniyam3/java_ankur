package thisKeyWord;

public class ThisKeyWordDemo1 {
	// this keyword is a reference variable in java that refers to current object
	int a, b; // instance variable
	
	public void getValues(int a, int b) { // method variablel
		this.a = a;
		this.b = b;
	}
	
	public void printValue() {
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args) {

		ThisKeyWordDemo1 th = new ThisKeyWordDemo1();
		th.getValues(10, 20);
		th.printValue();
	}

}
