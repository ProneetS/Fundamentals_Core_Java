package other_CodingBased;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicatesUsingHashMap {

	public static void main(String[] args) {
		
		int[] numArr = {1,5,2,7,1,9,3,6,2,4,6,1};
		FindDuplicatesUsingHashMap.findDuplicatesUsingHM(numArr);
		
	}
	
	public static void findDuplicatesUsingHM(int[] arr) {
		
		//creating hashmap
		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		for(int x : arr) {
			if(!hm.containsKey(x)) {
				hm.put(x, 1);
			}else {
				hm.put(x, hm.get(x) + 1);
			}
		}
		
		//iterating through map
		
		for(Integer x:hm.keySet()) {
			if(hm.get(x)>1) {
				System.out.println("The duplicates value is " + x);
			}
		}
	}

}
