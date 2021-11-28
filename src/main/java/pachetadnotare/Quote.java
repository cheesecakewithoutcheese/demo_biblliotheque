package pachetadnotare;
import pachetcarte.Work;
public class Quote extends QandA{

	/*parameters*/
	
	private String quote;
	
	/*constructors*/
	
	public Quote() {
		super();
		this.quote = "\"quote\"";
	}
	
	public Quote(Work w) {
		super(w);
		this.quote =  "\"quote\"";
	}

	/*getters*/
	public String getQuote() {
		return quote;
	}
	
	/*setters*/
	
	public void setQuote(String t) {
		this.quote = t;
	}
	
	/*methods*/
	
	public String toString() {
		return this.quote + "\n	- " + this.author + ", \"" 
				+ this.title + "\", p. " + page + "\n\n" + this.comment 
				+ "\n\n\n";
	}

}
