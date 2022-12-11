package OOPsConsept;
//we can not instantiate interface but we can creat reference variable of interface 
interface MyInterface
{
	public void method1();
	int x=23;
	
	static int cube(int x)
	{
		return x=50;
	}

	//this method is accessible only within this interface and can not be accessible
	//inherited from an interface to another interface 
	private void add(int a,int b)
	{
	System.out.println("add" +(a+b));
	}

	private void sub(int a,int b)
	{
	System.out.println("sub" +(a-b));
	}
	default void fun()
	{
		System.out.println("We can add method body in interface using default ");
        add(20,50);
        sub(50,30);
	}
}
class test 
{
	
	int id;
	test(int id)
	{
this.id=id;
}

	
void getValue()
{
	System.out.println(id);

}
}
interface aa
{
static String draw() 
{
	return"I am here";
}

}

class demoo extends test implements MyInterface,aa
{
	demoo(int id){
		super(id);
		//TODO Auto generated constructer
	}

	@Override
	public void method1() {
		System.out.println("override method of interface");
	   //x=30
		
	}
}
public class IntermofaceDemo {

	public static void main(String[] args) {
	 //demo obj
		demoo obj=new demoo(12); //upcasting
		obj.method1();
		obj.getValue();
		obj.fun();
System.out.println(MyInterface.cube(5));

System.out.println(aa.draw());

 
	}
}






