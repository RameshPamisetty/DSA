package conditionals_loops;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		int r;
		double area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius:");
		r = sc.nextInt();
		area = Math.PI* r;
		System.out.println(area);
	}
}
// area of circle=2*2.14r