package pachetprincipal;

import java.util.ArrayList;

import pachetadnotare.Annotation;
import pachetadnotare.Quote;
import pachetcarte.Book;
import pachetcarte.Work;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		//TESTE
		
		Book[] b = new Book[2000];
		b[1] = new Book("Albert Camus");
		Work w = new Work(b[1], "primul titlu" );
		b[1].addWork(w);
		Work e = new Work(b[1], "ciuma", true);
		b[1].addWork(e);
		b[1].works[0].setYear(1920);
		System.out.println(b[1].toString());
		Quote ann = new Quote(b[1].works[1]);
		b[1].works[1].addAnn(ann);
		System.out.println(b[1].toString());
		System.out.println();
		System.out.println(b[1].works[1].annotations[0].toString());
		//TEST
		/*
		Book b = new Book();
		Work w = new Work(b, "second work", true);
		b.addWork(w);
		System.out.println(b.toString());
		*/
		
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
