import java.util.*;

public class SwapByReference {
	
	int value;
	
	SwapByReference(int value)
	{
		this.value=value;
	}
	
	public static void swap(SwapByReference n1, SwapByReference n2)
	{
		int temp = n1.value;
		n1.value = n2.value;
		n2.value = temp;
		
		System.out.println("After swapping num1 = "+n1.value+" num2 = "+n2.value);
	}
	
	public static void main(String[] args)
	{
		int num1,num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st number");
		num1 = sc.nextInt();
		System.out.println("Enter 2nd number");
		num2 = sc.nextInt();
		
		SwapByReference n1 = new SwapByReference(num1);
		SwapByReference n2 = new SwapByReference(num2);
		
		System.out.println("before swap a number num1: "+num1+" num2: "+num2);
		
		swap(n1,n2);
		
		 
	}

}
