public class StudentName implements Comparable<StudentName> // class for implementing the Comparable interface
{
	
	private String sname; // Initializing the  variable named as sname

	public StudentName(String sname )  // Parameterized Constructor for the class 
	{
		this.sname=sname;
	}
	
	public String getName()  //method for get the student names
	{
		return this.sname;
	}
	public String setName() // method for printing set the student names
	{
		return this.sname;
	}
	public int compareTo(StudentName obj)  // method for compare the objects
	{
		return sname.compareTo((String)obj.sname);
	}
  public String toString()  // method for getting  the string name instead of hash code
  {
	  return this.sname;
  }

}
