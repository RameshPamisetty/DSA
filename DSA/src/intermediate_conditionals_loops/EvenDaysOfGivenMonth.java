package intermediate_conditionals_loops;

import java.util.Scanner;

public class EvenDaysOfGivenMonth {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the days:");
		int n = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				count++;
			}
		}
		System.out.println(count);
	}
}
