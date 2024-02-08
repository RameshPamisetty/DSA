package conditionals_loops;

import java.util.Scanner;

public class PerimeterOfCircle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius:");
		int radius = sc.nextInt();

		double perimeterOfCircle = 2 * Math.PI * radius;
		System.out.println(perimeterOfCircle);
	}
}