package Collection;
import java.util.*;

public class IntegerCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		List<Integer> a= new ArrayList<Integer>();
		
		int num;
		while(true) {
			try {
					System.out.println("1.Enter Integer");
					System.out.println("2.Display Even Integer");
					System.out.println("3.Display Odd integer");
					System.out.println("4.Display all Integer");
					System.out.println("5.Exit");
					System.out.println("Enter Your Choice: ");
					int ch = sc.nextInt();
					
					ListIterator<Integer> it = a.listIterator();
					
					switch(ch) {
					case 1: System.out.println("Enter How many Integer in List");
							int n = sc.nextInt();
							for(int i=0;i<n;i++) {
								System.out.println("Enter the Integers");
								a.add(sc.nextInt());
							}
							break;
									
					case 2:System.out.println("Even Numbers"); 
					        while(it.hasNext()) {
					        	num = it.next();
					        	if(num%2==0){
					        		System.out.print(num +" ");
					        	}
					        }
					        System.out.println();
					        break;
					case 3: System.out.println("Odd Numbers");
							while(it.hasNext()) {
					        	num = it.next();
					        	if(num%2!=0){
					        		System.out.print(num +" ");
					        	}
					        }
							System.out.println();
							break;
					case 4:System.out.println("All Integers are Printed");
						   while(it.hasNext()) {
							   System.out.print(it.next()+" ");
							   System.out.println();
						   }
						   break;
					case 5: System.exit(0);
							break;
					
					default: System.out.println("Invalid Choice");
				}
			}catch(ArithmeticException e) {
				System.out.println(e.getMessage());
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
