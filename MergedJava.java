package Array;

import java.util.Scanner;
public class MergedJava {

	public static void main(String[] args) {
	 int first[],sec[],third[],size1,size2,i , k;
     Scanner sc=new Scanner(System.in);
     
     //initialize the first array
     System.out.println("Enter size of first array");
     size1=sc.nextInt();
     first=new int[size1];
     System.out.println("Enter"+ size1+ "elements in the first array");
     for(i=0;i<size1;i++)
     {
    	 first[i]=sc.nextInt();
     }
     
     //initialize the second array
     System.out.println("Enter size of second array");
     size2=sc.nextInt();
     sec=new int[size2];
     System.out.println("Enter"+ size2+ "elements in the first array");
     for(i=0;i<size2;i++)
     {
    	 sec[i]=sc.nextInt();
     }
     
     //initialize the third array
     third=new int[size1 + size2];
     
     //assign first array elements into the third array
     
     for(i=0;i<size1;i++)
     {
    	 third[i]=first[i];   //third[0]=first[0];
    	 }
     
       //assigning i value to k
       k=i; //5
        
       //assign second elements into the third array
       
       for(i=0;i<size2;i++)  //it will indicate second array
       {
    	   third[k]=sec[i];  //third[5]=sec[0];
    	   //k++
       }
       //print the third array after merging
       System.out.println("And the result is after merging ::");
       for(i=0;i<third.length;i++)
       {
    	   System.out.println(third[i]+" ");
       }
	}

}
