package EnumsExamples;

enum dayss {
	SUNDAY(1),MONDAY(2),TUESDAY(3);
	dayss(int i){
		this.MYNO = i;
	}
	int MYNO;
	public int getMYNO() {
		return MYNO;
	}
}

enum TVs{
	SONYtv(8000),LGTV(30000),Samgsung(300000);
	int price;
	TVs(int i){
		this.price = i;
	}
	public int getPrice() {
		return price;
	}
}
	
public class days{
	private int no;
	public String name;
	public void show() {
		dayss mydays[] = dayss.values();
		for(dayss dd: mydays) {
			System.out.println(dd);
		}
		for(dayss dd : dayss.values()) {
		 	System.out.println(dd.ordinal());
		}
	}

	public void showsTVS() {
		
		TVs mytvs[] = TVs.values();
		for(TVs tv: mytvs) {
			System.out.println(tv);
		}
		for(TVs tv : mytvs) {
			System.out.println(tv.ordinal());
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter Example");
		days obj = new days();
		obj.show();
		dayss d = dayss.MONDAY;
		System.out.println(d);
		obj.showsTVS();
	}
 }
