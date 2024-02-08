package intermediate_conditionals_loops;

import java.util.Scanner;

public class VowelsAndConsonants {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the alphabet:");
		String str=sc.next();
		char ch=str.charAt(0);
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
			System.out.println("Enter alphabet is vowel");
		}else {
			System.out.println("Enter alphabet is consonant");
		}
	}
}
