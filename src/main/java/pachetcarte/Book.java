package pachetcarte;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity 
@Component("Book")
public class Book {
	
	private @Id @GeneratedValue Long id;
	private String author;
	public Work[] works = new Work[1001]; 
	private int nr = 0;
	
	public Book() {
		this.author = "unknown author";
		works[1] = new Work();
		this.nr = 1;
	}
	
	public Book(String a) {
		this.author = a;
		works[1] = new Work();
		this.nr = 1;
	}
	
	private Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	private void setWorks(Work[] works) {
		this.works = works;
	}
	private void setNr(int nr) {
		this.nr = nr;
	}
	public String getAuthor() {
		return author;
	}
	public int getNr() {
		return nr;
	}
	public Work getWorkNo(int a) {
		return works[a];
	}
	private Work[] getWorks() {
		return works;
	}
	public void setAuthor(String newName) {
		this.author = newName;
	}
	public void addWork(Work w) {
		works[nr] = w;
		nr++;	
	}
	
	
	public void showBook() {
		System.out.println("Autor: " + author);
		for(int i=1; i<nr; i++) {
			System.out.println((i) + ".");
			works[i].toString();
		}
	}
	
	public String toString() {
		String aux = new String();
		for(int i=1; i<nr; i++) {
			int n=i;
			aux = aux + "\n    " + n + "." + works[i].toString();
		}
		return this.author + " [" + this.nr + " of works]: " + aux;
	}
	
	@Override
	  public boolean equals(Object o) {

	    if (this == o)
	      return true;
	    if (!(o instanceof Book))
	      return false;
	    Book book = (Book) o;
	    return Objects.equals(this.id, book.id) && Objects.equals(this.author, book.author);
	  }
	
	 @Override
	  public int hashCode() {
	    return Objects.hash(this.id, this.author);
	  }

}
