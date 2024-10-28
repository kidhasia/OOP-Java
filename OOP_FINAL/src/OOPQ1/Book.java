package OOPQ1;

public class Book {
	
	private int bookID;
	private String title;
	private String author;
	private String genre;
	private int availableCopies;

	//Default Constructor
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	//Overloaded constructor
	public Book(int bookID, String title, String author, String genre, int availableCopies) {
		super();
		this.bookID = bookID;
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.availableCopies= availableCopies;
	}
	
	
	public int getBookID() {
		return bookID;
	}

	public void setBookID(int bookID) {
		this.bookID = bookID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getAvailableCopies() {
		return availableCopies;
	}

	public void setAvailableCopies(int availableCopies) {
		this.availableCopies = availableCopies;
	}

	public int decreaseAvailableCopies() {
		
		int newAvailableCopies = availableCopies -1;
		
		return newAvailableCopies;
	}

	public int increaseAvailableCopies() {
		
		int newAvailableCopies = availableCopies +1;
		
		return newAvailableCopies;
	}
	
	public void displayBookDetails() {
		
		System.out.print("Book ID: "+bookID+"\n");
		System.out.print("Book Titile: "+title+"\n");
		System.out.print("Book Author: "+author+"\n");
		System.out.print("Book Genre: "+genre+"\n");
		System.out.print("Available book count: "+availableCopies+"\n");
		
	}
	
	
	
	

}
