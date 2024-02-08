package intermediate_conditionals_loops;

import java.util.Scanner;

public class FactorialProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int fact = sc.nextInt();
		System.out.println(factorial(fact));
		sc.close();
	}

	public static int factorial(int number) {
		if (number == 0) {
			return 1;
		}
		return number * factorial(number - 1);
	}
}
// 6!=6*5*4*3*2*1=720