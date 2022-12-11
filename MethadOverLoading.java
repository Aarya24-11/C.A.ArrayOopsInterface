package OOPsConsept;

class Calculator
{

	//int add(int a,int b,int c, int d, int e)
	float add(float a,float b,float c, float d, float e)
	{
		return a+b+c+d+e;
	}
	
	//double add(double a,int b)
	float add(float a,int b)
	{
		return a+b;
	}
	// double add(int a, double b)
	float add(int a, float b)
		{
			return a+b;
		}	
}

public class MethadOverLoading {

	public static void main(String[] args) {
       Calculator calc=new Calculator();
       System.out.println(calc.add(10, 45, 45, 55, 10f));

	}

}
