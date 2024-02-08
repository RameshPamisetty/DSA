package first_java;

import java.util.Scanner;

public class RupeeToUSD {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the indian currency:");
		int IN=sc.nextInt();
		double USD=IN*0.012;
		System.out.println(USD);
	}
}
