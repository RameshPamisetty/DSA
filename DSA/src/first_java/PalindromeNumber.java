package first_java;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int input = sc.nextInt();

		int temp, sum = 0;
		int remainder;
		temp = input;

		while (input != 0) {
			remainder = input % 10;
			sum = (sum * 10) + remainder;
			input = input / 10;
		}
		if (temp == sum) {
			System.out.println("Number is palindrome");
		} else {
			System.out.println("Number is not a palindrome");
		}
	}
}
