package loops;

public class ForLoopDemo {

	public static void main(String[] args) {

//		for (int a=1; a<=10; a++) {
//			System.out.println("step number " + a);
//		}
		
		int a[] = new int[5];
		a[0]= 2;
		a[1]= 3;
		a[2]= 9;
		a[3]= 10;
		a[4]= 12;
		
		for(int i: a) {
			System.out.println(i);
		}
		
	}
}
