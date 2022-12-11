package Array;

public class ReturnArrayFromMethod {

	static int[] getArray()
	{
		int arr[]=new int[] {30,54,98,65};
		return arr;
	}
	public static void main(String[] args) {
	 int arr []=getArray();	
for(int i:arr)
{
	System.out.println(i);
      }
      
        //getting classname of java array
        Class c=arr.getClass();
        System.out.println("class name:" +c);
        
        //Convert to string 
        String name=c.getName();
        System.out.println("class name string representation:" +name);


	}

}
