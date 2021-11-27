package pachetcarte;

public class Book {
	
	/*parameters*/
	
	private String author;
	private Work[] works = new Work[1001]; 
	private int nr;
	
	/*constructors*/
	
	public Book() {
		this.author = "unknown author";
		works[0] = new Work();
		this.nr = 1;
	}
	
	public Book(String a) {
		this.author = a; 
		Work w = new Work("ciuma", "tip", false, 1920);
		Work works[] = new Work[3000];
		works[0]=w;
		this.nr = 1;
	}
	
	/*getters*/
	
	public String getAuthor() {
		return author;
	}
	public int getNr() {
		return nr;
	}
	public Work getWorkNumberX(int a, Work w[]) {
		Work b = new Work();
		b = w[a];
		return b;
		
	}
	public Work[] getWorks() {
		return works;
	}
	
	/*setters*/
	
	public void setAuthor(String newName) {
		this.author = newName;
	}
	public void addWork(Work w) {
		nr++;
		works[nr] = w;
	}
	
	/*methods*/
	
	public void showAllWorks() {
		System.out.println(works);
	}
	
	public void showBook() {
		System.out.println("Autor: " + author);
		for(int i=0; i<nr; i++) {
			works[i].showWork();
		}
	}
	
	public static void main(String[] args) {
		
		
	}

}
