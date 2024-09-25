package MultiThreading;

class A1 extends Thread{
	public void run() {
		System.out.println("Thread A");
		System.out.println("i in Thread A");
		for(int i=0;i<=5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Thread A Finished");
	}
}

class B extends Thread{
	public void run() {
		System.out.println("Thread B");
		System.out.println("i in Thread B");
		for(int i=6;i<=10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Thread B Finished");
	}
}

public class MTDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 TA = new A1();
		B TB = new B();
		TA.start();		
		TA.yield();		
		try {
			TA.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		TB.start();
		System.out.println("Main Thread End");
	}

}
