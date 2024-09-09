package InterfaceExamples;

import BankInterface.SavingAccount;

public interface Bank {
	
	double minibalace = 1000;
	double rateofinteres = 7.5;
	double depositeLimit = 25000;
	
	void deposite(Account account, double amount);
	void withdraw(Account account, double amount);

}
