import java.util.Map;


public class Student {
private int sId;
private String SName;
private Map<String, Subjects> subjects;
public Student()
{
	
}
public Student(String sName,Map<String, Subjects> subjects)
{
	super();
	this.SName=sName;
	this.subjects=subjects;
}
public int getsId() {
	return sId;
}
public void setsId(int sId) {
	this.sId = sId;
}
public String getSName() {
	return SName;
}
public void setSName(String sName) {
	SName = sName;
}
public Map<String, Subjects> getSubjects() {
	return subjects;
}
public void setSubjects(Map<String, Subjects> subjects) {
	this.subjects = subjects;
}

}
