//bubble sort
import java.util.Scanner;

public class Assignment2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input;
		Scanner x= new Scanner(System.in);
		System.out.println("Enter no of value of the array");
		input= x.nextInt();
		
		int a[]= new int[input];
		Scanner y= new Scanner(System.in);
		System.out.println("Enter input value");
		for(int k=0; k<a.length; k++)
			a[k]=y.nextInt();
		
		System.out.println("Entered values of array are");
		for (int k:a)
			System.out.print(k+" ");
		
		int d=0;
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=1; j<a.length; j++)
			{
				if(a[j]<a[j-1])
				{
					d=a[j];
					a[j]=a[j-1];
					a[j-1]=d;
				}
			}
		}
		System.out.println();
		
		System.out.println("Sorted array values are");
		for (int k:a)
			System.out.print(k+" ");

}

}
