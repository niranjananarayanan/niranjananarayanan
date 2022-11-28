package loan;

import java.util.Scanner;

public class CarLoan extends Loan
{
	public void purpose()
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Kindly Choose and Enter the purpose of taking the Car Loan among the listed below");
		System.out.println("new");
		System.out.println("seconds");
		System.out.println("accessories");
		System.out.println("repair");
		purpose= scan.nextLine();
		purpose=purpose.toLowerCase();
	}
	
	public void rateOfInterest()
	{
		switch(purpose)
		{
			case "new" :
				rateOfInterest= 9.5f/12/100;
				break;
			case "seconds" :
				rateOfInterest= 9.5f/12/100;
				break;
			case "accessories" :
				rateOfInterest= 10.0f/12/100;
				break;
			case "repair" :
				rateOfInterest= 9.5f/12/100;
				break;
			default :
				rateOfInterest= 9.5f/12/100;
		}
	}

	public void display()
	{
		System.out.println("Your Car Loan application is approved.");
		System.out.println("The Scanctioned amount is: "+ principleAmount);
		System.out.println("The EMI amount to be paid every Month before 5th is: "+ emi);
		System.out.println("All the best");
	}
}
