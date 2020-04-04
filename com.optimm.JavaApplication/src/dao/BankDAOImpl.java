package dao;

import java.util.Scanner;

import pojo.User;

public class BankDAOImpl implements BankDAOInterface {

	private int balanceAmount, depositAmount, withdrawAmount, totalAmount; 
	private String userChoice;
	
	//User refUser = new User();
	Scanner sc = new Scanner(System.in);
	
	//check balance amount
	@Override
	public void checkAccount(User refUser) {
		// TODO Auto-generated method stub
		balanceAmount = refUser.getAmount();
		System.out.println("Your current balance is: "+ balanceAmount);
	}

	//deposit method
	@Override
	public void deposit(User refUser) {
		// TODO Auto-generated method stub
		System.out.println("Enter an amount to deposit: ");
		depositAmount = sc.nextInt();//user input
		
		//if desposit amount is less than 0
		//prints error message
		//and ask user to enter the correct amount
		if(depositAmount < 0) {
			System.out.println("Amount cannot be negative\n");
			System.out.println("Enter an amount to deposit: ");
			depositAmount = sc.nextInt();
			
		} 	
		else {
			balanceAmount = refUser.getAmount(); //get the balance amount from POJO class
			totalAmount = balanceAmount + depositAmount; //calculate 
			refUser.setAmount(totalAmount);//set the new balance amount 
			System.out.println(depositAmount + " dollar deposited successfully!!");
		}
	}

	@Override
	public void withdraw(User refUser) {
		// TODO Auto-generated method stub
		System.out.println("Enter an amount: ");
		withdrawAmount = sc.nextInt();
		
		if(withdrawAmount > refUser.getAmount()) {
			System.out.println("Sorry!! Insufficient balance.");
			//withdrawAmount = sc.nextInt();
		} 
		
		else {
			balanceAmount = refUser.getAmount();
			totalAmount = balanceAmount - withdrawAmount;
			refUser.setAmount(totalAmount);
			System.out.println("Transaction successful !!");
		}
	}
}
