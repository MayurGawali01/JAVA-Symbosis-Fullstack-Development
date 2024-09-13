package Collection;

public class Book {

	String authorname;
	Book book;

	@Override
	public String toString() {
		return "Book [authorname=" + authorname + ", book=" + book + "]";
	}

	public Book(String authorname, Book book) {
		super();
		this.authorname = authorname;
		this.book = book;
	}

	public String getAuthorname() {
		return authorname;
	}

	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}

	public Book getBookname() {
		return book;
	}

	public void setBookname(Book book) {
		this.book = book;
	}

}
