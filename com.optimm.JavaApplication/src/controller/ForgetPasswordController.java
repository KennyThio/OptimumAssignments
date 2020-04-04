package controller;

import java.util.Scanner;

import pojo.User;
import service.ApplicationService;
import service.JavaAppInterface;


public class ForgetPasswordController {
	
	private JavaAppInterface refJAI;
	private User refUser;
	private HomePageController refHPC;
	
	private String email;
	private static String password, retypePassword;
	private String Epassword; //existing password
	private String Npassword; //new password
	private String securityKey;
	
	Scanner sc = new Scanner(System.in);
	void renewPassword()
	{
		refUser = new User(); //create ref obj from POJO class
		refJAI = new ApplicationService(); //create ref obj from service class
		refHPC = new HomePageController();//create ref obj from homepage controller class
		
		promptEmail();//call method prompt email
		promptKey();//call method prompt security key
		
		//checks whether user input email is "opt@gmail.com" and the input
		//security key is "black"
		while(!email.equals("opt@gmail.com") || !securityKey.equals("black")) {
			System.out.println("Email and security key does not match. Please enter again.");
			//if input is not correct
			promptEmail();//call method prompt email
			promptKey();//call method prompt security key
		}//end of while
		
			refUser.setEmailAddress("opt@gmail.com"); //set email address
			refUser.setSecurityKey("black");//set security key
			
			promptPass();//call method prompt password
			
			refJAI.setRegPass(refUser,Npassword); //set user input new password
			
			//check whether new password is the same as existing password
			while(refJAI.validatePass(refUser)==false)
			{
				System.out.println("Password can not be the same as the old one!"); //display error message when user input wrongly
				promptPass();//call prompt password method
				refJAI.setRegPass(refUser,Npassword);
				//if(refJAI.validatePass(refUser)==true)
				
			}//end of if
			
				
				regRetypePass();//call method prompt retype password
			
			//check whether retype password is the same as new password
			while(!retypePassword.equals(Npassword)) {
				//if not the same
				System.out.println("Password doesn't match!!");//print error message
				regRetypePass();//call method retype password

		}//end of while

			promptKey();//call method to prompt user to enter secrity key
			
			refJAI.setRegSecure(refUser, securityKey);//set the newly input security key
			
			System.out.println(securityKey + " is your security key, incase if you forget your password.");
			System.out.println("");
			System.out.println("Your password has been reset successfully!!");
			
		refHPC.userInput();//go back to homepage controller
}

void promptEmail() {
	System.out.println("Enter email address : ");
	email = sc.next(); //user input must be String
}

void promptPass()
{
	System.out.println("Enter new password : ");
	Npassword = sc.next(); //user input must be String
}

void regRetypePass()
{
	
	System.out.println("Re-type Password: ");
	retypePassword = sc.next(); //user input must be String
}

void promptKey()
{
	System.out.println("What is your favourite colour ? ");
	securityKey = sc.next(); 
}
}
