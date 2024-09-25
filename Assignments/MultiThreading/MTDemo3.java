package MultiThreading;

class MyThread extends Thread{
	String name;

	public MyThread() {
		super();
	}
	
	public MyThread(String name) {
		super();
		this.name = name;
	}
	
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(getName() +" -i: "+i);
		}
	}
}

public class MTDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread mt1 = new MyThread();
		MyThread mt2 = new MyThread("child2");
		System.out.println("mt1 thread initial name and priority");
		System.out.println("mt1 name :"+mt1.getName());
		System.out.println("mt1 Priority :"+mt1.getPriority());
		System.out.println();
		System.out.println("mt2 Thread initial name and Priority");
		System.out.println("mt2 name :"+mt2.getName());
		System.out.println("mt2 Priority :"+mt2.getPriority());
		System.out.println();
		mt1.setName("Child1");
		mt1.setPriority(6);
		mt2.setPriority(9);
		System.out.println("mt1 Thread changed name and priority");
		System.out.println("mt1 name :"+mt1.getName());
		System.out.println("mt1 Priority :"+mt1.getPriority());
		System.out.println();
		System.out.println("mt2 Thread changed name and priority");
		System.out.println("mt2 name :"+mt2.getName());
		System.out.println("mt2 Priority :"+mt2.getPriority());
		mt1.start();
		mt2.start();
		for(int i=0;i<5;i++) {
			System.out.println("main i: "+i);
		}
	}
}