package Array;


public class MatrixAdditionArray {

	public static void main(String[] args) {
	
		//Creating two matrices
		int a[][]= {{123},{234},{567}};
		int b[][]= {{123},{234},{567}};
		
		//creating another matrix to store the sum of two matrices
		int c[][]=new int[3][3]; //3row and 3columns
		
		//adding and printing addition of 2 matrices
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
			c[i][j]=a[i][j]+b[i][j]; //use-for subtraction
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
		System.out.print(c[i][j]+" ");
			}
		
       System.out.println(); //new line
	}

	}
}

