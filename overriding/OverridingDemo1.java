package overriding;

public class OverridingDemo1 {

	public static void main(String[] args) {
		
		Citi ci = new Citi();
		System.out.println("citi bank interest rate is " + ci.interestRate());

		BofA bo = new BofA();
		System.out.println("bank of america interest rate is " +bo.interestRate());
	}

}

class Bank {
	public double interestRate() {
		return 0;
	}
}

class Citi extends Bank {
	public double interestRate() {
		return 10.5;
	}
}

class BofA extends Bank {
	public double interestRate() {
		return 22.5;
	}
}







