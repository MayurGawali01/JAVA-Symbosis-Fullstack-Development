package Collection;
import java.util.*;

class Student{
	String name;
	int rollno;
	
	public Student(String name, int rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
	}
	
}

public class example {

	public static void m() {
		ArrayList a1 = new ArrayList();
		
		a1.add("Mayur");
		a1.add(123);
		a1.add(13.12);
		a1.remove(2);
		
		System.out.println(a1.isEmpty());
		System.out.println(a1);
		System.out.println(a1.getFirst());
		System.out.println(a1.removeLast());
		
		int s = a1.size();
		System.out.println("a1 size "+s);
		
		for(Object o : a1) {
			System.out.println(o);
		}
		
		ListIterator li = a1.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
	}
	
	public static void m1() {
		
		ArrayList<Student> st = new ArrayList<Student>();
		
		st.add(new Student("Mayur",121));
		st.add(new Student("Omkar",122));
		st.add(new Student("Arjun",123));
		
		Iterator<Student> it = st.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m();
		m1();
	}
}
