package loan;

import java.util.*;

public class PersonalLoan extends Loan
{
	public void purpose()
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Kindly Choose and Enter the purpose of taking the Personal Loan among the listed below");
		System.out.println("debt");
		System.out.println("emergency expense");
		System.out.println("project");
		System.out.println("funeral");
		System.out.println("vacation");
		System.out.println("purchase");
		System.out.println("family events");
		purpose= scan.nextLine();
		purpose=purpose.toLowerCase();
	}
	
	public void rateOfInterest()
	{
		switch(purpose)
		{
			case "debt" :
				rateOfInterest= 9.5f/12/100;
				break;
			case "emergency expense" :
				rateOfInterest= 9.5f/12/100;
				break;
			case "project" :
				rateOfInterest= 10.0f/12/100;
				break;
			case "funeral" :
				rateOfInterest= 9.5f/12/100;
				break;
			case "vacation" :
				rateOfInterest= 10.5f/12/100;
				break;
			case "purchase" :
				rateOfInterest= 10.0f/12/100;
				break;
			case "family events" :
				rateOfInterest= 10.3f/12/100;
				break;
			default :
				rateOfInterest= 9.5f/12/100;
		}
	}
	
	public void display()
	{
		System.out.println("Your Personal Loan application is approved.");
		System.out.println("The Scanctioned amount is: "+ principleAmount);
		System.out.println("The EMI amount to be paid every Month before 5th is: "+ emi);
		System.out.println("All the best");
	}
}
