package conditionals_loops;

import java.util.Scanner;

public class LargestNumberFromAll {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input: ");
		int input;
		int largestNumber=0 ;
		while ((input = sc.nextInt()) != 0) {
			if(input>largestNumber) {
				largestNumber=input;
			}
		}
		System.out.println(largestNumber);
	}
}
