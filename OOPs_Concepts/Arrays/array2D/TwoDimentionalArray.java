package array2D;

public class TwoDimentionalArray {

	public static void main(String[] args) {
		
		//declaration of 2d array
		int rows = 2;
		int column = 3;
		int a[][] = new int[rows][column];
		
		//giving input
		a[0][0] = 2;
		a[0][1] = 5;
		a[0][2] = 3;
		a[1][0] = 9;
		a[1][1] = 8;
		a[1][2] = 7;
		
		//printing out the value
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < column; j++) {
				System.out.println("a["+i+"]["+j+"] :" + a[i][j]);
			}
		}

	}

}
