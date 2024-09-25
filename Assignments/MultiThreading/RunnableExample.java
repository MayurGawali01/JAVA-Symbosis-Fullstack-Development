package MultiThreading;

public class RunnableExample implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
				System.out.println("i: "+i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunnableExample robj = new RunnableExample();
		Thread t1 = new Thread(robj);
		t1.start();
	}
}