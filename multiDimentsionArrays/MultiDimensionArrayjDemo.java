package multiDimentsionArrays;

public class MultiDimensionArrayjDemo {

	public static void main(String[] args) {
		
		int a[][] = new int[3][2]; // 3 rows and 2 columns
		
		a[0][0] = 100;
		a[0][1] = 200;
		
		a[1][0] = 300;
		a[1][1] = 400;
		
		a[2][0] = 500;
		a[2][1] = 600;
		
		System.out.println("nummbr of rows is " + a.length);
		System.out.println("number of columns is " + a[0].length);
		
		for (int i=0; i<a.length; i++) {
			
			for (int j=0; j<a[j].length; j++ ) {
				System.out.println(a[i][j]);
			}
		}
		

	}

}
