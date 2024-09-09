package BankInterface;

public class BankImplement implements Bank{

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

	@Override
	public void maxdeposite(SavingAccount savingaccount, double amount) {
		// TODO Auto-generated method stub
		if(amount > depositeLimit) {
			System.out.println("Today's Deposite Limit is exceed");
		}
		else {
			System.out.println("Deposite "+amount+" into Account "+savingaccount.getAccountno());
		}
	}

}
