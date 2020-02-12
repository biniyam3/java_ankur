package string;

public class StringComparing {

	public static void main(String[] args) {

		
		String s = "Welcome";
		System.out.println(s.equals("Welcome"));
		System.out.println(s.equals("Wel come"));
		System.out.println(s.equals("welcome"));
		System.out.println(s.equalsIgnoreCase("welcome"));
	}

}
