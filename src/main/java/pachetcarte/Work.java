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
	public Work(String newTitle, boolean r) {
		this.title = newTitle;
		this.type = "unknown";
		this.read = r;
		this.year = 0;	
	}
	
	/*methods*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
