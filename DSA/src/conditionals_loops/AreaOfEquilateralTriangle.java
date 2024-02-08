package conditionals_loops;

import java.util.Scanner;

public class AreaOfEquilateralTriangle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the a:");
		int a = sc.nextInt();
		double area = Math.pow(a, 2) * (Math.sqrt(3) / 4);
		System.out.println(area);
	}
}