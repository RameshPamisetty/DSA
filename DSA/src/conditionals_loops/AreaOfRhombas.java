package conditionals_loops;

import java.util.Scanner;

public class AreaOfRhombas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the d1:");
		int d1 = sc.nextInt();
		System.out.println("Enter the d2:");
		int d2 = sc.nextInt();
		double area = (d1 * d2) / 2;
		System.out.println(area);
	}
}