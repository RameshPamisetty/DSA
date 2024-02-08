package first_java;

import java.util.Scanner;

public class GreetingMessageForParticularName {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name:");
		String name=sc.next();
		System.out.println("Hello "+name);
	}
		
}
