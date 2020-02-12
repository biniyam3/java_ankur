package increament;

import java.util.Scanner;

public class descending {

	public static void main(String[] args) {
		
		
		
//	  int i=10;
	  
//	  while (i>0) {
//		  System.out.println(i);
//	  
//		  i--;	
//		}
	  
//	  for (int i = 10; i>0; i--) {
//		  System.out.println(i);
//	  }

//	  int num = 4;
//	  
//	  if (num % 2 == 0) {
//		  System.out.println(num + " is an even number");	  
//	  }
//	  else {
//		  System.out.println(num + " is an odd number");
//	  }
	  
	  Scanner scanner = new Scanner(System.in);
	  
	  System.out.println("Enter number");
	  int number = scanner.nextInt();
	  
	  int i = 1;
	  
	  while (i <= 10) {
		  System.out.println(number + " * " + i + " = " + (number*i));
		  i++;
	  }
		
		
	}

}
