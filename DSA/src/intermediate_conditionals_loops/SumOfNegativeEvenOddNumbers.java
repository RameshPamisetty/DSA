package intermediate_conditionals_loops;

import java.util.Scanner;

public class SumOfNegativeEvenOddNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the numbers:");
		int negative = 0;
		int even = 0;
		int odd = 0;
		int n;
		while ((n = sc.nextInt()) != 0) {
			if (n < 0) {
				negative = negative + n;
			} else if (n % 2 == 0) {
				even = even + n;
			} else {
				odd = odd + n;
			}
		}
		System.out.println("Sum of negative numbers:" + negative);
		System.out.println("Sum of odd numbers:" + even);
		System.out.println("Sum of odd numbers:" + odd);
	}
}
