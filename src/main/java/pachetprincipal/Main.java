package pachetprincipal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		
		  SpringApplication.run(Main.class, args); 
		  
		  //Library library = new Library();
			/*
			 * library.addBook("ALbert Camus"); library.addBook("Samuel Beckett");
			 * library.addBook("Jonathan Swift"); Work w = new Work(library.books[1],
			 * "Ciuma", "nuvela", true); library.books[1].addWork(w); Work e = new
			 * Work(library.books[1], "Strainul", "roman", true);
			 * library.books[1].addWork(e); Work f = new Work(library.books[1],
			 * "Femeia adultera", "povestire"); library.books[1].addWork(f); Quote q = new
			 * Quote(library.books[1].works[1], "\"un citat foarte frumos\"");
			 * library.books[1].works[1].addQuote(q);
			 */
		//TESTE
		/*
		 * Book[] b = new Book[2000]; b[1] = new Book("Albert Camus"); Work w = new
		 * Work(b[1],"Strainul", "novel"); b[1].addWork(w); Work e = new
		 * Work(b[1],"ciuma", "novel", true); b[1].addWork(e);
		 * b[1].works[0].setYear(1920); b[1].works[1].setYear(1940); Quote q = new
		 * Quote(b[1].works[1]); q.setQuote("Aujurd`hui, maman est morte.");
		 * q.setComment("acest citat imi inspira multe sentimente."); q.setPage(1);
		 * Annotation a = new Annotation(b[1].works[1]); a.setPage(1);
		 * a.setComment("aceasta parte este foarte expresiva");
		 * a.setParaphrase("paraphrazez prima pagina"); Annotation a2 = new
		 * Annotation(b[1].works[1]); a2.setPage(3);
		 * a2.setComment("aceasta pagina este o alta parte foarte expresiva");
		 * a2.setParaphrase("paraphrazez a treia pagina"); b[1].works[1].addQuote(q);
		 * b[1].works[1].addAnn(a); b[1].works[1].addAnn(a2);
		 * System.out.println(b[1].toString());
		 * System.out.println(b[1].works[1].showAllQandA());
		 */
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
