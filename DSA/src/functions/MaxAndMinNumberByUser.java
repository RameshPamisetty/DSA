package functions;

import java.util.Scanner;

public class MaxAndMinNumberByUser {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number:");
		int a = sc.nextInt();

		System.out.print("Enter the second number:");
		int b = sc.nextInt();

		System.out.print("Enter the third number:");
		int c = sc.nextInt();

		int largest=max(a, b, c);
		int smallest=min(a, b, c);
		
		System.out.println("Largest:"+largest);
		System.out.println("Smallest:"+smallest);

	}

	public static int max(int a, int b, int c) {

		int largest = a;
		if (b > largest)
			largest = b;

		if (c > largest)
			largest = c;

		return largest;
	}

	public static int min(int a, int b, int c) {
		int largest = a;
		if (b < largest)
			largest = b;

		if (c < largest)
			largest = c;

		return largest;
	}

}
