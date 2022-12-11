package OOPsConsept;

class PersonDetail
{
	int id;
	String name;
	long phon;
	
	BankAccount bankAccount; //entity reference 
	
	Company company; //entity reference
	
public PersonDetail(int id, String name, long phon, BankAccount bankAccount, Company company) {
	super();
	this.id=id;
	this.name = name;
	this.phon = phon;
	this.bankAccount = bankAccount;
	this.company = company;
}


public int getId() {
	return id;
}
public String getName() {
	return name;
}
public long getPhon() {
	return phon;
}
public BankAccount getBankAccount() {
	return bankAccount;
}
public Company getCompany() {
	return company;
}
 
@Override
public String toString() {
	return "PersonDetail [id=" + id + ", name=" + name + ", phon=" + phon + ", bankAccount=" + bankAccount
			+ ", company=" + company + "]";
}

}


public class AggregationDemo {

	public static void main(String[] args) {
	BankAccount acc1=new BankAccount("SBI", 4550,"new market");
	BankAccount acc2=new BankAccount("UBI", 65215, "airoli");
	
	Company tcs=new Company(101, "TCS", "bangalor");
	Company capgenini=new Company(102, "capgenini", "hyderabad");
	
	PersonDetail aarya=new PersonDetail(1, "Aarya", 321458, acc2, tcs);
	PersonDetail shiva=new PersonDetail(2, "Shiva", 7618037473l, acc1, capgenini);
	
	System.out.println(aarya);  //using toString method
	
	System.out.println("=====================");
	//using getter method
	
	System.out.println("Id: "+shiva.getId());
	System.out.println("Name: "+shiva.getName());
	System.out.println("Phon no: "+shiva.getPhon());
	
	//bank details
	System.out.println("BankAccount Name: "+shiva.getBankAccount().getBankAccountName());
	System.out.println("BankAccount Id: "+shiva.getBankAccount().getBankAccountId());
	System.out.println("BankAddress: "+shiva.getBankAccount().getAddress());
	  
	System.out.println("================");
	//Company detail
	System.out.println("Company Id: "+shiva.getCompany().getCompanyId());
	System.out.println("Company Name: "+shiva.getCompany().getCompanyName());
	System.out.println("Company Address: "+shiva.getCompany().getAddress());
	}

}
