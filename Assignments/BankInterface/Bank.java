package BankInterface;

public interface Bank {
	
	double minibalace = 1000;
	double depositeLimit = 25000;
	
	void withdraw(SavingAccount account, double amount);
	void maxdeposite(SavingAccount savingaccount, double amount);
}
