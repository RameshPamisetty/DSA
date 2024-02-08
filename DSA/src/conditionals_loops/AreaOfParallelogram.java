package conditionals_loops;

import java.util.Scanner;

public class AreaOfParallelogram {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base:");
		int base = sc.nextInt();
		System.out.println("Enter the height:");
		int height = sc.nextInt();
		double area = base*height;
		System.out.println(area);
	}
}