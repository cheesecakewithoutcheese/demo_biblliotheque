package pachetadnotare;

import pachetcarte.Work;

public class Annotation {
	
	/*parameters*/
	
	protected String paraphrase;
	protected String author;
	protected String title;
	protected int page;
	protected String comment;
	
	/*constructors*/
	
	public Annotation() {
		this.paraphrase = "insert paraphrase";
		this.author = "author uknown";
		this.title = "titlul lucrarii";
		this.page = -1;
		this.comment = "type your comment";
	}
	
	public Annotation(Work w) {
		this.paraphrase = "insert paraphrase";
		this.author = w.getAuthor();
		this.title = "titlul lucrarii";
		this.page = -1;
		this.comment = "type your comment";
	}
	
	/*getters*/
	
	private String getParaphrase() {
		return paraphrase;
	}
	private String getAuthor() {
		return author;
	}
	private String getTitle() {
		return title;
	}
	private String getComment() {
		return comment;
	}
	private int getPage() {
		return page;
	}
	
	/*setters*/

	private void setParaphrase(String s) {
		this.paraphrase = s;
	}

	private void setAuthor(String newAuthor) {
		this.author = newAuthor;
	}
	private void setTitle(String t) {
		this.title = t;
	}
	private void setComment(String t) {
		this.comment = t;
	}
	private void setPage(int a) {
		this.page = a;
	}
	
	/*methods*/
	
	public String toString() {
		return this.paraphrase + "\n	- " + this.author + ", \"" 
				+ this.title + "\", p. " + page + "\n\n" + this.comment 
				+ "\n\n\n";	
	}
	
}