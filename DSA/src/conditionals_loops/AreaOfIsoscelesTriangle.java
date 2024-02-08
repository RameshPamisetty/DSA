package conditionals_loops;

import java.util.Scanner;

public class AreaOfIsoscelesTriangle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the a:");
		int a = sc.nextInt();
		System.out.println("Enter the b:");
		int b = sc.nextInt();
		double area = (b * (Math.sqrt((4 * Math.pow(a, 2)) - (Math.pow(b, 2))))) / 4;
		System.out.println(area);
	}
}