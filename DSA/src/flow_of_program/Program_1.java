package flow_of_program;

public class Program_1 {

	public static void main(String[] args) {
	
		leapYear(2024);
		
	}
	
	public static void leapYear(int n) {
		if((n%400==0) || ((n%4==0) && (n%100!=0))) {
			System.out.println("Leap Year");
		}else {
			System.out.println("Not a leap year");
		}
	}

}
