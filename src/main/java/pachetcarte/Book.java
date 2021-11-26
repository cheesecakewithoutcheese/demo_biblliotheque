package pachetcarte;

import java.util.ArrayList;

public class Book {
	
	/*parameters*/
	
	String author;
	Work[] works; 
	int nr;
	
	/*constructors*/
	
	public Book() {
		// TODO Auto-generated constructor stub
		super();
		this.author = "uknown";
		Work w = new Work();
		works[0]=w;
		this.nr = 1;
	}
	
	public Book(String a) {
		super();
		this.author = a; 
		Work w = new Work();
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
	public void getWorkNumberX(int a, Work[] works) {
		System.out.println(works[a]);
	}
	
	/*setters*/
	
	public void setAuthor(String newName) {
		this.author = newName;
	}
	public void addWork(Work w) {
		works.add(w);
	}
	
	/*methods*/
	
	public void showAllWorks() {
		System.out.println(works);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
