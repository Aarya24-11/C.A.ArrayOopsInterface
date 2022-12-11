package OOPsConsept;
/*
 * you can,t instantiate abstraction class but you can create reference variable
 */
abstract class AbstractDemo
{
	void fun()
	{
		System.out.println("We are learning with fun");
	}
	abstract void display();
}
//implementation class
class impl extends AbstractDemo
{
	
	@Override
    void display() {
	   System.out.println("display impl class");	
	}
}
class impl2 extends AbstractDemo
{
	
	@Override
    void display() {
	   System.out.println("display impl 2 class");	
	}
}

public class AbstractDemoOn {
    public static void main(String[]args){
    AbstractDemo demo;
    
    demo=new impl();
    demo.fun();
    demo.display();
    
    
    demo=new impl2();
    demo.fun();
    demo.display();	
   }
}

