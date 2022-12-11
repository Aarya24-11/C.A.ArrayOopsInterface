package OOPsConsept;

public class BankAccount {
	int BankAccountId;
	String BankAccountName;
	String BankAddress;
	public BankAccount(String BankAccountName, int BankAccountId, String address) {
		super();
		this.BankAccountId = BankAccountId;
		this.BankAccountName = BankAccountName;
		this.BankAddress = address;
	}
     
     
	public int getBankAccountId() {
		return BankAccountId;
	}


	public void setBankAccountId(int bankAccountId) {
		BankAccountId = bankAccountId;
	}


	public String getBankAccountName() {
		return BankAccountName;
	}


	public void setBankAccountName(String bankAccountName) {
		BankAccountName = bankAccountName;
	}


	public String getAddress() {
		return BankAddress;
	}


	public void setAddress(String address) {
		BankAddress = BankAddress;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BankAccount[BankAccountId=").append(BankAccountId).append("BankAccountName").append(BankAccountName)
		.append("BankAddress=").append(BankAddress).append("]");
		return builder.toString();
	
	}
}

