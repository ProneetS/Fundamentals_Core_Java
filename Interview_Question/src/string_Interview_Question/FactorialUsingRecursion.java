package string_Interview_Question;

public class FactorialUsingRecursion {

	public static int findFactorial(int n) {
		if(n<=1) {
			return 1;
		}
		else {
			return n * findFactorial(n-1);
		}
	}
	
	public static void main(String[] args) {
		
		int n = 0;
		System.out.println("The factorial of " + n + " is " + findFactorial(n));

	}

}
