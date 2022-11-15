//to count consonants, vowels and special characters

package assignment4;

import java.util.Scanner;

public class Assignment4_4 {

	public static void main(String[] args) {
		
		String s1="";
		Scanner scan= new Scanner(System.in);
		System.out.println("Write any string with duplicte elements");
		s1= scan.nextLine();
		
		System.out.println("The entered String is:");
		System.out.print(s1); 
		
		int vowels = 0, consonants = 0, digits = 0, spaces = 0, specialChar=0;
	    s1 = s1.toLowerCase();
	    
	    for (int i = 0; i < s1.length(); ++i) 
	    {
	    	char ch = s1.charAt(i);
	    	if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
	    		++vowels;
	        else if ((ch >= 'a' && ch <= 'z')) 
	        	++consonants;
	        else if (ch >= '0' && ch <= '9')
	        	++digits;
	        else if (ch == ' ') 
	        	++spaces;
	        else
	        	++specialChar;
	    
	    }

	    System.out.println("Vowels: " + vowels);
	    System.out.println("Consonants: " + consonants);
	    System.out.println("Digits: " + digits);
	    System.out.println("White spaces: " + spaces);
	    System.out.println("Other special charaters: " + specialChar);
	 
	}

}
