package OOPQ1;

import java.util.ArrayList;

public class LibraryCatalog {
	
	private ArrayList <Book> catalog;

	public LibraryCatalog() {
		this.catalog = new ArrayList<>();
		}

	public void addBook(Book book) {
		
		catalog.add(book);
		System.out.println("Book added! ");
	}
	
	public void searchBook(int bookID) {
		for(Book book: catalog) {
			if(book.getBookID()==bookID) {
				 System.out.println("Book found!" );
				 book.displayBookDetails();
				 break;
			}
//			else {
//				System.out.print("Book not found!");
//				break;
//			}
		}
	}
	
	public void borrowBook(int bookID) {
		for(Book book: catalog) {
			if(book.getBookID()==bookID) {
				book.decreaseAvailableCopies();
			}
//			else {
//				System.out.print("Book not found!");
//			}
		}
	}
	
	public void returnBook(int bookID) {
		for(Book book: catalog) {
			book.increaseAvailableCopies();
			System.out.print("Book was returned!");
			
			return;
		}
	}
	
	public void dislayDetails(int bookID){
		for(Book book: catalog) {
			book.displayBookDetails();
			return;
		}
		
	}
	

}
