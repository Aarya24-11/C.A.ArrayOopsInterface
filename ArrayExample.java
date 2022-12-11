package Array;

import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		int arr[], size, i, key, pos=-1;
		boolean flag=false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		size=sc.nextInt(); //20
		
		//instantiate array 
		arr=new int[size];
		
		//initialize the array
		System.out.println("Enter " +size+" elements in a array!!");
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		//input for search element
		System.out.println("Enter " +size+" elements you want to search for!!");
        key=sc.nextInt();
        for(i=0;i<size;i++) //i=5<10t
        {
        	if(arr[i]==key) //arr[5] =23 ==23t
        	{
        	//	pos=i; //pos=5
        	 //break;
        	flag=true;
        	break;
        	}
        }
        if(flag!=false)
        	System.out.println(key+ "found at " +(i+1)+ "position");	
        else
        	System.out.println("data not found in an array!");
        
        //if(pos== -i)
        // System.out.println("data not found in an array !");
        //else
        //System.out.println("key+ "found at  "+(pos+1)+"nposition");	
        }

}
