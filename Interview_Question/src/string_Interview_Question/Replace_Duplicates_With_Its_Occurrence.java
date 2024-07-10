package string_Interview_Question;

public class Replace_Duplicates_With_Its_Occurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaabbbsbsbbaa";
		
		String output = result(str);
		System.out.println(output);
		
		

	}

	private static String result(String str) {
		
		if(str == null || str.isEmpty()) {
			return str;
		}
		
		StringBuilder result = new StringBuilder();
        int count = 1;
        char currentChar = str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            char nextChar = str.charAt(i);

            if (nextChar == currentChar) {
                count++;  // Increment count if characters are the same
            } else {
                result.append(currentChar);  // Append character
                if (count > 1) {
                    result.append(count);  // Append count if more than 1
                }
                currentChar = nextChar;  // Move to next character
                count = 1;  // Reset count
            }
        }
        
     // Append the last character and its count
        result.append(currentChar);
        if (count > 1) {
            result.append(count);
        }

        return result.toString();
		
	}

}
