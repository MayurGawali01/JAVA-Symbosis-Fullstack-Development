package InterfaceExamples;

public class BankImplement implements Bank {

	@Override
	public void deposite(Account account, double amount) {
		// TODO Auto-generated method stub
		if(amount > depositeLimit) {
			System.out.println("Today's Deposite Limit is exceed");
		}
		else {
			System.out.println("Deposite "+amount+" into Account "+account.getAccountno());
		}
	}

	@Override
	public void withdraw(Account account, double amount) {
		// TODO Auto-generated method stub
		if(account.getBalance() - amount >= minibalace) {
			account.setBalance(account.getBalance()-amount);
			System.out.println("Withdraw: "+ amount + " from Account : "+ account.getAccountno());
		}
		else {
			System.out.println("Balance is Insuficient in Account "+account.getBalance());
		}
	}

}
