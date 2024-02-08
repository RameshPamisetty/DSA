package first_java;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int input=sc.nextInt();
		
		int temp;
		int remainder;
		temp=input;
		
		double sum=0;
		
		while(input!=0) {
			remainder=input%10;
			sum=sum+Math.pow(remainder, 3);
			input=input/10;
		}
		if(temp==sum) {
			System.out.println("Entered number is armstrong");
		}else {
			System.out.println("Entered number is not an armstrong");
		}
	}
}
