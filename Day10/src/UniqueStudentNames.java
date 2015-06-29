import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
public class UniqueStudentNames 
{
	public static void main(String[] args) 
	{   
		/**HashSet class implements the Set interface, backed by a hash table (actually a HashMap instance). 
		 * It makes no guarantees as to the iteration order of the set; in particular, 
		 * it does not guarantee that the order will remain constant over time. 
		 * This class permits the null element. 
		 * *
		 */
		HashSet<String> hset=new HashSet<String>(); 
		hset.add("mahesh");
		hset.add("suresh");
		hset.add("sanjay");
		hset.add("subbu");
		hset.add("devraj");
		hset.add("jhone");
		System.out.println("student names whithout duplications::" +hset);
		/**contains unique elements only like HashSet. 
		 * The TreeSet class implements NavigableSet interface that extends the SortedSet interface.
            maintains ascending order.
		 */
		TreeSet<String> tset=new TreeSet<String>();
		tset.add("mahesh");
		tset.add("suresh");
		tset.add("sanjay");
		tset.add("sai");
		tset.add("devraj");
		System.out.println("student names in alphabatical orader:::" +tset);
		/**
		 * this block implements treeset elements in alphabetical reverse order.
		 * desecendingSet() is the predefined method for sort the treeset elements.  
		*/
		TreeSet<String> treereverse=new TreeSet<String>();
		treereverse=(TreeSet<String>)tset.descendingSet();
		Iterator<String> iterator = treereverse.iterator(); // implement the Iterator interface for the additional methods.
		while(iterator.hasNext()) // check weather the next element is present or not .
		{
			System.out.println("treeset elements in alphabatical reverse order : "+iterator.next());
		}
		Set<StudentName> stname=new TreeSet<StudentName>(new Comparator<StudentName>() {

			public int compare(StudentName o1, StudentName o2) 
			{
			 if(o1.getName().length()<o2.getName().length())	
				 return -o1.compareTo(o2);
			 else if(o1.getName().length()>o2.getName().length())
				 return +o1.compareTo(o2);
			 else
				return o1.compareTo(o2);
			}
		});
		stname.add(new StudentName("z"));
		stname.add(new StudentName("a"));
		stname.add(new StudentName("c"));
		stname.add(new StudentName("b"));
		stname.add(new StudentName("ac"));
		stname.add(new StudentName("cb"));
		System.out.println(stname);
}
}