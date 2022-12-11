package Array;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		int arr[]=new int[5];
		Scanner sc=new Scanner (System.in);
		//initialization
		//compile time
	//arr[0]=2;
	//arr[1]=3;
		
		//int a[]= {20,45,67,89,12};
		//runtime
		System.out.println("Enter 5 element");
		for(int i=0; i<5; i++)
		{
			arr[i]=sc.nextInt();
		}
		//to print the value 
		System.out.println("5 elements are:");
		for (int i=0; i<5; i++) //I will indicate index
		{
			System.out.println(arr[i]);
		}
		
		//print value using for-each loop
		// java for-each  loop prints the array elements one by . It hold an array 
	    // elements in a variable, the executes
		System.out.println("printing elements using foreach loop");
		for(int var: arr)   //34/65
		{
			System.out.println(var);  //34/65
		}
	}

}
