package pachetcarte;

public class Book {
	
	/*parameters*/
	
	private String author;
	private Work[] works = new Work[1001]; 
	private int nr = 0;
	
	/*constructors*/
	
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
	
	/*getters*/
	
	private String getAuthor() {
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
	
	/*setters*/
	
	private void setAuthor(String newName) {
		this.author = newName;
	}
	public void addWork(Work w) {
		nr++;
		works[nr] = w;
	}
	
	/*methods*/
	
	
	public void showBook() {
		System.out.println("Autor: " + author);
		for(int i=1; i<=nr; i++) {
			System.out.println((i) + ".");
			works[i].showWork();
		}
	}
	
	public String toString() {
		String aux = new String();
		for(int i=1; i<=nr; i++) {
			aux = aux + "\n" + i + ".    " + works[i].toString();
		}
		return this.author + "[" + this.nr + " of works]: " + aux;
	}
	
	public static void main(String[] args) {
		
		
	}

}
