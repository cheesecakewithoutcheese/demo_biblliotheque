package pachetcarte;

import pachetadnotare.Quote;
import pachetadnotare.Annotation;

public class Work{

	/*parameters*/
	
	private String title, type, author;
	private boolean read;
	private int year;
	private int nrQ = 0, nrA = 0;
	public Quote[] quotes = new Quote[1000];
	public Annotation[] anns = new Annotation[1000];

	/*getters*/
	
	public String getAuthor() {
		return author;
	}
	public String getTitle() {
		return title;
	}
	private String getType() {
		return type;
	}
	private boolean isRead() {
		return read;
	}
	private Annotation[] getAnns() {
		return anns;
	}
	private int getYear() {
		return year;
	}
	private int getNrA() {
		return nrA;
	}
	private int getNrQ() {
		return nrQ;
	}
	public Quote[] getQuotes() {
		return quotes;
	}
	private Quote getQuoteNo(int a) {
		return quotes[a];
	}
	private Annotation getAnnNo(int a) {
		return anns[a];
	}
	
	/*setters*/
	
	public void setTitle(String s) {
		this.title = s;
	}
	public void setType(String t) {
		this.type = t;
	}
	public void setYear(int y) {
		this.year = y;
	}
	private void setAuthor(String t) {
		this.author = t;
	}
	public void addQuote(Quote q) {
		this.quotes[nrQ] = q;
		nrQ++;
	}
	public void addAnn(Annotation a) {
		this.anns[nrA] = a;
		nrA++;
	}
	private void setRead(boolean read) {
		this.read = read;
	}
	/*constructors*/
	
	public Work() {
		this.title = "some title";
		this.type = "unknown";
		this.read = false;
		this.year = 0;
		this.author = "autor necunoscut";
		this.nrA = 0;
		this.nrQ = 0;
		this.quotes[0] = new Quote();
		this.anns[0] = new Annotation();
	}
	
	public Work(Book b) {
		this.title = "some title";
		this.type = "unknown";
		this.read = false;
		this.year = 0;
		this.author = b.getAuthor();
		this.nrA = 0;
		this.nrQ = 0;
		this.quotes[0] = new Quote();
		this.anns[0] = new Annotation();
	}
	
	public Work(Book b, String newTitle) {
		this.title = newTitle;
		this.type = "uknown";
		this.read = false;
		this.year = 0;
		this.author = b.getAuthor();
		this.nrQ = 0;
		this.nrA = 0;
		this.quotes[0] = new Quote();
		this.anns[0] = new Annotation();
	}
	public Work(Book b, String newTitle, String newType) {
		this.title = newTitle;
		this.type = newType;
		this.read = false;
		this.year = 0;
		this.author = b.getAuthor();
		this.nrQ = 0;
		this.nrA = 0;
		this.quotes[0] = new Quote();
		this.anns[0] = new Annotation();
	}
	public Work(Book b, String newTitle, String newType, boolean r) {
		this.title = newTitle;
		this.type = newType;
		this.read = r;
		this.year = 0;
		this.author = b.getAuthor();
		this.nrQ = 0;
		this.nrA = 0;
		this.quotes[0] = new Quote();
		this.anns[0] = new Annotation();
	}
	public Work(Book b, String newTitle, String newType, boolean r, int y) {
		this.title = newTitle;
		this.type = newType;
		this.read = r;
		this.year = y;
		this.author = b.getAuthor();
		this.nrQ = 0;
		this.nrA = 0;
		this.quotes[0] = new Quote();
		this.anns[0] = new Annotation();
	}
	public Work(Book b, String newTitle, boolean r) {
		this.title = newTitle;
		this.type = "unknown";
		this.read = r;
		this.year = 0;	
		this.author = b.getAuthor();
		this.nrQ = 0;
		this.nrA = 0;
		this.quotes[0] = new Quote();
		this.anns[0] = new Annotation();
	}
	
	/*methods*/
	
	
	public String toString() {
		String r = new String();
		if(read) r = "already read";
		else r = "not read";
		return "\"" + this.title + "\", " + this.type + ", " 
				+ this.year + ", " + r + " (" + nrA + " annotations, " + nrQ + " quotes)";
	}
	
	public String showAllQandA() {
		String s = new String();
		for(int i=0; i<nrQ; i++) {
			s = s + quotes[i].toString();
		}
		for(int i=0; i<nrA; i++) {
			s = s + anns[i].toString();
		}
		return s;
	}
	
	public static void main(String[] args) {
	
	}

}
