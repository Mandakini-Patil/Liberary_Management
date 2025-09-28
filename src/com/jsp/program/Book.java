package com.jsp.program;

public class Book {
	 private String title;
	 private String Author;
	 private String ISBN;
	 private int Copiesavl;
	public Book(String title, String author, String iSBN, int copiesavl) {
		super();
		this.title = title;
		Author = author;
		ISBN = iSBN;
		Copiesavl = copiesavl;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return Author;
	}
	public String getISBN() {
		return ISBN;
	}
	public int getCopiesavl() {
		return Copiesavl;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public void setCopiesavl(int copiesavl) {
		Copiesavl = copiesavl;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", Author=" + Author + ", ISBN=" + ISBN + ", Copiesavl=" + Copiesavl + "]";
	}
	 
	

}