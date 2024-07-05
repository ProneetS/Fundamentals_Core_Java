package other_CodingBased;

import java.util.Arrays;

public class FindDuplicatesCharacterInArray {

	public static void main(String[] args) {
				
		int[] numArr = {1,2,3,9,2,6,8,7,1,4,8,2};
		FindDuplicatesCharacterInArray.sortingArray(numArr);
	}
	
	public static void sortingArray(int[] arr) {
		
		Arrays.sort(arr);
		int[] duplicates = null;
		
		for(int i = 0; i < arr.length - 1; i++) {
			if(arr[i] == arr[i+1]) {
				System.out.println("Duplicate is " + arr[i]);
			}
		}
	}

}
