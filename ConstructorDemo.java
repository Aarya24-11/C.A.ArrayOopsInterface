package OOPsConsept;
class Employee
{
	int id;
	String name,designation;
	double basicSalary;
	static String organisation="Anudip"; //class /static variable

	//parameterised Constructor //
	//it will not Return
      public Employee(int id, String name, String designation, double basicSalary)
		{
		this.id=id;
		this.name=name;
		this.designation=designation;
		this.basicSalary=basicSalary;
	}
	
	public void display()
	{
		System.out.println("Id: "+this.id+" "+"Name:"+this.name+    "Designation:"+this.designation+  
				"BasicSalary:"+this.basicSalary+   " Organization: "+this.organisation);
	}
}
	public class ConstructorDemo {

		public static void main(String[] args) {
			Employee emp1= new Employee(101, "Aarya", "Manager", 30000);
			Employee emp2= new Employee(102, "Ashi", "Developer", 20000 );
			System.out.println("1====================");	
		emp1.display();
		System.out.println("2====================");
		emp2.display();
		}
	}




