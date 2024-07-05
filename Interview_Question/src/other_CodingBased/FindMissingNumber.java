package other_CodingBased;

import java.util.Arrays;

public class FindMissingNumber {

	public static void main(String[] args) {
		
		
		//given num array is 
		int[] numarr = {1,2,3,5,6,7,8,9,10};
		
		//logic is find the sum of the num array and then subtract it from the total value of the range
		int sum = 0;
		for(int i = 0; i< numarr.length; i++) {
			sum  = sum + numarr[i];
		}

		//sum from 1 - 10 as the given array range from 1 to 10
		int expectedsum = 0;
		for(int i = 0 ; i<= 10; i++) {
			expectedsum = expectedsum + i;
		}
		
		System.out.println(Arrays.toString(numarr));
		System.out.println("The missing number is " + (expectedsum - sum));
	}

}
