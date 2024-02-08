package flow_of_program;

import java.util.Scanner;

public class Program_5 {

	public static void main(String[] args) {

		sumOfAll();
	}

	public static void sumOfAll() {

		Scanner sc=new Scanner(System.in);
		int x=0;
		int sum=0;
		
		do {
			System.out.println("Please insert a number:");
			x=sc.nextInt();
			sum+=x;
			System.out.println(sum);
		} while (x>0);
	}

}
