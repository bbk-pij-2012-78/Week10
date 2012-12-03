public class BookImpl implements Book {

	private final String name;
	private final String author;

	public BookImpl(String bookName, String bookAuthor) {
		this.name = bookName;
		this.author = bookAuthor;
	}

	public String getName() {
		return this.name;
	}

	public String getAuthor() {
		return this.author;
	}


}