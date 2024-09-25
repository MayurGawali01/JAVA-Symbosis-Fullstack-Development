package BookApplication;

public class BookWrite implements Runnable{
	
	Book book;
	
	public BookWrite(Book book) {
		super();
		this.book = book;
	}
     
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (book) {
			System.out.println("Writer writes book "+book.getTitle());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			book.setComplete(true);
			System.out.println("Book Completed ");
			book.notify();
			System.out.println("Notify Reader");
		}
	}

}
