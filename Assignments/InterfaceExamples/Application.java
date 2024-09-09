package InterfaceExamples;

import InterfaceExamples.Bank;
import InterfaceExamples.Account;
import InterfaceExamples.BankImplement;

public class Application {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank = new BankImplement();
		Account account = new Account(121,"Mayur",10000,bank);
		
		account.deposite(1000);
		System.out.println(account);
		System.out.println();
		
		System.out.println("After Withdraw ");
		account.withdraw(200);
		System.out.println("Available Balance is: "+account.getBalance());
		
	}

}
