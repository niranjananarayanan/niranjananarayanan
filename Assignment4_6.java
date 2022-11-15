//panagram
//s1=The quick brown fox jumps over the lazy dog
package assignment4;

import java.util.Scanner;

public class Assignment4_6 {

	public static void main(String[] args) {
		
		String s1="";
		Scanner scan1= new Scanner(System.in);
		System.out.println("Write any string");
		s1= scan1.nextLine();
		
		System.out.println("The entered First String is:");
		System.out.println(s1);
		
		boolean[] alphaList = new boolean[26];
	    int index = 0;
	    int flag = 1;
	    for (int i = 0; i < s1.length(); i++) 
	    {
	         if ( s1.charAt(i) >= 'A' && s1.charAt(i) <= 'Z') 
	            index = s1.charAt(i) - 'A';
	         else if( s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z')
	            index = s1.charAt(i) - 'a';
	         alphaList[index] = true;
	    }
	   
	    for (int i = 0; i <= 25; i++) 
	    {
	    	if (alphaList[i] == false)
	    		flag = 0;
	    }
	  	   
	    System.out.println();
	    if (flag == 1)
	    	System.out.print("The given string is a pangram.");
	    else
	    	System.out.print("The given string is not a pangram.");
	
	}

}
