package Collection;
import java.util.*;



public class LinkedListCollection {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		try {
			while(true) {
				System.out.println("1.Enter Emelements in List");
				System.out.println("2. Add Element at the first position of list");
				System.out.println("3. Add Element at last position of list");
				System.out.println("4. Search Element in List");
				System.out.println("5. Delete Element from List");
				System.out.println("6. Display Elements of List");
				System.out.println("7. Exit");
				
				System.out.println("Enter Your Choice");
				int choice = sc.nextInt();
				
				switch(choice) {
					case 1: System.out.println("Enter How many element in list");
							int n = sc.nextInt();
							for(int i=0;i<n;i++) {
								System.out.println("Enter List Elements");
								list.add(sc.nextInt());
							}
							System.out.println("Elements add succesfully");
							break;
					case 2: System.out.println("Enter element to add in list at first position");
							list.addFirst(sc.nextInt());
							System.out.println(list.getFirst());
							System.out.println("Element add Successfully");
							break;
					case 3: System.out.println("Enter Element for add at last position of list");
							list.addLast(sc.nextInt());
							System.out.println(list.getLast());
							System.out.println("Element add Successfully");
							break;
					case 4: System.out.println("Enter Element to search");
							int val = sc.nextInt();
					 		if(list.contains(val)) {
					 			System.out.println("Element is found "+val);
					 		}
					 		else {
					 			System.out.println("Element is not present in list");
					 		}
					 		break;
					case 5: System.out.println("Enter Element for delete from list");
							System.out.println("Do you want to delete first element from list: press(yes/no)");
							String yes = sc.next();
							if(yes.equals("yes")) {
								list.removeFirst();
								System.out.println(list+" Element remove successfully");
							}
							System.out.println("If you want to remove last Element Press(yes/no)");
							String lyes = sc.next();
							if(lyes.equals("yes")) {
								list.removeLast();
								System.out.println(list+" Last element remove successsfully");
							}
							
							System.out.println("If you want to delete other elements ");
							System.out.println("Enter Number position or index");
							int num = sc.nextInt();
							if(list.contains(num)) {
								list.remove(num);
								System.out.println("Number remove successfully");
							}
							else {
								System.out.println("Number is not present in list");
							}
							break;
					case 6: System.out.println("List Elements is: ");
							
							ListIterator<Integer> lt = list.listIterator();
							while(lt.hasNext()) {
								System.out.println(lt.next());
							}
							break;
					case 7: System.exit(0);
					
					default: System.out.println("Invalid Case");
				}
				
			}
			
		}catch(InputMismatchException e) {
			System.out.println("Wrong Input");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
