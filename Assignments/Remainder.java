/* Program to find remainder */  


import java.util.*;

Class Remainder
{
	public static void main(String args[]) throws Excecption
	{
		int divident,divisor,quotient,remainder;
		
		Scanner sc = new Scanner(System.in());
		
		System.out.println("Enter divident");
		divident = sc.nextInt();
		System.out.println("Enter Divisor");
		divisor = sc.nextInt();
		System.out.println("Enter Quotient");
		quotient = sc.next();
		
		quotient = divident / divisor;
		System.out.println("Quotient is "+quotient);
		
		remainder = divident - (quotient * divisor );
		
		System.out.println("The Remainder is: "+remainder);
		
	}
}