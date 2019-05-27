import javax.swing.JOptionPane;

public class Task_2 {

	//private static final Integer new_balace = null;

	public static void main(String[] args) {
	
		/*1 input and define the account number
		 * 2 input and define the balance of the beginning of the month
		 * 3. input and define the the charged by customer
		 * 4. input and define the credit limit
		 * 5. calculated the balance and compaired with the credit limit
		 * 6. printout the answer.
		 */
		
		String account_number = JOptionPane.showInputDialog("Your account No.", 2345324);     //define the variable of account_number, and convert the string variable into int.
		
        Integer balance = Integer.parseInt(JOptionPane.showInputDialog("Balance", 10));     //define the balance of account_number, and convert the string variable into int.
		
		Integer all_charged = Integer.parseInt(JOptionPane.showInputDialog("All charged in this month", 90));    //define the variable of all_charged, and convert the string variable into int.
		
		Integer all_credit = Integer.parseInt(JOptionPane.showInputDialog("All credit in this month",100));      //define the variable of all_credit, and convert the string variable into int.
		
		Integer credit_limit = Integer.parseInt(JOptionPane.showInputDialog("All limit in this month",50));     //define the variable of credit_limit, and convert the string variable into int.
		
		int new_balace = balance + all_charged - all_credit; //creat a new int variable new_balance; put the calculation into it.
		
		if (new_balace < credit_limit) // create if conditons
			System.out.println("The account" +"\n" + account_number +"\n"+ "His credit limit is" +"\n"+ credit_limit +"\n"+ "and his new balance is"+ "\n"+ new_balace +"\t"+ "Credit Limit Exceeded");
		else
			System.out.println("Your Credit is OK");
		
		
	}

}
