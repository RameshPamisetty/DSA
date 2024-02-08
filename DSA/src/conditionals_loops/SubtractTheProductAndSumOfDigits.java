package conditionals_loops;

import java.util.Scanner;

public class SubtractTheProductAndSumOfDigits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		sumOfDigits(number);
	}

	public static void sumOfDigits(int n) {
		int remainder;
		int sum = 0;
		int product = 1;
		int result;
		while (n != 0) {
			remainder = n % 10;
			sum = sum + remainder;
			product = product * remainder;
			n = n / 10;
		}
		
		System.out.println("Product Of Digit: " + product);
		System.out.println("Sum Of Digit: " + sum);
		
		result = product - sum;
		System.out.println("Result: " + result);
	}
}
