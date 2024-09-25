package BookApplication;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book("My java BOOk");
		
		BookReader readA = new BookReader(b1);
		BookReader readB = new BookReader(b1);
		
		Thread Athread = new Thread(readA,"Mayur");
		Thread Bthread = new Thread(readB,"Omkar");
		
		Athread.start();
		Bthread.start();
		
		try {
			Thread.sleep(5000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		BookWrite writer = new BookWrite(b1);
		Thread bookwriter = new Thread(writer);
		
		bookwriter.start();
	}
}