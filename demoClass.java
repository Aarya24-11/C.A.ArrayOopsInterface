package OOPsConsept;

class Student
{
	int id;
	String name, address, course;
	float fees;
	long contact;
	
	void setData(int i,String n, String add, String c, float f, long co)
	{
		id = i;
		name =n;
		address = add;
		course = c;
		fees = f;
		contact =co;
}

	void displayData()
{
	System.out.println("Id:" +id);
	System.out.println("Name:" +name);
	System.out.println("Address:" +address);
	System.out.println("Course:" +course);
	System.out.println("Fees:" +fees);
	System.out.println("Contact:" +contact);
}
	
} //end of class
public class demoClass {

	public static void main(String[] args) {
		Student aarya=new Student();
		//aarya.id=101;
		//aarya.name=aarya;
		//aarya.address=delhi;
		//aarya.course=java;
		//aarya.fees=2000;
		
		aarya.setData(101, "aarya", "delhi", "java full stack", 2000.0f, 7618037473l); 
		aarya.displayData();
		
		System.out.println("======================");
		
		Student akansha=new Student();
		akansha.setData(102,"akansha", "pune", "aws", 1000.0f, 2536257541l);
		akansha.displayData();
		 
		System.out.println("====================");

		Student ashi=new Student();
		ashi.setData(103,"ashi", "delhi", "OOPs", 1500.0f,  5623842569l);
		ashi.displayData();
		
		System.out.println("====================");

		Student Aradhya=new Student();
		Aradhya.setData(104,"Aradhya", "delhi", "OOPs", 1500.0f,  5623842569l);
		Aradhya.displayData();
	}
}


