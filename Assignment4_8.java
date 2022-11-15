//max occurring Char

package assignment4;

import java.util.Scanner;

public class Assignment4_8 {

	public static void main(String[] args) {
		
		String s1="";
		Scanner scan= new Scanner(System.in);
		System.out.println("Write any string with duplicte elements");
		s1= scan.nextLine();
		
		System.out.println("The entered String is:");
		System.out.print(s1);
		
		char maxChar = ' ';
		int max = -1;
		int[] charFreq = new int [254];
		
		for(int i = 0; i < s1.length(); i++)
		{
			charFreq[s1.charAt(i)]++;
		}
		for(int i = 0; i < s1.length(); i++) 
		{
			char ch = s1.charAt(i);
			if(max < charFreq[ch]) 
			{
					max = charFreq[ch];
					maxChar = ch;
			}
		}
		
		System.out.println();
		System.out.println("The Maximum Occurring Character: " +  maxChar + ". And the Character Occurs " + max+ " Times ");
			
	}

}
