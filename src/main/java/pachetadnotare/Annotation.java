package pachetadnotare;

import pachetcarte.Work;

public class Annotation extends QandA{
	
	/*parameters*/
	
	protected String paraphrase;
	
	/*constructors*/
	
	public Annotation() {
		super();
		this.paraphrase = "insert paraphrase";
	}
	
	public Annotation(Work w) {
		super(w);
		this.paraphrase = "insert paraphrase";
	}
	
	/*getters*/
	
	private String getParaphrase() {
		return paraphrase;
	}
	
	/*setters*/

	public void setParaphrase(String s) {
		this.paraphrase = s;
	}
	
	/*methods*/
	
	public String toString() {
		return this.paraphrase + "\n	- " + this.author + ", \"" 
				+ this.title + "\", p. " + page + "\n\n" + this.comment 
				+ "\n\n\n";	
	}
	
}