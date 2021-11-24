package pachetprincipal;

import java.util.ArrayList;

public class Book {
	
	/*parameters*/

	String author;
	ArrayList<String> titles;
	ArrayList<Integer> years;
	boolean read;
	
	/*constructors*/
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	public Book(String a) {
		super();
		author = a;
	}
	public Book(String a, boolean b) {
		super();
		author = a;
		read = b;
	}
	/*getters*/
	
	public String getAuthor() {
		return author;
	}
	public String getTitle(int a) {
		String s = titles.get(a);
		return s;
	}
	public int getYear(int a) {
		int b = years.get(a);
		return b;
	}
	public boolean getReadStatus() {
		return read;
	}
	
	/*setters*/
	
	public void setAuthor(String newName) {
		this.author = newName;
	}
	public void setTitle(int a, String newTitle) {
		titles.set(a,  newTitle);
	}
	public void setYears(int a, int newYear) {
		years.set(a,  newYear);
	}
	public void setReadStatus(boolean newStatus) {
		this.read = newStatus;
	}

	/*methods*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
