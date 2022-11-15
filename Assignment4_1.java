//to remove duplicates

package assignment4;

import java.util.*;

public class Assignment4_1 {

	public static void main(String[] args) {
		
		String s1="";
		Scanner scan= new Scanner(System.in);
		System.out.println("Write any string with duplicte elements");
		s1= scan.nextLine();
		
		System.out.println("The entered String is:");
		System.out.print(s1);
		
		char a[]=s1.toCharArray();
		
		String targetStr = "";
		  for (char value: a) 
		  {
			  if (targetStr.indexOf(value) == -1)
				  targetStr += value;
		  }
		
		System.out.println();
		System.out.println("The String without duplicates:");
		System.out.println(targetStr);
	}

}
