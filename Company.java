package OOPsConsept;

public class Company {
int companyId;
String companyName;
String address;
public Company(int companyId, String companyName, String address) {
	super();
	this.companyId = companyId;
	this.companyName = companyName;
	this.address = address;
}

public String getCompanyName() {
	return companyName;
}
public void setCompanyName(String companyName) {
	this.companyName = companyName;
}
public int getCompanyId() {
	return companyId;
}
public String getAddress() {
	return address;
}

@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Company[companyId=").append(companyId).append("companyName").append(companyName)
	.append("address=").append(address).append("]");
	return builder.toString();
}

}

