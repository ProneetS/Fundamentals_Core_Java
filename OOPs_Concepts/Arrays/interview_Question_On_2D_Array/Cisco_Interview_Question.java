package interview_Question_On_2D_Array;

public class Cisco_Interview_Question {

	public static void main(String[] args) {
		
		//The Row where you get the Minimum value of a 3 x 3 Matrix, in same Column Find out the Max value
		
		//declaring 3 x 3 matrix
		int array[][] = {{2,5,1},{3,8,0},{9,8,7}};
				
		int min = array[0][0];
		int minColumn = 0;
				
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(array[i][j]<min) {
					min = array[i][j];
					minColumn = j;
				}
			}
		}
		
		
		int maxValue = array[0][minColumn];
		int k = 0;
		while(k<3) {
			if(array[k][minColumn]>maxValue) {
				maxValue = array[k][minColumn];
			}
			k++;
		}
		
		System.out.println("The maximum value is " + maxValue);
				
	}

}
