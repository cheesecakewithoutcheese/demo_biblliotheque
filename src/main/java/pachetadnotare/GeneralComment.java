package pachetadnotare;

public class GeneralComment {

	/*parameters*/
	
	private String author, title;
	private int number;
	private String comment;
	
	/*constructors*/
	
	public GeneralComment() {
		
	}

	/*getters*/
	public String getAuthor() {
		return author;
	}
	public String getTitle() {
		return title;
	}
	public String getComment() {
		return comment;
	}
	public int getNumber() {
		return number;
	}
	public int getPage() {
		return page;
	}
	
	/*setters*/
	
	public void setAuthor(String newAuthor) {
		this.author = newAuthor;
	}
	public void setTitle(String t) {
		this.title = t;
	}
	public void setComment(String t) {
		this.comment = t;
	}
	public void setNumber(int a) {
		this.number = a;
	}
	public void setPage(int a) {
		this.page = a;
	}
	
	/*methods*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
