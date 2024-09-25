package MultiThreading;

public class Threading extends Thread {
	
	public void run() {

		for(int i=0;i<5;i++) {
			try {
					Thread.sleep(1000);
					System.out.println("I "+i);
			}
			catch(InterruptedException e) {
				System.out.println(e.getMessage()); 
			}
		}
	}
	public static void main(String[] args) {
		Thread t = new Thread();
		t.start();
		System.out.println("Thread name: "+t.getName());
		t.setName("myThread");
		System.out.println("Thread Name: "+t.getName());
		t.setPriority(10);
		System.out.println("Thread Priority "+t.getPriority());
		System.out.println("Method "+t.activeCount());
		
		Thread t1 = new Thread();
		t1.start();
		System.out.println("Method : "+t1.getName());
		t1.setName("myThread");
		System.out.println("Thread Name: "+t1.getName());
		t1.setPriority(3);
		System.out.println("Thread Priority "+t1.getPriority());
		System.out.println("Method "+t1.activeCount());
	}
}