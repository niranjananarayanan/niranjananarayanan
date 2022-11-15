//to print duplicates

package assignment4;

import java.util.Scanner;

public class Assignment4_2 {

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
		
		System.out.println();
		System.out.println("The sorted String is:");
		for(char c:a)
			System.out.print(c);
		
		System.out.println(" ");
		char d[]=new char[a.length];
		int temp=1;
		boolean b=false;
		for(int i=0; i<a.length-1;)
		{
			if(a[i]==a[++i])
			{
				if(d[temp-1]!=a[i])
				{
					d[temp-1]=a[i];
					b=true;
					temp++;
				}
			}
			
		}
		
		
		System.out.println("The String duplicates are:");
	for(int k=0; k<d.length; k++ )
		{
			if(d[k]!=0&& d[k+1]!=d[k])
				System.out.print(d[k]+" ");
		}
			
		if(b==false)
			System.out.println("No duplicates present");



	}

}
