//quick sort
import java.util.Scanner;

class QuickSort
{
public int partion(int arr[],int left, int right)
{
	int pivot = arr[left];    
	int i = left;
	for(int j = left+1;j <= right;j++)
	{
		if(arr[j] < pivot)
		{
			i++; 
			swap(arr,i,j);   
		}
	}

	swap(arr,i,left);
	return i;
}

public void quicksort(int arr[],int low, int high)
{
	if(low < high)
	{
		int p = partion(arr,low,high);
		quicksort(arr,low,p-1);
		quicksort(arr,p+1,high);
	}
}
public void swap(int arr[],int i, int j)
{
	int temp = arr[i];
	arr[i] = arr[j];
	arr[j] = temp;
}

}

public class Assignment2_2 {

	public static void main (String[] args) {

		
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
		

		System.out.println();
		
				
		int high= a.length-1, low=0;
		QuickSort obj= new QuickSort();
		obj.quicksort(a, low, high);
				
		
		System.out.println("Sorted array values are");
		for (int k:a)
			System.out.print(k+" ");
		
	}
	
}




				



