package controller;

import java.util.Scanner;

import pojo.User;

public class HomePageController {

	RegisterController refRegCon; //ref object for registerController class
	ForgetPasswordController refFpass; //ref object for forgetPasswordContoller
	LoginController refLogCon;//ref object for loginController
	User refUser; //ref obj for user class
	
	public void userInput()
	{
		Scanner uInput = new Scanner(System.in); //ref obj for scanner class
		
		//prints output to guide the user on 
		//which features they want to use 
		System.out.println("User Home Page:");
		System.out.println("1. Register");
		System.out.println("2. Login");
		System.out.println("3. Forget Password");
		System.out.println("4. Logout");

		System.out.println("Enter your Choice: ");
		
		int userChoice = uInput.nextInt(); //user input must be int
		
		//checks user input
		switch(userChoice) {
		  case 1: //if input is 1,
			  refRegCon = new RegisterController();
			  refRegCon.registerUser();//call registerUser method
		    break;
		  case 2: //if input is 2
		    // call login function
			  refLogCon = new LoginController();
			  refLogCon.login();//call login method
		    break;
		  case 3://if input is 3
			// call forget password function
			  	refFpass = new ForgetPasswordController();
			  	refFpass.renewPassword();//call renew password method
			    break;
		  case 4://if user input is 4
			// call logout function
			  System.out.println("Logout successful !!");//prints logout message
			    break;
		  default://if input is not 1,2,3 or 4
		    // Print invalid input
			System.out.println("Invalid input!");
			
			userInput();//call user input method
		}
		
	}
	
	
	
}
