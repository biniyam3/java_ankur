package ifElse;

public class IfElseGreatestOfThreeNumbers {

	public static void main(String[] args) {
		// IfElseGreatestOfThreeNumbers
		
		int a = 33;
		int b = 23;
		int c = 45;
		
		if ((a>b) && (a>c)) {
			System.out.println("a is the greatest number");
		}
		else if ((b>a) && (b>c)) {
			System.out.println("b is the greatest number");
		}
		else if ((c>a) && (c>b)) {
			System.out.println("c is the greatest number");
		}
				
				

	}

}
