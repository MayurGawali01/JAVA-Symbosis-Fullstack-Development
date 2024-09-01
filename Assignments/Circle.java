/* Program for find area or circumference of Circle */

import java.util.*;

public class Circle {
	
	public static void main(String[] args)
	{
		float radius;
		final float PI;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius of circle");
		radius = sc.nextFloat();

		
		double area = Math.PI*(radius*radius);
		double circumference =  2 * Math.PI * radius;
		
		System.out.println("The area of Circle is : "+area);
		System.out.println("The circumference of Circle is : "+circumference);
		
	}

}
