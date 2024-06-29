package string_Interview_Question;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharacter {

	public static void main(String[] args) {
		
		String str = "programming";
		
		//convert string to char array
		char[] chr = str.toCharArray();
		
		//creating HashMap to store key(character) value(occurrence) pair.
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		//initial count value is 1 by default for each character as it appears for 1st time.
		Integer count = 1; 
		//looping through each character of char[] and store their occurence value
		for(int i = 0; i < chr.length; i++) {
			//if the character occures 1st time then store the character and its value as 1
			//else store the value and increase the count to + 1 by getting the previous count which is 1
			if(!map.containsKey(chr[i])) {
				map.put(chr[i], count);
			}else {
				map.put(chr[i], map.get(chr[i])+1);
			}
			
		}
		
		//printing the duplicate character and its value
		for(Character key : map.keySet()) {
			if(map.get(key) > 1) {
				System.out.println(key + " : " + map.get(key));
			}
		}

	}

}
