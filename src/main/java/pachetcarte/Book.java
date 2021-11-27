package pachetcarte;

public class Book {
	
	/*parameters*/
	
	private String author;
	public Work[] works = new Work[1001]; 
	private int nr = 0;
	
	/*constructors*/
	
	public Book() {
		this.author = "unknown author";
		works[0] = new Work();
		this.nr = 0;
	}
	
	public Book(String a) {
		this.author = a; 
		works[0] = new Work();
		this.nr = 0;
	}
	
	/*getters*/
	
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
	
	/*setters*/
	
	private void setAuthor(String newName) {
		this.author = newName;
	}
	public void addWork(Work w) {
		works[nr] = w;
		nr++;
	}
	
	/*methods*/
	
	
	public void showBook() {
		System.out.println("Autor: " + author);
		for(int i=0; i<nr; i++) {
			System.out.println((i) + ".");
			works[i].showWork();
		}
	}
	
	public String toString() {
		String aux = new String();
		for(int i=0; i<nr; i++) {
			int n=i+1;
			aux = aux + "\n    " + n + "." + works[i].toString();
		}
		return this.author + " [" + this.nr + " of works]: " + aux;
	}
	
	public static void main(String[] args) {
		
		
	}

}
