package InterfaceExamples;

class Calculation{
	int calArea(int l,int b) {
		return l*b;
	}
}

class Rectangle {
	Calculation cal;
	String name;
	int area(int l,int b) {
		cal = new Calculation();
		int rectArea = cal.calArea(l, b);
		return rectArea;
	}
}

public class AggrigationExample {
   public static void main(String[] args) {
	

	Rectangle rect = new Rectangle();
	int area = rect.area(10, 20);
	System.out.println("Area of Rectanglr is: "+area);
   }  
}
