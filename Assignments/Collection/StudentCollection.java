package Collection;
import java.util.*;

public class StudentCollection implements Comparable<StudentCollection> {
	
	String name;
	int id,age;

	public StudentCollection(String name, int id, int age) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
	}
	

	@Override
	public String toString() {
		return "StudentCollection [name=" + name + ", id=" + id + ", age=" + age + "]";
	}
	
	@Override
	public int compareTo(StudentCollection st) {
		if(id == st.id)
			return 0;
		else if(id > st.id)
			return 1;
		else
			return -1;	
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<StudentCollection> studlist = new ArrayList<StudentCollection>();
		
		System.out.println("Enter How Many Students Data");
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			
			System.out.println("Enter Student ID");
			int id = sc.nextInt();
			
			System.out.println("Enter Studenet Name:");
			String name = sc.next(); 
				
			System.out.println("Enter Student age");
			int age = sc.nextInt();
			 
			studlist.add(new StudentCollection(name, id, age));
		}
	
		for(StudentCollection st: studlist) {
			System.out.println(st);
		}


		Collections.sort(studlist);
		System.out.println("After Sorting");
		for(StudentCollection st: studlist) {
			System.out.println(st);
		}
	}
}
