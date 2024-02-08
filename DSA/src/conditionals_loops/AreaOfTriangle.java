package conditionals_loops;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the height:");
		int height = sc.nextInt();
		System.out.println("Enter the base:");
		int base = sc.nextInt();
		int area = (height * base) / 2;
		System.out.println(area);
	}
}
//Area of traingle=(h*b)/2