package multiDimentsionArrays;

public class MultiDimensionArrayDemo2 {

	public static void main(String[] args) {
		
		// int a[][] = new int [3][2];
		// int a[][] = {{100,200,}, {300,400}, {500,600}};
		int b =100;
		int a[][] = new int[3][2];
		
		for(int i=0; i<a.length; i++) {
			
			for(int j=0; j<a[j].length; j++) {
				a[i][j] = b;
				b+=100;
			}
		}
		
		
		
//		for(int i=0; i<a.length; i++) {
//			
//			for(int j=0; j<a[j].length; j++) {
//				System.out.println(a[i][j]);
//			}
//		}
//		
		
	
// enhanced for loop
		for (int r[]:a) {
			
			for (int i:r) {
				System.out.println(i);
			}
		}

	}

}
