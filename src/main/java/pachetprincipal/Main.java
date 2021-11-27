package pachetprincipal;

import pachetcarte.Book;
import pachetcarte.Work;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		//TEST
		
		Book b = new Book();
		Work w = new Work("second work", true);
		b.addWork(w);
		System.out.println(b.toString());
		
		//Scanner keyb = new Scanner(System.in);
		
		/*
		Book b = new Book();
		
		Work w = new Work();
		w = b.getWorkNo(0);
		w.showWork();
		w.setTitle("Ciuma");
		w.showWork();
		*/
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
