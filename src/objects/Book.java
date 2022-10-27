package objects;

public class Book {

	// Constants
	public static final int BOOK_ID = 0;
	public static final String BOOK_TITLE = "No book_title";
	public static final String BOOK_PUBLISHER = "No book_publisher";
	public static final String BOOK_AUTHOR = "No book_author";
	public static final String BOOK_IMAGE = "No book_image";
	public static final String BOOK_PUBLISHER_ADDRESS = "No book_publisher_address";
	public static final String BOOK_SUMMARY = "No book_summary";

	// Object's properties
	private int book_id;
	private String book_title;
	private String book_publisher;
	private String book_author;
	private String book_image;
	private String book_publisher_address;
	private String book_summary;
	
	public Book() {
		this(Book.BOOK_ID, Book.BOOK_TITLE, Book.BOOK_PUBLISHER, Book.BOOK_AUTHOR, Book.BOOK_IMAGE, Book.BOOK_PUBLISHER_ADDRESS, Book.BOOK_SUMMARY);
	}
	
	public Book(int book_id, String book_title, String book_publisher, String book_author, String book_image,
			String book_publisher_address, String book_summary) {
		super();
		this.book_id = book_id;
		this.book_title = book_title;
		this.book_publisher = book_publisher;
		this.book_author = book_author;
		this.book_image = book_image;
		this.book_publisher_address = book_publisher_address;
		this.book_summary = book_summary;
	}
	
	public int getBook_id() {
		return book_id;
	}
	
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	
	public String getBook_title() {
		return book_title;
	}
	
	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}
	
	public String getBook_publisher() {
		return book_publisher;
	}
	
	public void setBook_publisher(String book_publisher) {
		this.book_publisher = book_publisher;
	}
	
	public String getBook_author() {
		return book_author;
	}
	
	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}
	
	public String getBook_image() {
		return book_image;
	}
	
	public void setBook_image(String book_image) {
		this.book_image = book_image;
	}
	
	public String getBook_publisher_address() {
		return book_publisher_address;
	}
	
	public void setBook_publisher_address(String book_publisher_address) {
		this.book_publisher_address = book_publisher_address;
	}
	
	public String getBook_summary() {
		return book_summary;
	}
	
	public void setBook_summary(String book_summary) {
		this.book_summary = book_summary;
	}
	
	public static int getBookId() {
		return BOOK_ID;
	}
	
	public static String getBookTitle() {
		return BOOK_TITLE;
	}
	
	public static String getBookPublisher() {
		return BOOK_PUBLISHER;
	}
	
	public static String getBookAuthor() {
		return BOOK_AUTHOR;
	}
	
	public static String getBookImage() {
		return BOOK_IMAGE;
	}
	
	public static String getBookPublisherAddress() {
		return BOOK_PUBLISHER_ADDRESS;
	}
	
	public static String getBookSummary() {
		return BOOK_SUMMARY;
	}

	@Override
	public String toString() {
		return "Book [book_id=" + book_id + ", book_title=" + book_title + ", book_publisher=" + book_publisher
				+ ", book_author=" + book_author + ", book_image=" + book_image + ", book_publisher_address="
				+ book_publisher_address + ", book_summary=" + book_summary + "]";
	}
	
	public static void main(String[] args) {
		Book book = new Book(1, "Dac Nhan Tam", "NXB Van Hoc", "Dale Carnegie", "Image 1", "First News", "Summary 1");
		
		System.out.println(book);
	}
	

}
