package conditionals_loops;

import java.util.Scanner;

public class VolumeOfCone {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius:");
		int radius= sc.nextInt();
		System.out.println("Enter the height:");
		int height = sc.nextInt();
		double volumeOfCone= (Math.PI*Math.pow(radius, 2)*height)/3;
		System.out.println(volumeOfCone);
	}
}