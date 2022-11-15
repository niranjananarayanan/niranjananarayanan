//Anagram

package assignment4;

import java.util.Scanner;

public class Assignment4_5 {

	public static void main(String[] args) {
		
		String s1="";
		Scanner scan1= new Scanner(System.in);
		System.out.println("Write any string");
		s1= scan1.nextLine();
		
		String s2="";
		Scanner scan2= new Scanner(System.in);
		System.out.println("Write any string");
		s2= scan2.nextLine();
		
		System.out.println("The entered First String is:");
		System.out.println(s1);
		System.out.println();
		System.out.println("The entered Second String is:");
		System.out.println(s2);
		
		char[] ch1= s1.toCharArray();
		char[] ch2= s2.toCharArray();
		
		for(int i=0; i<ch1.length; i++)
		{
			for(int j=i+1; j<ch1.length-1; j++)
			{
				if(ch1[j]<ch1[i])
				{
					char dummy=ch1[j];
					ch1[j]=ch1[i];
					ch1[i]=dummy;
				}
			}
		}
		
		System.out.println();
		System.out.println("The Sorted First String is:");
		for(char c:ch1)
			System.out.print(c);
		
		System.out.println();
		for(int i=0; i<ch2.length; i++)
		{
			for(int j=i+1; j<ch2.length-1; j++)
			{
				if(ch2[j]<ch2[i])
				{
					char dummy=ch2[j];
					ch2[j]=ch2[i];
					ch2[i]=dummy;
				}
			}
		}
		
		System.out.println();
		System.out.println("The Sorted Second String is:");
		for(char c:ch1)
			System.out.print(c);
		System.out.println();
		boolean b=false;
		for(int i=0; i<s1.length(); i++)
		{
			for(int j=0; j<s2.length(); ++j)
			{
				if(s1.charAt(i)==s2.charAt(j) && i==j)
					b=true;
				else
					b=false;
			}
		}
		
		System.out.println();
		if(b==true)
			System.out.println("The given String is an Anagram");
		else
			System.out.println("The given String is not an Anagram");

	}

}
