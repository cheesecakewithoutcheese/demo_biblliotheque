package pachetprincipal;
import java.util.Scanner;

import pachetcarte.Book;
import pachetcarte.Work;  

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		//Scanner keyb = new Scanner(System.in);
		
		Book b = new Book();
		b.showBook();
		
		/*for(int i=1; i<=n; i++) {
			System.out.println(b.getWorkNumberX(i));
		}*/
		/*
		System.out.println("Bine ati venit la biblioteca sau ceva. Pentru a crea o carte, introduceti numele autorului");
		String author = keyb.nextLine(); 
		Book a = new Book(author);
		System.out.println("S-a creat cartea pentru autorul " + a.getAuthor());
		
		System.out.println("acum sa introducem o lucrare in aceasta carte. Introduceti titlul operei sau whatever");
		String title = keyb.nextLine();
		Work w = new Work("titlu");
		try{
			a.addWork(w);
		}
		catch(NullPointerException e ){
		    System.out.println("ceva nu a mers ");
		}
		System.out.println("s-a introdus lucrarea cu titlul " + a.getWork(0));
		*/
	}

}
