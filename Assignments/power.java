/* write a program for find power of number */

import java.util.*;

public class power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int base,exponent;
		double power;
		
		Scanner sc = new Scanner(System.in);
		
		// accept base and exponent
		System.out.println("Enter base ");
		base = sc.nextInt();
		System.out.println("Enter exponent");
		exponent = sc.nextInt();
		
		// find the power of number
		power = Math.pow(base, exponent);
		
		// display power
		System.out.println("The power is: "+power);		

	}

}
