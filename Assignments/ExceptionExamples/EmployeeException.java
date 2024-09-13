package ExceptionExamples;
import java.util.*;

class EmployeeAge extends Exception{
	public EmployeeAge(String a) {
		super(a);
	}
}


class EmployeeCity extends Exception{
	public EmployeeCity(String a) {
		super(a);
	}
}

public class EmployeeException {
	
	public void employeeage(int age)throws EmployeeAge {
		if(age<18 && age>28) {
			throw new EmployeeAge("Invalid age Exception");
		}
		else {
			System.out.println("Age is valid");
		}
	}		
	
		public void employeecity(String city) throws EmployeeCity {
			if(city.equals("pune") || city.equals("mumbai") || city.equals("banglore")) {
				System.out.println("Your Location is Valid");
			}
			else {
				throw new EmployeeCity("Your city Location is not valid");
			}
		}

	public static void main(String[] args) throws EmployeeAge {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		EmployeeException obj = new EmployeeException();
		
		try {
			System.out.println("Enter Your name");
			String name = sc.next();
			
			System.out.println("Enter your Address");
			String city = sc.next();
			
			System.out.println("Enter Your age");
			int age = sc.nextInt();
			
			obj.employeecity(city);
			obj.employeeage(age);	
			
		}catch(EmployeeCity e) {
			System.out.println(e.getMessage());
		}catch(EmployeeAge e) {
			System.out.println(e.getMessage());
		}catch(ArithmeticException e2) {
	    	System.out.println(e2.getMessage());
	    }catch(InputMismatchException e2) {
	    	System.out.println("Wrong Input");
	    } catch(ArrayIndexOutOfBoundsException e1){
	    	System.out.println(e1.getMessage());
	    } catch(Exception e3) {
	    	System.out.println(e3.getMessage());
	    }				
	}
}