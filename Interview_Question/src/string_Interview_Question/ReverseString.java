package string_Interview_Question;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "programming";
		
		//With using StringBuffer class
		StringBuffer sb = new StringBuffer(str);
		String result = sb.reverse().toString();
		System.out.println(result);
		
		//without using StringBuffer
		String result1 = "";
		for(int i = str.length()-1; i >= 0; i--) {
			result1 = result1 + str.charAt(i);
		}
		System.out.println(result1);

	}

}
