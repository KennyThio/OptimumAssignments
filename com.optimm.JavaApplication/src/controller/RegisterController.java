package controller;

import java.util.Scanner;

import pojo.User;
import service.ApplicationService;
import service.JavaAppInterface;

public class RegisterController {
	
	private String email;
	private static String password, retypePassword;
	private String securityKey;
	
	Scanner sc = new Scanner(System.in);
	
	private JavaAppInterface refJAI;
	private User refUser;
	private HomePageController refHPC;
	
	
	void registerUser()
	{
		refUser = new User();
		refJAI = new ApplicationService();
		refHPC = new HomePageController();
		
		regEmail();//call user input for email
		
		//checks whether the input is the same as xyz@email.com
		while(email.equals("xyz@gmail.com")) {
			System.out.println("Email already exist!");//print error message
				regEmail();//call user input for email
		}//end of while loop
		
		refJAI.setRegEmail(refUser, email);//set email input to POJO
		//refJAI.getEmail(refUser);//get email string from POJO
		
		System.out.println("Enter Password : ");
		password = sc.next(); //user input must be String
		
		refJAI.setRegPass(refUser, password);//set user input password

		regRetypePass();//call user to retype password
		
		//checks whether the retype password is the same as the user password
		while(!retypePassword.equals(password)) {
			//if fails
			System.out.println("Password doesn't match!!");//print error meassge
			regRetypePass();//call luser to retype again
		}
		
		regSecureKey();//call user to input security key
		
		refJAI.setRegSecure(refUser, securityKey);//set the security key
		
		System.out.println(securityKey + " is your security key, incase if you forget your password.");
		System.out.println("");
		System.out.println("Registration Successful!!");
		
		refHPC.userInput();//go back to homepage
		
	}
	
	void regEmail() {
		System.out.println("Enter email address : ");
		email = sc.next(); //user input must be String
	}
	
	void regRetypePass()
	{
		
		System.out.println("Re-type Password: ");
		retypePassword = sc.next(); //user input must be String
	}
	
	void regSecureKey()
	{
		System.out.println("What is your favourite colour ? ");
		securityKey = sc.next(); 
	}
}
