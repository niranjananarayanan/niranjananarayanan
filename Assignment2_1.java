//duplicate elements
import java.util.Scanner;

public class Assignment2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input;
		Scanner x= new Scanner(System.in);
		System.out.println("Enter no of value of the array");
		input= x.nextInt();
		
		int a[]= new int[input];
		Scanner y= new Scanner(System.in);
		System.out.println("Enter Positive / Non Zero Integer input value");
		for(int k=0; k<a.length; k++)
			a[k]=y.nextInt();
		
		System.out.println("Entered values of array are");
		for (int k:a)
			System.out.print(k+" ");
		
		int dummy=0;
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=1; j<a.length; j++)
			{
				if(a[j]<a[j-1])
				{
					dummy=a[j];
					a[j]=a[j-1];
					a[j-1]=dummy;
				}
			}
		}
		System.out.println();
		
		System.out.println("Sorted array values are");
		for (int k:a)
			System.out.print(k+" ");

		boolean b=false; int d[]= new int[a.length];  int temp=1;
		
		System.out.println(" ");
		
		
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
		System.out.println("Duplicates are");
		for(int k=0; k<d.length; k++ )
		{
			if(d[k]!=0&& d[k+1]!=d[k])
				System.out.print(d[k]+" ");
		}
			
		if(b==false)
			System.out.println("No duplicates present");

	}

}
