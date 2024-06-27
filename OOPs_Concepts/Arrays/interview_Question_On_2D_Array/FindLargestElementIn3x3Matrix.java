package interview_Question_On_2D_Array;

public class FindLargestElementIn3x3Matrix {

	public static void main(String[] args) {
		//declaring 3 x 3 matrix
		int array[][] = {{2,5,1},{3,8,0},{9,8,7}};
				
		int max = array[0][0];
				
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(array[i][j]>max) {
					max = array[i][j];
				}
			}
		}
		System.out.println("The maximum is " + max);
				

	}

}
