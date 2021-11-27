package pachetcarte;

public class Work{

	/*parameters*/
	
	private String title, type;
	private boolean read;
	private int year;
	
	/*getters*/
	
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
	
	/*setters*/
	
	public void setTitle(String s) {
		this.title = s;
	}
	private void setType(String t) {
		this.type = t;
	}
	private void setReadStatus(boolean b) {
		this.read = b;
	}
	private void setYear(int y) {
		this.year = y;
	}
	
	
	/*constructors*/
	
	public Work() {
		super();
		this.title = "some title";
		this.type = "unknown";
		this.read = false;
		this.year = 0;
	}
	
	public Work(String newTitle) {
		this.title = newTitle;
		this.type = "uknown";
		this.read = false;
		this.year = 0;
	}
	public Work(String newTitle, String newType) {
		this.title = newTitle;
		this.type = newType;
		this.read = false;
		this.year = 0;
	}
	public Work(String newTitle, String newType, boolean b) {
		this.title = newTitle;
		this.type = newType;
		this.read = b;
		this.year = 0;
	}
	public Work(String newTitle, String newType, boolean b, int y) {
		this.title = newTitle;
		this.type = newType;
		this.read = b;
		this.year = y;
	}
	public Work(String newTitle, boolean r) {
		this.title = newTitle;
		this.type = "unknown";
		this.read = r;
		this.year = 0;	
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
		return "\"" + this.title + "\", " + this.type + ", " + this.year + ", " + r;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
