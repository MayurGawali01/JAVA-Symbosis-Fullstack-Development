package MutualExclusive;

class Person{
	synchronized
	public void displayName(String name) {
		for(int i=0;i<3;i++) {
			System.out.println(name);
		}
	}
}

class student extends Thread{
	Person p;
	String name;
	
	public student(Person p1,String myname) {
		this.p=p1;
		this.name=myname;
	}
	
	public void run() {
		p.displayName(name);
	}
}

public class SyncronizedExmaple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p = new Person();
		student s = new student(p,"Mayur");
		student s1 = new student(p,"Omkar");
		
		s.start();
		s1.start();

	}

}