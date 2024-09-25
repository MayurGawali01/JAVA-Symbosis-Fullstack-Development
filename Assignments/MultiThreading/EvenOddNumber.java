package MultiThreading;


class Even implements Runnable{
	synchronized 
	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			if(i%2==0) {
				try {
					display(i);
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}	
		}
	}
	synchronized
	public void display(int i) {
		System.out.println(i);
	}
}

class Odd implements Runnable{
	
	@Override 
	public void run() {
	for(int i=0;i<=10;i++) {
		if(i%2!=0) {
			try {
				System.out.println("Odd no: "+i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	 }
   }
}

public class EvenOddNumber{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Even eobj = new Even();
		Odd oobj = new Odd();
		Thread teven = new Thread(eobj);
		Thread todd = new Thread(oobj);
		teven.start();	
		todd.start();
	}
}