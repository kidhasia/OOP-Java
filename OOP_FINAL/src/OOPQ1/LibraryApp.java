package OOPQ1;

import java.util.Scanner;

public class LibraryApp {
	public static void main(String[] args) {
		
		LibraryCatalog libraryCat = new LibraryCatalog();
		
		libraryCat.addBook(new Book(1,"A","B","C",15));
		libraryCat.addBook(new Book(2,"AB","B","C",25));
		libraryCat.addBook(new Book(3,"ABC","B","C",35));
		libraryCat.addBook(new Book(4,"ABCD","B","C",45));
		libraryCat.addBook(new Book(5,"ABCDE","B","C",55));
		libraryCat.addBook(new Book(6,"ABCDEF","B","C",65));
		
		System.out.println();
		//Searching books
		libraryCat.searchBook(4);
		System.out.println();
		libraryCat.borrowBook(4);
		System.out.println();
		libraryCat.returnBook(4);
		System.out.println();
		libraryCat.dislayDetails(4);
	
		
		
		
		
		
		
	}
}
