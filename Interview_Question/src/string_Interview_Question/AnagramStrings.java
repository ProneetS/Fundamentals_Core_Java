package string_Interview_Question;

import java.util.Arrays;

public class AnagramStrings {

	public static void main(String[] args) {
		
		//if two words are made from similar character then its called as an anagram 
		//e.g.1 1> abcd 2>cbad are anagram 
		//e.g.2 1>army 2>mary
		
		//corner cases to check i> length should be same ii> character should be same
		
		//given 2 string 
		String str1 = "army";
		String str2 = "mary";
		
		//convert string to char[] array and make them all in lower case
		char[] chr1 = str1.toLowerCase().toCharArray();
		char[] chr2 = str2.toLowerCase().toCharArray();
		
		//sort both the char[] array in ascending order
		Arrays.sort(chr1);
		Arrays.sort(chr2);
		
		//if both char[] are 
		if(Arrays.equals(chr1, chr2)) {
			System.out.println("String 1 and String 2 are anagram");
		}else {
			System.out.println("String 1 and string 2 are NOT anagram");
		}

	}

}
