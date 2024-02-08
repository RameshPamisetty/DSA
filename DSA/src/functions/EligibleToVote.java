package functions;

import java.util.Scanner;

public class EligibleToVote {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int number=sc.nextInt();
		
		if(number>=18) {
			System.out.println("Eligible to vote");
		}else {
			System.out.println("Not Eligible to vote");
		}
		
	}
}
