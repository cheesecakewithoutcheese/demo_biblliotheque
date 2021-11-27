package pachetcarte;

public class Work{

	/*parameters*/
	
	String title, type;
	boolean read;
	int year;
	
	/*getters*/
	
	public String getTitle() {
		return title;
	}
	public String getType() {
		return type;
	}
	public boolean getReadStatus() {
		return read;
	}
	public int getYear() {
		return year;
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
	
	
	/*constructors*/
	
	public Work() {
		super();
		this.title = "some title";
		this.type = "unknown";
		this.read = false;
		this.year = 0;
	}
	
	public Work(String newTitle) {
		super();
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
		System.out.println("	Numele lucrarii: " + title);
		String r = new String();
		if(read) r = "da";
		else r = "nu";
		System.out.println("	Citita? " + r);
		System.out.println("    Tipul lucrarii: " + type);
		System.out.println("    anul aparitiei: " + year);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
