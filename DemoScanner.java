package OOPsConsept;
import java.util.Scanner;
public class DemoScanner {

	public static void main(String[] args) {
		int id, n;
		String name,address,course;
		float fees;
		long contact;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number of student you want to enter:");
		n = sc.nextInt();
		
		for(int i=1; i<=n; i++)
		{
		System.out.println("Enter id:");
		id=sc.nextInt();
		
		sc.nextLine();
		System.out.println("======================");
		System.out.println("Enter name:");
		name=sc.nextLine();
		System.out.println("Enter address:");
		address=sc.nextLine();
		System.out.println("Enter course:");
		course=sc.nextLine();
		System.out.println("Enter fees:");
		fees=sc.nextFloat();
		System.out.println("Enter contact:");
		contact=sc.nextLong();
		
		Student obj=new Student();
		obj.setData(id, name, address, course, fees, contact);
		obj.displayData();
		}
	}

}
