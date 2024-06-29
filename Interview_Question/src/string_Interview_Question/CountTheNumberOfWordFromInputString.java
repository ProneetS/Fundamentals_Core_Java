package string_Interview_Question;

import java.util.HashMap;
import java.util.Map;

public class CountTheNumberOfWordFromInputString {

	public static void main(String[] args) {
		
		//given string is 
		String str = "I am learning learning java java java programming programming";
		
		//to get the count of each word appearance we need HashMap 
		//HashMap contains key value pair. 
		
		//creating HashMap
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//convert the string to array by using split() method to store each word separately in an array
		String[] arr = str.split(" ");
		
		//logic to store each word in hash map with its correspondence appearance value.
		Integer count = 1; //by default if appearing 1st time then count will be 1

		//traversing through array
		for(int i = 0; i < arr.length; i++ ) {
			
			//if the map doesn't contains the word then put in to map and count is 1 by default
			//else map will add the word with increase in count by 1
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], count);
			}else {
				map.put(arr[i], map.get(arr[i])+1);
			}
		}
		
		//printing the word and its count present in a string.
		for(String x : map.keySet()) {
			System.out.println("The count of word " + x + " = " + map.get(x));
		}

	}

}
