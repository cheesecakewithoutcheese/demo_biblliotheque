package pachetcarte;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component 
public class Library {
	@Autowired 
	public Book[] books ;//= new Book[2000];
	private int nrB = 0;
	
	public int getNrB() {
		return nrB;
	}

	private void setNrB(int nrB) {
		this.nrB = nrB;
	}

	private Book[] getBooks() {
		return books;
	}

	private void setBooks(Book[] books) {
		this.books = books;
	}

	public Library() {
		books[1] = new Book("new author sample book");
		nrB=1;
	}
	public void addBook(String author) {
		books[nrB] = new Book(author);
		nrB++;
		
	}

	public String toString() {
		String s = new String();
		for(int i=1; i< nrB; i++) {
			s = s + books[i].getAuthor();
		}
		return s;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
