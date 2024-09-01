/* Program for swapping two number using call by value */ 

import java.util.*;

public class Swap_call_by_value {
	
	// method for swapping
	public static void swap(int num1,int num2)
	{
	   int temp = num1;
	   num1 = num2;
	   num2 = temp;
	   
	   System.out.println("Afte swap number num1 = "+num1+" num2 = "+num2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1,num2;
		
		Scanner sc = new Scanner(System.in);
		
		// accept number 
		System.out.println("Enter 1st number");
		num1 = sc.nextInt();
		System.out.println("Enter 2nd number");
		num2 = sc.nextInt();
		
		System.out.println("Before swap a number num1 = "+num1+" num2 = "+num2);
		
		swap(num1,num2);

	}

}
