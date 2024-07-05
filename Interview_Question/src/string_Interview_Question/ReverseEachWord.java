package string_Interview_Question;

public class ReverseEachWord {

	public static void main(String[] args) {
		
		String str = "How Are You";
		//Output: woH erA uoY
		String result = "";
		//separate each word using split method
		String[] arr = str.split("\\s");
		
		//Traversing through each word of the given sentence
		for(String word:arr) {
			
			//logic to reverse the word 
			//e.g. How ==> woH
			
			String reverseWord = "";
			int j = word.length() - 1; //find the length 	1q2
			
			while(j >=0) {
				char ch = word.charAt(j);
				reverseWord = reverseWord + ch;  //first it will store "w" then "o" then "H"
				j--;
			}
			
			result = result + reverseWord + " ";
		}
		
		System.out.println(result);
	}

}
