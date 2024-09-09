package BankInterface;


public class BankApplication {
	public static void main(String[] args) {
		
		Bank bank = new BankImplement();
	    SavingAccount savingaccount = new SavingAccount(121,100,bank);
	    Person p = new Person(121,1000,bank,savingaccount,"mayur","nashik");
	    System.out.println(p);
	    
	    System.out.println("------------------------------");
	    
	    savingaccount.maxdeposite(savingaccount,2500);
		System.out.println(savingaccount);
		System.out.println();
		
		System.out.println("------------------------------");
		
		System.out.println("After Withdraw ");
		savingaccount.withdraw(savingaccount,200);
		System.out.println("Available Balance is: "+savingaccount.getBalance());
	}
}
