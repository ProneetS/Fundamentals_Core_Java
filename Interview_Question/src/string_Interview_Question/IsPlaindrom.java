package string_Interview_Question;

public class IsPlaindrom {

	public static void main(String[] args) {
		
		//using recursion
		
		String str = "nitin";
		boolean result = isPalindrom(str);
		System.out.println(result);
	}

	private static boolean isPalindrom(String str) {
		//if string is null then return false
		if(str == null) {
			return false;
		}
		
		//if string contains space or 1 character then return true
		if(str.length() <= 1) {
			return true;
		}
		
		//logic for comparing 1st and last character of given string
		String first  = str.substring(0, 1);
		String last = str.substring(str.length() - 1, str.length());
		
		if(!first.equals(last)) {
			return false;
		}else {
			return isPalindrom(str.substring(1, str.length()-1));
		}
	}
	

}
