package Collection;
import java.util.*;

import Collection.Author;
import Collection.Book;

public class BookCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Author at1 = new Author(new Book("Wings of Fire", null), "A.P.J. Abdul Kalam");
		Author at2 = new Author(new Book("The BhagWat Gita", null), "Lord Krishna");
		Author at3 = new Author(new Book("Harry Poter", null), "James Bond");
		
		List<Author> a = new ArrayList<Author>();
		a.add(at1);
		a.add(at2);
		a.add(at3);
		
		ListIterator lt = a.listIterator();
		while(lt.hasNext()) {
			System.out.println(lt.next());
		}
	}
		
}