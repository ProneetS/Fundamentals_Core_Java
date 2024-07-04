package star_patterns;

import java.util.Scanner;

public class StarPatter_02 {
	
	/*
	 * 
	 * * *
	 * * * * *
	 * * * * * * *
	 * * * * * * * * *
	 */
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = scn.nextInt();
		
		int k = 1;
		
		for(int i = 1; i<=n ; i++) {
			for(int j = 1; j <= k; j++) {
				System.out.print("* ");
			}
			k = k+2;
			System.out.println();
		}

	}

}
