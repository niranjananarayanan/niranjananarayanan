//subset
import java.util.Scanner;

public class Assignment2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input1,input2;
		Scanner x= new Scanner(System.in);
		System.out.println("Enter no of value of the array 1 & 2");
		input1= x.nextInt();
		input2= x.nextInt();
		
		int a[]= new int[input1];
		int b[]= new int[input2];
		Scanner y= new Scanner(System.in);
		System.out.println("Enter input value");
		for(int k=0; k<a.length; k++)
			a[k]=y.nextInt();
		
		Scanner z= new Scanner(System.in);
		System.out.println("Enter input value");
		for(int k=0; k<b.length; k++)
			b[k]=y.nextInt();
		
		System.out.println("Entered values of array are");
		for (int k:a)
			System.out.print(k+" ");
		System.out.println();
		for (int k:b)
			System.out.print(k+" ");
		
		System.out.println();
		boolean ifSubset= false;
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<b.length-1; j++)
			{
				if(a[i]==b[j])
				{
					ifSubset=true;
					break;
				}
				
			}
			
		}
		
		if(ifSubset==true)
			System.out.println("Array b is subset of a");
		else 
			System.out.println("Array b is not subset of a");
	}

}
				

	