package in.xxx.Banking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BankingApplication{

	public static void main(String[] args) {
		
		double amount=1000;
		final String username = "ram";
		final String password= "$ram@98";
		
		System.out.println("********************CONSOLE BASED APPLICATION********************");
		System.out.println();
		System.out.println();
		System.out.println("***********************WELCOME TO XXX BANK***********************");
		System.out.println();
		System.out.println();
		System.out.println("Kilndly login to do any activity on your account");
		System.out.println();
		
		boolean login=login(username, password);
		if(login)
		{		
			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				while (true) 
				{
					System.out.println("1. CHECK BALANCE");
					System.out.println("2. DEPOSIT");
					System.out.println("3. WITHDRAW");
					System.out.println("4. EXIT");
					System.out.println();
					System.out.print("ENTER YOUR CHOICE, PRESS[1/2/3/4]::  ");
					System.out.println();
					String option =br.readLine();
					
					switch (option) {
					case "1":
						amount= checkBalance(amount);
						break;
					case "2":
						amount= deposit(amount);
						break;
					case "3":
						amount= withdraw(amount);
						break;
					case "4":
						System.out.println("******* Thanks for using the application *****");
						System.exit(0);
						break;
					
					default:
						System.out.println("Invalid option plz try agin with valid options....");
						break;}
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}else
			System.exit(0);
			System.out.println("******* Thanks for using the application *****");
	}

	private static boolean login( String username,  String password) {
		System.out.println("Enter the Username");
		Scanner scan= new Scanner(System.in);
		String inputUsernmae =scan.next();
		System.out.println("Enter Password");
		String inputPassword= scan.next();
		if(inputUsernmae.equalsIgnoreCase(username))
		{
			if (inputPassword.equals(password))
			{
				System.out.println("Loggedin Successfully");
				return true;
			}
			else
			{
				System.out.println("Invalid Password");
				System.out.println("Please try again from the Initial Step");
				return false;
			}
		}
		else
		{
			System.out.println("Invalid Username or Password");
			System.out.println("Please try again from the Initial Step");
			return false;
		}
	}

	private static double withdraw(double amount) {
		
		System.out.println("Enter the withdraw Amount");
		Scanner scan= new Scanner(System.in);
		double withdraw =scan.nextInt();
		if(withdraw<amount)
		{
			amount=amount-withdraw;
			System.out.println("Rs."+ withdraw+" is withdrawn from your Account");
			System.out.println("Current Available Balance is Rs."+ amount);
			return amount;
		}
		else
		{
			System.out.println("Low Balance");
			System.out.println("Current Available Balance is Rs."+ amount);
			return amount;
		}
	}
	
	private static double deposit(double amount) {
		
		System.out.println("Enter the Deposit Amount");
		Scanner scan= new Scanner(System.in);
		int deposit =scan.nextInt();
		amount=amount+deposit;
		System.out.println("Rs."+ deposit+" is deposited to your Account");
		System.out.println("Current Available Balance is Rs."+ amount);
		return amount;
		
	}

	private static double checkBalance(double amount) {
		
		System.out.println("Available Balance is Rs."+ amount);
		return amount;
	}

}
