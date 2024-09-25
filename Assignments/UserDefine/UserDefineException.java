package UserDefine;


import java.util.InputMismatchException;
import java.util.Scanner;

class UserException extends Exception{

	public UserException(String a) {
		super(a);
	}	
}



public class UserDefineException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		userdefineException ude1 = new userdefineException();
		
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter country");
			String countryname = sc.next();
			ude1.registerCountry(countryname);
		}catch( invalidCountryException e) {
			System.out.println();
		}
//			System.out.println("Enter age");
//			int age= sc.nextInt();
//			if(age<0) {
//				throw new UserException("User Exception");
//			}
//			else {
//				throw new ArithmeticException("age accepted");
//			}
//				
//		}catch(UserException e) {
//			System.out.println(e.getMessage());
//		}catch(ArithmeticException e1) {
//			System.out.println(e1.getMessage());
//		}catch(InputMismatchException e) {
//			System.out.println("wrong Entry");
//		}catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
	}
}