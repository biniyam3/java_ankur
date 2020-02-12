package inheritance;



public class InheritanceDemo1 {
	

	public static void main(String[] args) {

		A aobj = new A();
		aobj.a = 100;
		aobj.display();
		
		B bobj = new B();
		bobj.a = 100;
		bobj.b = 200;
		bobj.display();
		bobj.print();
		
	}

}

class A {    // parent class
	int a;
	
	public void display() {
		System.out.println("val of a in parent class is " + a);
	}	
}

class B extends A { // child class  
	
	int b;	
	
	public void print() {
		System.out.println("val of b in child class is " + b);
	}
}

