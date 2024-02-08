package conditionals_loops;

import java.util.Scanner;

public class SumOfAllNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input: ");
		int input;
		int sum = 0;
		while ((input = sc.nextInt()) != 0) {
			sum = sum + input;

		}
		System.out.println(sum);
	}
}
