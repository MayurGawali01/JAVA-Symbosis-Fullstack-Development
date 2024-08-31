/* write a program for Swapping Number without using third Variable */


import java.util.*;

public class Swap_without_third_var {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 int num1,num2;
	 
	 Scanner sc = new Scanner(System.in);
	 
	 // accept two numbers
	 System.out.println("Enter 1st Number");
	 num1 = sc.nextInt();
	 System.out.println("Enter 2nd Nnmber");
	 num2 = sc.nextInt();
	 
	 // display number before swapping
	 System.out.println("Number before Swapping num1= "+num1+" num2= "+num2);
	 
	 // swapping a numbers
	 num1 = num1 + num2;
	 num2 = num1 - num2;
	 num1 = num1 - num2;
	 
	 // display after swapping
	 System.out.println("Number After Swapping num1= "+num1+" num2= "+num2);
		

	}

}
