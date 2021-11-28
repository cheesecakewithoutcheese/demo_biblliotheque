package pachetadnotare;

import pachetcarte.Work;

public class QandA {

	public QandA() {
		this.author = "author uknown";
		this.title = "titlul lucrarii";
		this.page = -1;
		this.comment = "type your comment";
	}
	public QandA(Work w) {
		this.author = w.getAuthor();
		this.title = w.getTitle();
		this.page = -1;
		this.comment = "type your comment";
	}

	protected String author;
	protected String title;
	public int page;
	protected String comment;
	
	/*getters and setters*/
	
	private String getAuthor() {
		return author;
	}
	private void setAuthor(String author) {
		this.author = author;
	}
	private String getTitle() {
		return title;
	}
	private void setTitle(String title) {
		this.title = title;
	}
	private int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	private String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public String toString() {
		return "\n" + this.comment + " (" + this.page + ")\n\n";
	}

}
