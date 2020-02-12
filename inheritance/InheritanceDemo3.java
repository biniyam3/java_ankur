package inheritance;

public class InheritanceDemo3 {

	public static void main(String[] args) {

		Child1 c1 = new Child1();
		c1.a = 100;
		c1.x = 200;
		c1.display();
		c1.print();
		
		Child2 c2 = new Child2();
		c2.a = 200;
		c2.y = 300;
		c2.display();
		c2.show();
		
	}

}


class Parent {
	int a;
	
	public void display() {
		System.out.println("a = " + a);
	}
}

class Child1 extends Parent {
	int x;
	
	public void print() {
		System.out.println("x = " + x);
	}
}

class Child2 extends Child1 {
	int y;
	
	public void show() {
		System.out.println("y = " + y);
	}
}



