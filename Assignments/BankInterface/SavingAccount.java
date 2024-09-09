package BankInterface;


public class SavingAccount implements Bank {
	
	private int accountno;
	private double balance;
	private Bank bank = new BankImplement();
	
	public SavingAccount(int accountno, double balance, Bank bank) {
		super();
		this.accountno = accountno;
		this.balance = balance;
		this.bank = bank;
	}

	public int getAccountno() {
		return accountno;
	}
	
	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void withdraw(double amount) {
		bank.withdraw(this, amount);
	}
	

	@Override
	public String toString() {
		return "SavingAccount [accountno=" + accountno + ", balance=" + balance +"]";
	}
	@Override
	public void maxdeposite(SavingAccount savingaccount,double amount) {
		// TODO Auto-generated method stub
		if(amount > depositeLimit) {
			System.out.println("Today's Deposite Limit is exceed");
		}
		else {
			balance=balance+amount;
			System.out.println("Deposite "+amount+" into Account "+savingaccount.getAccountno());
		}
	}

	@Override
	public void withdraw(SavingAccount savingaccount, double amount) {
		// TODO Auto-generated method stub
		if(savingaccount.getBalance() - amount >= minibalace) {
			savingaccount.setBalance(savingaccount.getBalance()-amount);
			System.out.println("Withdraw: "+ amount + " from Account : "+ savingaccount.getAccountno());
		}
		else {
			System.out.println("Balance is Insuficient in Account "+savingaccount.getBalance());
		}
	}	
}
