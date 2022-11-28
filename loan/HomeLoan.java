package loan;

import java.util.Scanner;

public class HomeLoan extends Loan
{
	public void purpose()
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Kindly Choose and Enter the purpose of taking the Home Loan among the listed below");
		System.out.println("new construction");
		System.out.println("reconstruction");
		System.out.println("flats");
		System.out.println("land construction");
		purpose= scan.nextLine();
		purpose=purpose.toLowerCase();
	}
	
	public void rateOfInterest()
	{
		switch(purpose)
		{
			case "new construction" :
				rateOfInterest= 9.5f/12/100;
				break;
			case "reconstruction" :
				rateOfInterest= 9.0f/12/100;
				break;
			case "flats" :
				rateOfInterest= 9.0f/12/100;
				break;
			case "land construction" :
				rateOfInterest= 9.5f/12/100;
				break;
			default :
				rateOfInterest= 9.5f/12/100;
		}
	}
	
	public void display()
	{
		System.out.println("Your Home Loan application is approved.");
		System.out.println("The Scanctioned amount is: "+ principleAmount);
		System.out.println("The EMI amount to be paid every Month before 5th is: "+ emi);
		System.out.println("All the best");
	}
}
