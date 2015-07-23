
public class Subjects {
	private int sId;
	private String subName;
	private int no_of_units;
	public Subjects() {}  
	public Subjects(String subName, int no_of_units) {  
		super();  
		this.subName = subName;  
		this.no_of_units = no_of_units;  

	}  
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}
	public int getNo_of_units() {
		return no_of_units;
	}
	public void setNo_of_units(int no_of_units) {
		this.no_of_units = no_of_units;
	}

}
