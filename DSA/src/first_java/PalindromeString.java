package first_java;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String input=sc.nextLine();
		String reverseString="";
		
		int length=input.length();
		for(int i=length-1;i>=0;i--) {
			reverseString=reverseString+input.charAt(i);
		}
		if(input.equals(reverseString)) {
			System.out.println("Enter string is palindrome");
		}else {
			System.out.println("Enter string is not palindrome");
		}
	}
}
