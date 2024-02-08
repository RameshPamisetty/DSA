package flow_of_program;

public class Program_3 {

	public static void main(String[] args) {
	
		multiplicationTable(5);
	}
	
	public static void multiplicationTable(int n1) {
		
		for(int i=1;i<=10;i++) {
			System.out.println(n1+"*"+i+"="+n1*i);
		}
		
	}

}
