package string_Interview_Question;

public class CountNumberOfLetterInGivenString {

	public static void main(String[] args) {
		
		//Given String is
		String str = "Java is a programming language";
		
		int result  = str.length() - str.replaceAll("a", "").length();
		System.out.println(result);

	}

}
