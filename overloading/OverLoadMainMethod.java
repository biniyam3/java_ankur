package overloading;

public class OverLoadMainMethod {
	
	public void main(int x) {
		System.out.println(x);
	}
	
	public void main(int x, int y) {
		System.out.println(x*y);
	}

	public static void main(String[] args) {	
		OverLoadMainMethod  om = new OverLoadMainMethod();
		om.main(100);
		om.main(2001, 102);
	}

}
