package BankInterface;

public class Person extends SavingAccount implements Bank{
	
	private String pname;
	private String city;
	private Bank bank;
	SavingAccount savingaccount;

	public Person(int accountno,double balance,Bank bank,SavingAccount savingaccount, String pname, String city) {
		super(accountno,balance, bank);
		this.savingaccount = savingaccount;
		this.pname = pname;
		this.city = city;
		
	}

	public String getPname() {
		return pname;
	}
	
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public SavingAccount getSavingaccount() {
		return savingaccount;
	}
	
	public void setSavingaccount(SavingAccount savingaccount) {
		this.savingaccount = savingaccount;
	}
	
	@Override
	public String toString() {
		return "Person [pname=" + pname + ", city=" + city + ", savingaccount=" + savingaccount + "]";
	}
}
