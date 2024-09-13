package Collection;

public class Author {
	
	String authorname;
	Book book;

	public Author(Book book,String authorname) {
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

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "Author [authorname=" + authorname + ", bookname=" + book+ "]";
	}
}
