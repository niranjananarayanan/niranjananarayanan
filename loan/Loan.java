package loan;

import java.util.*;

abstract public class Loan 
{
	String name;
	String accountNum;
	String mobileNum;
	String aadharNum;
	String purpose;
	float rateOfInterest;
	int loanTenure;
	long principleAmount;
	double emi;
	
	abstract public void purpose();
	abstract public void rateOfInterest();
	abstract public void display();
	
	public void input()
	{
		Scanner scan1= new Scanner(System.in);
		System.out.println("Please Enter you nmae");
		name=scan1.nextLine();
		
		Scanner scan2= new Scanner(System.in);
		System.out.println("Please Enter your 11 digit Account Number");
		accountNum=scan2.nextLine();
		while(accountNum.length()!=11)
		{
			System.out.println("Entered Account Number is wrong");
			System.out.println("Please Re-Enter you Account Number");
			accountNum=scan2.nextLine();
		}
		
		Scanner scan3= new Scanner(System.in);
		System.out.println("Please Enter you Mobile Number");
		mobileNum=scan3.nextLine();
		while(mobileNum.length()!=10)
		{
			System.out.println("Entered Mobile Number is wrong");
			System.out.println("Please Re-Enter you Mobile Number");
			mobileNum=scan3.nextLine();
		}
		
		Scanner scan4= new Scanner(System.in);
		System.out.println("Please Enter you Aadhar Number");
		aadharNum=scan4.nextLine();
		while(aadharNum.length()!=12)
		{
			System.out.println("Entered Aadhar Number is wrong");
			System.out.println("Please Re-Enter you Aadhar Number");
			aadharNum=scan4.nextLine();
		}
		
		Scanner scan5= new Scanner(System.in);
		System.out.println("Please Enter Required Loan Amount in numbers");
		principleAmount=scan5.nextLong();
		
		Scanner scan6= new Scanner(System.in);
		System.out.println("Please Enter Required Loan Tenure as number of months");
		loanTenure=scan6.nextInt();
	}
	
	public void emi()
	{
		emi= (principleAmount * rateOfInterest)* (((Math.power((1+rateOfInterest),loanTenure))/((Math.power((1+rateOfInterest),loanTenure)-1))));
	}
	
}
