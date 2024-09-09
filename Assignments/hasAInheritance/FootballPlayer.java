package hasAInheritance;

public class FootballPlayer {
      
	private String name;

	Football fb = Football();

	public FootballPlayer(String name, Football fb) {
		super();
		this.name = name;
		this.fb = fb;
	}

	private Football Football() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
