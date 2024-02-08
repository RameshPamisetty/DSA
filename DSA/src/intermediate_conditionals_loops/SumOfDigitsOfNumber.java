package intermediate_conditionals_loops;

import java.util.Scanner;

public class SumOfDigitsOfNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int n=sc.nextInt();
		int sum=0,remainder;
		
		while(n!=0) {
			remainder=n%10;
			sum=sum+remainder;
			n=n/10;
		}
		
		System.out.println(sum);
	}
}
