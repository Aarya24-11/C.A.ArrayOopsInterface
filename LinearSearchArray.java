package Array;

import java.util.Scanner;

public class LinearSearchArray {

	public static void main(String[] args) {
		int arr[],size,i,key, pos=-1;
		 Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:");
		size=sc.nextInt();
		
		//instantiate array
		arr=new int[size];
		
		//initialize the array
        System.out.println("Enter" +size+ "elements in an array!!");
        for(i=0;i<size;i++)
        {
        	arr[i]=sc.nextInt();
        }
        
        //input for search elements
        
        System.out.println("eneter element you want to search for!!");
        key=sc.nextInt();
        
        for(i=0;i<size;i++)
        {
        	if(arr[i]==key)  //arr[4] =23 ==23t
        	{
        		pos=i;  //pos=4
        		//break;
        	
        	}
        		}
           if(pos!=-1)
        	System.out.println(key+ "found at " +(pos+1)+ "nposition");
           else
        	   System.out.println("data not found in an array!");
           
           //second method 
           
          // if(pos==-1)
        	//System.out.println("data not found in an array");
           //else
        	 //  System.out.println(key+ "found at" +(pos+1)+"nposition");
           
	}

}
