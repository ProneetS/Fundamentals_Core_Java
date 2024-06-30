package string_Interview_Question;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindFirstNonRepeatedCharacter {

	public static void main(String[] args) {
		
		//e.g. "swiss" in this string the 1st non repeated character is "w"
		//e.g. "programming" in this string the 1st non repeated character is "p"
		
		//String str = "swiss";
		String str = "programming";
		
		//create a map
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		//IMP: using LinkedHashMap is due to it is maintain insertion order.
		
		//initial count is 1 for each character appearance;
		int count = 1;
		
		for(int i = 0; i < str.length(); i++) {
			if(!map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), count);
			}else {
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}
		}
		
		//printing the value
		//here using map in for each loop
		for(Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue() == 1) {
				System.out.println("The first non repeating character is " + entry.getKey());
				break;
			}
		}
	}

}
