//string contain unique char

package assignment4;

import java.util.Scanner;

public class Assignment4_7 {

	public static void main(String[] args) {
		
		String s1="";
		Scanner scan= new Scanner(System.in);
		System.out.println("Write any string with duplicte elements");
		s1= scan.nextLine();
		
		System.out.println("The entered String is:");
		System.out.print(s1);
		
		char a[]=s1.toCharArray();
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[j]<a[i])
				{
					char dummy=a[j];
					a[j]=a[i];
					a[i]=dummy;
				}
			}
		}
		
		System.out.println(" ");
		char d[]=new char[a.length];
		int temp=1;
		boolean b=true;
		for(int i=0; i<a.length-1;)
		{
			if(a[i]==a[++i])
			{
				if(d[temp-1]!=a[i])
				{
					d[temp-1]=a[i];
					b=false;
					temp++;
				}
			}
			
		}
		
					
		if(b==true)
			System.out.println("All the characters in the string are unique.");
		else
			System.out.println("The string contains Duplicates.");

	}

}
