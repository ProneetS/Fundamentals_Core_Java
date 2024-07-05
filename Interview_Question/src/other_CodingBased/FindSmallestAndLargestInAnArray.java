package other_CodingBased;

public class FindSmallestAndLargestInAnArray {

	public static void main(String[] args) {
		
		int[] num = {12,21,34,67,90,40,100};
		
		int largest = num[0];
		int smallest = num[0];
		
		for(int i = 0; i < num.length; i++) {
			if(num[i] > largest) {
				largest = num[i];
			}else if(num[i] < smallest) {
				smallest = num[i];
			}
		}
		System.out.println("Largest is " + largest);
		System.out.println("Smallest is " + smallest);
	}

}
