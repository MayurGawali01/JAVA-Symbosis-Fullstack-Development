/* Program to convert character to ASCII value */ 

import java.util.*;

public class CharacterToACSII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char character;
		int asciiValue;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Character");
		character = sc.next().charAt(0);
		
		asciiValue = (int) character;
		
		System.out.println("Character to acsii value is: "+asciiValue);
	}

}
