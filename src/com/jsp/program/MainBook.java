package com.jsp.program;

import java.util.Scanner;

 class MainBook {
	public static void main(String[] args) {
		Library library=new Library();
		Scanner sc= new Scanner(System.in);
		while(true) {
			System.out.println("library menu");
			System.out.println("1 : add book");
			System.out.println("2: view books");
			System.out.println("3: borrowbook");
			System.out.println("4: returnbook");
			System.out.println("5: searchbook");
			System.out.println("6: exit");
			System.out.println("enter your  choice");
			int c=sc.nextInt();
			sc.nextLine();
			
			switch(c) {
			case 1:
				System.out.println("Enter the book title");
				String title=sc.next();
				System.out.println("Enter author");
				String author=sc.next();
				System.out.println("Enter isbn");
				String isbn=sc.next();
				System.out.println("Enter no of copies available");
				int booksavail=sc.nextInt();
//				String s=sc.nextLine();
//				String[] s1= s.split(" ") ;
				library.addBook(new Book(title, author, isbn, booksavail));
                break;
			case 2:
				library.viewBook();
				break;
			case 3:
				System.out.println("enter title of the book you want to borro");
				String s2=sc.nextLine();
				library.borrowbook(s2);
				break;
			case 4:
				System.out.println("enter the book title you want return");
				String s3=sc.nextLine();
				library.returnbook(s3);
				break;
			case 5:
				System.out.println("enter the book name you want to search");
				String s4=sc.nextLine();
				library.searchbook(s4);
			case 6: return;
			default:System.out.println("enter the correct choice");
			}
		}
		
	}

}