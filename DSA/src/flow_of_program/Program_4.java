package flow_of_program;

import java.util.Scanner;

public class Program_4 {

	public static void main(String[] args) {

		hcfAndLcm();
	}

	public static void hcfAndLcm() {

		int temp, temp1, temp2, hcf, lcm,n1,n2;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter First Number: ");
		n1 = scanner.nextInt();
		System.out.print("Enter Second Number: ");
		n2 = scanner.nextInt();
		scanner.close();
		temp1 = n1;
		temp2 = n2;

		while (temp2 != 0) {
			temp = temp2;
			temp2 = temp1 % temp2;
			temp1 = temp;
		}

		hcf = temp1;
		lcm = (n1 * n2) / hcf;

		System.out.println("HCF of input numbers: " + hcf);
		System.out.println("LCM of input numbers: " + lcm);
	}

}
