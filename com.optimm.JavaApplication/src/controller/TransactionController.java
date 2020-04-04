package controller;

import java.util.Scanner;

import dao.BankDAOImpl;
import dao.BankDAOInterface;
import pojo.User;

public class TransactionController {
	
	private int userChoice;
	private String UChoice;
	private User refUser;
	private HomePageController refHPC;
	private BankDAOImpl refBank;
	
	Scanner sc = new Scanner(System.in);
	
	void Transaction() {
	refUser = new User();	
	refBank = new BankDAOImpl();
	refHPC = new HomePageController();
	
	System.out.println("Type 1: Check Available Bank Balance\nType 2: Deposit Amount\nType 3: Withdraw Amount");
	System.out.println("Enter Your Choice:");
	//userChoice = sc.nextInt();
	
	try {
		//String thisString = input.nextLine();
		//int inInt = Integer.parseInt(thisString);
		
		userChoice = Integer.parseInt(sc.next());
		while (userChoice <= 0 || userChoice > 3) {
		System.out.println("Choice Not Available !!\n\nEnter Your Choice: ");
		userChoice = sc.nextInt();
	}// end of loop
	
	if (userChoice == 1) {
		// Call Bank Balance
		refBank.checkAccount(refUser);
		prompt();
		
	}// end of if
	
	else if (userChoice == 2){
		// call Deposit
		refBank.deposit(refUser);
		prompt();
	}
	
	else {
		// call Withdraw
		refBank.withdraw(refUser);
		prompt();
	}
	}
	catch(NumberFormatException ex)
	{
		System.out.println("Invalid Input");
		
	}
}//end of transaction
	
	void prompt()
	{
		System.out.println("Do You Wish To Continue? (y/n)");
		UChoice = sc.next();
		if(UChoice.equalsIgnoreCase("y")) {
			Transaction();
		}//end of if
		
		else if(UChoice.equalsIgnoreCase("n")) {
			System.out.println("Thanks you for banking with us !!");
			refHPC.userInput();
		}//end of else*/
	}
	
	
}
