package pachetcarte;

import pachetadnotare.Annotation;
import pachetadnotare.Quote;

public class Work{

	/*parameters*/
	
	private String title, type, author;
	private boolean read;
	private int year;
	private int nr = 0;
	public Quote[] annotations = new Quote[1000];

	
	/*getters*/
	public String getAuthor() {
		return author;
	}
	private String getTitle() {
		return title;
	}
	private String getType() {
		return type;
	}
	private boolean getReadStatus() {
		return read;
	}
	private int getYear() {
		return year;
	}
	private int getNr() {
		return nr;
	}
	public Quote[] getAnns() {
		return annotations;
	}
	private Quote getAnnNo(int a) {
		return annotations[a];
	}
	
	/*setters*/
	
	public void setTitle(String s) {
		this.title = s;
	}
	public void setType(String t) {
		this.type = t;
	}
	public void setReadStatus(boolean b) {
		this.read = b;
	}
	public void setYear(int y) {
		this.year = y;
	}
	private void setAuthor(String t) {
		this.author = t;
	}
	public void addAnn(Quote q) {
		this.annotations[nr] = q;
		nr++;
	}
	
	/*constructors*/
	
	public Work() {
		this.title = "some title";
		this.type = "unknown";
		this.read = false;
		this.year = 0;
		this.author = "autor necunoscut";
		this.nr = 0;
		this.annotations[0] = new Quote();
	}
	
	public Work(Book b) {
		this.title = "some title";
		this.type = "unknown";
		this.read = false;
		this.year = 0;
		this.author = b.getAuthor();
		this.nr = 0;
		this.annotations[0] = new Quote();
	}
	
	public Work(Book b, String newTitle) {
		this.title = newTitle;
		this.type = "uknown";
		this.read = false;
		this.year = 0;
		this.author = b.getAuthor();
		this.nr = 0;
		this.annotations[0] = new Quote();
	}
	public Work(Book b, String newTitle, String newType) {
		this.title = newTitle;
		this.type = newType;
		this.read = false;
		this.year = 0;
		this.author = b.getAuthor();
		this.nr = 0;
		this.annotations[0] = new Quote();
	}
	public Work(Book b, String newTitle, String newType, boolean r) {
		this.title = newTitle;
		this.type = newType;
		this.read = r;
		this.year = 0;
		this.author = b.getAuthor();
		this.nr = 0;
		this.annotations[0] = new Quote();
	}
	public Work(Book b, String newTitle, String newType, boolean r, int y) {
		this.title = newTitle;
		this.type = newType;
		this.read = r;
		this.year = y;
		this.author = b.getAuthor();
		this.nr = 0;
		this.annotations[0] = new Quote();
	}
	public Work(Book b, String newTitle, boolean r) {
		this.title = newTitle;
		this.type = "unknown";
		this.read = r;
		this.year = 0;	
		this.author = b.getAuthor();
		this.nr = 0;
		this.annotations[0] = new Quote();
	}
	
	/*methods*/
	
	public void showWork() {
		System.out.println("Numele lucrarii: " + title);
		String r = new String();
		if(read) r = "da";
		else r = "nu";
		System.out.println("Citita? " + r);
		System.out.println("Tipul lucrarii: " + type);
		System.out.println("anul aparitiei: " + year);
	}
	
	public String toString() {
		String r = new String();
		if(read) r = "already read";
		else r = "not read";
		return "\"" + this.title + "\", " + this.type + ", " 
				+ this.year + ", " + r + " (" + nr + " annotations)";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
