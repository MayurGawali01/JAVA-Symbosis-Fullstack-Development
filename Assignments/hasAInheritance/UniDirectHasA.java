package hasAInheritance;

public class UniDirectHasA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Football fb = new Football("Asociation", "68-72 cm", "430 gm");
		FootballPlayer fbp = new FootballPlayer("mayur", fb);
		
		System.out.println("Player "+fbp.getName()+" playes with "+fbp.fb.getType());
	}
}
