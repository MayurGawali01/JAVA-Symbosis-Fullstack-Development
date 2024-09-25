package UserDefine;

import java.util.Scanner;

class CountryException extends Exception{
	public CountryException(String a) {
		super(a);
	}
}

public class CountryExceptionExample{
     	String countryname;
		
		public void registerCountry(String countryname) throws CountryException {
			if(!countryname.equals("india")) {
				throw new  CountryException("NIRs not allow");
			}
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		CountryException ude1 = new CountryException();
				
				Scanner sc = new Scanner(System.in);
				try {
//					System.out.println("Enter country");
//					String countryname = sc.next();
					ude1.registerCountry("india");
				}catch( CountryException e) {
					System.out.println(e.getMessage());
				}
	}

}
