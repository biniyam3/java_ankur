package inheritance;

public class InheritanceDemo2 {

	public static void main(String[] args) {
		
		CC cobj = new CC();
		cobj.a = 10;
		cobj.b = 20;
		cobj.c = 30;
		
		cobj.display();
		cobj.print();
		cobj.show();
		
		
		

	}

}

class AA {
	int a;
	
	public void display() {
		System.out.println("a = " + a);
	}
}

class BB extends AA {
	int b;
	
	public void print() {
		System.out.println("b = " + b);
	}
}

class CC extends BB {
	int c;
	
	public void show() {
		System.out.println("c =" + c);
	}
}



