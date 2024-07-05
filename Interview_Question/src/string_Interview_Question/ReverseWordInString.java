package string_Interview_Question;

public class ReverseWordInString {

	public static void main(String[] args) {
		
		String str = "We are learning Java";
		String result = "";
		//Splitting using space
		//split methods return array of objects

		String[] arr = str.split("\\s");
		for(int i = arr.length - 1; i>=0 ; i--) {
			result = result + arr[i] + " ";
		}
		
		System.out.println(result);
	}

}

/*
Input :
We are learning Java

Output :
Java learning are We
*/