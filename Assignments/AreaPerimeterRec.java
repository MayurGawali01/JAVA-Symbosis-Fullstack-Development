/* Program to find Area & Perimeter of Rectangle */ 

import java.util.*;
public class AreaPerimeterRec {
	
	public static void main(String args[])
	{
		float length, width;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter length of rectangle:");
		length = sc.nextFloat();
		System.out.println("Enter width of rectangle");
		width = sc.nextFloat();
		
		double area = length * width;
		double perimeter = 2*length + 2*width;
		
		System.out.println("The Area of Rectanglr is: "+area);
		System.out.println("The Perimeter of Rectangle is: "+perimeter);
		
	}

}
