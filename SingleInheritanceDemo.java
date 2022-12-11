package OOPsConsept;

class Parent
{
	int id;
	String name, address;
	
	public Parent(int id, String name, String address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
	}
	void display()
	{
		System.out.println("id:" +id);
		System.out.println("name:" +name);
		System.out.println("address:" +address);
	}
	//void parentMethod()
	//{
		//System.out.println("this is parent class method");
	//}
}

class Child extends Parent
{
	float marks;;
	public Child(int id, String name, String address, float marks)
	{
	     super(id,name,address);
		this.marks=marks;
	}
	void getData()
	{
		float marks=95.0f; 
		super.display();
		System.out.println("marks;" +marks);
		System.out.println("Parent marks;" +marks);
	}
	//void childMethod()
	//{
	//System.out.println("this is child class Method");
	//}
}
public class SingleInheritanceDemo {

	public static void main(String[] args) {
     
		Child obj=new Child(1,"Aarya", "Delhi", 90f);
		//obj.parentMethod();
		//obj.childMethod();
        obj.getData();

	}

}
