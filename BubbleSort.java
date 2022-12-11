package Array;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[]=new int[10],i,j ,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 elements in an array");
		for(i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Before swapping , values are:");
		for(i=0;i<10;i++)
		{
			System.out.println(arr[i]+ " ");
		}
		
		//sorting
		for(i=0;i<10;i++)
		{
		   /*place currently selected elements arr[i] to its current position*/
			for(j=i+1;j<10;j++)
			{
				/*swap if currently selected element is not at its current position*/
				
				if(arr[i] < arr[j])   //for ascending order change < to > and descending order > to <
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		//external for
		
		System.out.println("\nAfter sorting in ascending order, values are:");
		for(i=0;i<10;i++)
		{
			System.out.println(arr[i]+" ");
		}

	}

}
