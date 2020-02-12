package finalVariable;

public class FinalClassDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

final class Bike1 {  // the final modifier prevents us from extending the class into 
						// child classes
	int speed = 40;
	
	public void run() {
		System.out.println(speed);
	}
}

//public class Phoenix extends Bike1 {  // can not do this because of final modifier
	
//}
