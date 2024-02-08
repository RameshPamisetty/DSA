package intermediate_conditionals_loops;

import java.util.Arrays;

public class reverseAString {

	public static void main(String[] args) {

		String str = "Ramesh";
		int l = str.length();
		char ch;
		String reverseString = "";
		for (int i = l - 1; i >= 0; i--) {
			ch = str.charAt(i);
			reverseString = reverseString + ch;
		}
		System.out.println(reverseString);
	}

}
