package hasAInheritance;


class Person{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

class Address{
	
	private String state;
	private String city;
	private String zip;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}

	
}

public class Bidirectional {
	public static void main(String[] args) {
		
		Person p1 = new Person();
		 p1.setName("Mayur");
		 
		Address a1 = new Address();
		a1.setCity("Nashik");
		a1.setState("Maharstra");
		a1.setZip("21123 gangapur road Nashik");
		
		
		Person p2 = new Person();
		p2.setName("Manish");
		
		Address a2 = new Address();
		a2.setCity("Pune");
		a2.setState("Maharastra");
		a2.setZip("0212 goregaov pune ");
		
		
		System.out.println(p1.getName()+ " live in "+a1.getCity()+", in state "+a1.getState() + " on this address "+a1.getZip());
		System.out.println(p2.getName()+ " live in "+a2.getCity()+", in state "+a2.getState() + " on this address "+a2.getZip()+" also live in Nashik");
	}

}
