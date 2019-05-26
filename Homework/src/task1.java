import java.util.Scanner;
public class task1 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Please enter the monthly saving amount:");
		
		 double Monthly_Interest_Rate = 0.05/12;
		 
		 
    	Scanner input = new Scanner(System.in);
		 double d = input.nextDouble(); //nextInt()	Reads a int value from the user
		System.out.println("ple enter month:");
		
		 int N = input.nextInt();
		
		 
		double totalrate =  0.05/12;
		double total = d * totalrate;
		 for(int i=0; i<N; i++) {
		  total =  (total + d) * (1 + Monthly_Interest_Rate);
		
		 }
		System.out.println(total);
	
	
	}

}
