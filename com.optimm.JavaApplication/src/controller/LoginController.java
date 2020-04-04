package controller;

import java.util.Scanner;


import pojo.User;
import service.ApplicationService;
import service.JavaAppInterface;

public class LoginController {
	
	TransactionController refTransController;//ref obj for TransactionController class
	
	private String email, option;
	private static String password;
	
	private User refUser; //ref obj for user class

	Scanner sc = new Scanner(System.in);//ref obj for scanner class
	
	void login() {
		refUser = new User();
		refTransController = new TransactionController();
		
		loginUserpass(); //call loginUserpass method
		
		//checks whether if email is not equal to opt@gmail.com
		//or password is not equal to xyz123
		while(!email.equals("opt@gmail.com") || !password.equals("xyz123")){
			System.out.println("User ID/Password does not match");//prints error message
			loginUserpass();//call loginUserPass method 
		} // end of loop
			
			System.out.println("\nLogin Successful !!\n\n");
			refTransController.Transaction();//call transaction method from TransactionController class
			
			System.out.println("Do You Wish To Continue? (y/n)");
			option = sc.next();
			
			//if user input is 'y'
			if(option.equalsIgnoreCase("y")) {
				refTransController.Transaction();//call transaction method from TransactionController class
			}//end of if
			
			else if(option.equalsIgnoreCase("n")) {//if user input is 'n'
				System.out.println("Thanks you for banking with us !!");//print message
			}//end of else*/
			
	}// end of login
	
	void loginUserpass() {
		System.out.println("Enter User ID: ");
		email = sc.next(); // Receive input for userID
		System.out.println("Password: ");
		password = sc.next(); // Receive input for password
	}
}
