package exercises;

import java.util.Scanner;

public class BankBalance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int choice;
		double balance;
		int year = 1;
	    
	      final double INT_RATE = 0.08;
	      Scanner keyboard = new Scanner(System.in);
	      System.out.print("Enter initial bank balance > ");
	      balance = keyboard.nextDouble();
	      
	      do{
	    	  balance = balance + balance * INT_RATE;
	    	  System.out.println("Your new balance with interest is " + balance + " year " + year);
	    	  year = year + 1;
	    	  System.out.println("Would you like to see next years balance? 1 for yes 2 for no." );
	    	  choice = keyboard.nextInt();
	    	  
	      }while(choice == 1);
		
	}

}
