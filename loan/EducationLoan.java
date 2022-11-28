package loan;

import java.util.Scanner;

public class EducationLoan extends Loan
{
	public void purpose()
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Kindly Choose and Enter the purpose of taking the Education Loan among the listed below");
		System.out.println("UG");
		System.out.println("PG");
		System.out.println("PhD");
		System.out.println("Certification");
		System.out.println("Diploma");
		purpose= scan.nextLine();
		purpose=purpose.toLowerCase();
	}
	
	public void rateOfInterest()
	{
		switch(purpose)
		{
			case "ug" :
				rateOfInterest= 9.0f/12/100;
				break;
			case "pg" :
				rateOfInterest= 9.5f/12/100;
				break;
			case "phd" :
				rateOfInterest= 10.0f/12/100;
				break;
			case "certification" :
				rateOfInterest= 9.5f/12/100;
				break;
			case "diploma" :
				rateOfInterest= 9.0f/12/100;
				break;
			default :
				rateOfInterest= 9.5f/12/100;
		}
	}
	
	public void display()
	{
		System.out.println("Your Education Loan application is approved.");
		System.out.println("The Scanctioned amount is: "+ principleAmount);
		System.out.println("Your EMI starts after completing your education and on your acceptance to pay EMI");
		System.out.println("The EMI amount to be paid every Month before 5th is: "+ emi);
		System.out.println("All the best");
	}
}
