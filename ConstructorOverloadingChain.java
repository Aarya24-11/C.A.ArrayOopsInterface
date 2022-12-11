package OOPsConsept;

class User
{
	private int userId;
	private String userName, password, firstName, lastName, address;
	private long phon;

	public User(int userId, String firstName, String lastName)
	{
	   this.userId=userId;
	   this.firstName=firstName;
	   this.lastName=lastName;
	}
	public User(int userId,String firstName, String lastName, String address,long phon)
	{
		this(userId, firstName, lastName);
		this.address=address;
		this.phon=phon;
	}
	public User(int userId,String firstName, String lastName, String address,long phon, String userName, String password)
	{
		this(userId, firstName, lastName, address, phon);
		this.userName=userName;
		this.password=password;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhon() {
		return phon;
	}
	public void setPhon(long phon) {
		this.phon = phon;
	}

void display()
{

System.out.println("ID: "+this.userId);
System.out.println("first name: "+this.firstName);
System.out.println("last name: "+this.lastName);
System.out.println("address: "+this.address);
System.out.println("userName: "+this.userName);
System.out.println("contact no: "+this.phon);
System.out.println("password: "+this.password);	
}
}

public class ConstructorOverloadingChain {
       
	//Main method
	public static void main(String[] args) {
		User user1=new User(1,"Aarya", "Chaurasiya", "Delhi", 7618037473l, "numbers", "123");
		 user1.display();	
		
		//System.out.println("ID: "+user1.getUserId());       //Long method 
		//System.out.println("first name: "+user1.getFirstName());
		//System.out.println("last name: "+user1.getLastName());
		//System.out.println("address: "+user1.getAddress());
	    //System.out.println("userName: "+user1.getUserName());
		//System.out.println("contact no: "+user1.getPhon());
		//System.out.println("password: "+user1.getPassword());
		
		System.out.println("==========================================");
		
		User user2=new User(2, "Ashi", "Chaurasiya", "Allahabad", 2365147854l);
		user2.display();
		
		//System.out.println("ID: "+user2.getUserId()+ "\nfirstName: "+user2.getFirstName()+ 
			//	"\nlastName: "+user2.getLastName()+ "\nAddress:"+user2.getAddress()+ 
		//		"\nContactNo:"+user1.getPhon());  //one line method
		
		
	}

}
