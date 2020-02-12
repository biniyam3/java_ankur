package oops;

public class TeslaMain {

	public static void main(String[] args) {

		Tesla tesla1 = new Tesla("S", "blue", 851705876, 43000);
		Tesla tesla2 = new Tesla("Y", "white", 875186586, 78000);
		Tesla tesla3 = new Tesla("3", "black", 758437575, 38000);
		Tesla tesla4 = new Tesla("X", "red", 784657195, 102000);
		
		System.out.println("**Tesla 1 details*******");
		tesla1.printList();
		System.out.println("**Tesla 2 details*******");
		tesla2.printList();
		System.out.println("**Tesla 3 details*******");
		tesla3.printList();
		System.out.println("**Tesla 4 details*******");
		tesla4.printList();
	}

}
