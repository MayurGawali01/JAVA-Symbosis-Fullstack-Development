package InterfaceExamples;

public class Account {
	
	private int accountno;
	private String custname;
	private double balance;
	private Bank bank;
	public Account(int accountno, String custname, double balance, Bank bank) {
		super();
		this.accountno = accountno;
		this.custname = custname;
		this.balance = balance;
		this.bank = bank;
	}
	public int getAccountno() {
		return accountno;
	}
	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	@Override
	public String toString() {
		return "Account [accountno=" + accountno + ", custname=" + custname + ", balance=" + balance + ", bank=" + bank
				+ "]";
	}
	
	public void deposite(double amount) {
		// TODO Auto-generated method stub
		bank.deposite(this, amount);
	}
	
	public void withdraw(double amount) {
		bank.withdraw(this, amount);
	}
	
}
