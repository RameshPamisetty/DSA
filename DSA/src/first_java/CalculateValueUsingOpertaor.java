package first_java;

import java.util.Scanner;

public class CalculateValueUsingOpertaor {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n1=sc.nextInt();
		System.out.println("Enter the number: ");
		int n2=sc.nextInt();
		
		System.out.println("Enter the operator(+,-,/,*,%)");
		char ch=sc.next().charAt(0);
		solve(n1, n2, ch);
	}
	
	public static int solve(int a,int b,char op) {
		
		int sum=0;
		
		if(op=='+') {
			sum=a+b;
		}else if (op=='-') {
			sum=a-b;
		}else if (op=='/') {
			sum=a/b;
		}else if (op=='*') {
			sum=a*b;
		}else if (op=='%') {
			sum=a%b;
		}else {
			System.out.println("Enter the correct operator");
		}
		
		System.out.println("Sum "+sum);
		return sum;
	}
}
