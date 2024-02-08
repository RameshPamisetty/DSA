package first_java;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int firstTerm = 0;
		int secondTerm = 1;
		System.out.print(firstTerm + " ");
		int nextTerm;
		for (int i = 0; i < n; i++) {

			nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
			System.out.print(nextTerm + " ");
		}

	}
}
// 0 1 1 2 3 5 8 13