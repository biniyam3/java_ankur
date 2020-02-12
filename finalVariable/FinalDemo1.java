package finalVariable;

public class FinalDemo1 {

	final int speed = 40;
	
	public static void main(String[] args) {
		
		FinalDemo1 fl = new FinalDemo1();
		
		//fl.speed = 100; // this can not happen coz we can not change speed since we 
		                // used final when we declared the speed variable
		
		System.out.println(fl.speed);

	}

}
