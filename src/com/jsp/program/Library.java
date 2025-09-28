package com.jsp.program;

import java.util.ArrayList;
import java.util.List;

public class Library {
	private List<Book> books=new ArrayList<Book>();
	
	 public void addBook(Book book) {
		 books.add(book);
		System.out.println("book added successfully"); 
	 }
	 public void viewBook() {
		 for (Book book : books) {
			 System.out.println("author name: "+book.getAuthor()+"," +" book title is :"+book.getTitle()
			+" ," +"isbn: " +book.getISBN()+","+" book copies: "+ book.getCopiesavl());
			
		}
		 
	 }
	 public void borrowbook(String title) {
		    boolean found = false;
		    for (Book book : books) {
		        if (book.getTitle().equalsIgnoreCase(title)) {
		            found = true;
		            if (book.getCopiesavl() > 0) {
		                book.setCopiesavl(book.getCopiesavl() - 1);
		                System.out.println("Borrowed successfully");
		            } else {
		                System.out.println("Copies are not available");
		            }
		            break;
		        }
		    }
		    if (!found) {
		        System.out.println("Book not found");
		    }
		}

	  public void returnbook(String title) {
		  for (Book book : books) {
				 if(book.getTitle().equals(title)) {
					 book.setCopiesavl(book.getCopiesavl()+1);
					 System.out.println("you succesfully returned the book");
					 return;
				 }
	  }
 }
	  public void  searchbook(String Title) {
		  for (Book book : books) {
			  if(book.getTitle().equalsIgnoreCase(Title)) {
				  System.out.println("book "+book.getTitle()+"found "+" author is "+book.getAuthor());
			  }
			  else
				  System.out.println("book is not found");
		  }
		  
	  }
}