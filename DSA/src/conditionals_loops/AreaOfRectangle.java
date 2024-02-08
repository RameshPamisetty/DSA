package conditionals_loops;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length:");
		int length = sc.nextInt();
		System.out.println("Enter the width:");
		int width = sc.nextInt();
		int area = length*width;
		System.out.println(area);
	}
}
//Area of rectangle=l*w