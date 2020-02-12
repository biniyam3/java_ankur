package jumpingStatements;

public class JumpingStatementDemo2 {

	public static void main(String[] args) {
		
		for(int a=1; a<=10; a++) {
			
			if ((a==1) || (a==3) || (a==7)) {
				continue;
			}
			
			System.out.println(a);
		}

	}

}
