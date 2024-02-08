package intermediate_conditionals_loops;

import java.util.Scanner;

public class AverageOfNnumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int number = sc.nextInt();
		int count=1;
		float temp,average,sum=0;
		while(count<=number) {
			System.out.println("Enter the "+count+" number");
			temp=sc.nextInt();
			sum=sum+temp;
			count++;
		}
		average=sum/number;
		System.out.println("Average:"+average);
		
	}
}
