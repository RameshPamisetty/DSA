package first_java;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first input: ");
		int a = sc.nextInt();

		System.out.println("Enter the second input: ");
		int b = sc.nextInt();
		
		int largest=(a>b)?a:b;
		System.out.println("largest:"+largest);
	}
}
