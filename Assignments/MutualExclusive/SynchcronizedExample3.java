package MutualExclusive;

class mytable{
	public synchronized static void testable() {
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
				System.out.println("\n"+i);
			}catch(InterruptedException e) {}
		}
	}
}

class thread1 extends Thread{
	public void run() {
		mytable.testable();
	}
}

public class SynchcronizedExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thread1 t1 = new thread1();
		thread1 t2 = new thread1();
		t1.start();
		t2.start();
	}

}
