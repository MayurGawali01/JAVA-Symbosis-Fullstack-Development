package MultiThreading;

public class MTDemo4 extends Thread {
	public void run() {
		System.out.println("My Thread is in running state");
		display();
		for(int i=0;i<5;i++) {
			System.out.println("Printing count i: "+i);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				System.out.println("My Thread intrrupted");
				System.out.println("My Thread run is over");
			}
		}
	}
	public static void display() {
		System.out.println("Inside Display()");
	}

	public static void main(String[] args) {
		MTDemo4 obj = new MTDemo4();
		obj.start();
		System.out.println(obj.getName());
		obj.setPriority(4);
		
		MTDemo4 obj1 = new MTDemo4();
		obj1.start();
		System.out.println(obj1.getName());
		obj1.setPriority(8);
		
		MTDemo4 obj2 = new MTDemo4();
		obj2.start();
		System.out.println(obj2.getName());
		obj2.setPriority(3);
		
		System.out.println("Thread Obj is "+obj2.isAlive());
	}

}