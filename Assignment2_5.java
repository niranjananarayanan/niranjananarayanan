//selection sort
import java.util.Scanner;

public class Assignment2_5 {

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
		
		for(int i = 0; i <a.length - 1; i++)  
	        {  
	            int index = i;  
	            for (int j = i + 1; j < a.length; j++)
	            {  
	                if (a[j] < a[index])  
	                    index = j;
                }  
	            int smallerNumber = a[index];   
	            a[index] = a[i];  
	            a[i] = smallerNumber;  
	        }
 
	     System.out.println();
			
			System.out.println("Sorted array values are");
			for (int k:a)
				System.out.print(k+" ");

	}

}
