package functions;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number = sc.nextInt();
		System.out.println(palindrome(number));
	}

	public static int palindrome(int number) {

		int remainder;
		int sum = 0;
		int temp=number;
		while (number != 0) {
			remainder = number % 10;
			sum = sum * 10 + remainder;
			number = number / 10;
		}
		
		if(temp==sum)
			return sum;
		
		return 0;
	}
}
