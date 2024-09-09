package InterfaceExamples;


class Person{
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}

class Passport{
	private int passport_no;
	
	public int getPassport_no() {
		return passport_no;
	}
	
	public void setPassport_no(int passport_no) {
		this.passport_no = passport_no;
	}
}

public class OneToOne {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.setName("Mayur");
		
		Person p2 = new Person();
		p2.setName("Watson");
		
		Passport pp1 = new Passport();
		pp1.setPassport_no(121001);
		
		Passport pp2 = new Passport();
		pp2.setPassport_no(121002);
		
		System.out.println(p1.getName()+" has a India Passport no is: "+pp1.getPassport_no());		
		System.out.println(p2.getName()+" has a US Passport no is: "+pp2.getPassport_no());
	}

}
