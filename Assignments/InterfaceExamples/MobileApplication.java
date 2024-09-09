package InterfaceExamples;

class simCard{
	private String cardno;
	
	public simCard() {
		// TODO Auto-generated constructor stub
		System.out.println("Deafult constructor simCard");
		cardno = "new sim Constructed";
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "simcard [ cardno " + cardno +"]";
	}
}

class Mobile{
	private simCard mysim = new simCard();
	private String mobileName = "Nokia";
	private int mobileNo = 2212823;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return mysim +" For "+ mobileName + " card no: "+mobileNo;
	}
}

public class MobileApplication {
	public static void main(String[] args) {
		
		Mobile mymobile = new Mobile();
		System.out.println(mymobile);
		
	}

}
