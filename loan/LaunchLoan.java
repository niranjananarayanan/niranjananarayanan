package loan;

import java.util.Scanner;

class LoanApplication
{
	public void application(Loan loan)
	{
		loan.input();
		loan.purpose();
		loan.rateOfInterest();
		loan.emi();
		loan.display();
	}
}

public class LaunchLoan {

	public static void main(String args[]) {
		
		System.out.println("Our branch offers wide range of loans to meet your needs. "
			+ "\nKindly fill the Application of your choice of your loan to enable to take a first step to convert your dreams to realities");
		System.out.println();
				
		Scanner scan= new Scanner(System.in);
		System.out.println("Kindly Choose and Enter the choice of your loan listed below");
		System.out.println("Personal Loan");
		System.out.println("Education Loan");
		System.out.println("Home Loan");
		System.out.println("Car Loan");
		String loan= scan.nextLine();
		loan=loan.toLowerCase().replace(" ", "");
		
		Loan personalloan= new PersonalLoan();
		Loan educationloan= new EducationLoan();
		Loan homeloan= new HomeLoan();
		Loan carloan= new CarLoan();
		
		LoanApplication loanApplication= new LoanApplication();
		switch(loan)
		{
			case "personalloan" :
				loanApplication.application(personalloan);
				break;
			case "educationloan" :
				loanApplication.application(educationloan);
				break;
			case "homeloan" :
				loanApplication.application(homeloan);
				break;
			case "carloan" :
				loanApplication.application(carloan);
				break;
		}
	}
}

