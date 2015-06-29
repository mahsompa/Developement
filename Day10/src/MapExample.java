import java.util.HashMap;
import java.util.TreeMap;


public class MapExample {

	public static void main(String[] args) 
	{
		/**Hash table based implementation of the Map interface. 
		 * This implementation provides all of the optional map operations, and permits null values and the null key
		 * */
		HashMap<Integer, String> hmap=new HashMap<Integer, String>();
		hmap.put(1, "mahesh");
		hmap.put(10, "suresh");
		hmap.put(3, "abcdef");
		hmap.put(2, "sanjay");
		hmap.put(4, "devraj");
//		for (Iterator<Entry<Integer, String>> iterator = hmap.entrySet().iterator(); iterator
//				.hasNext();) {
//			Entry<Integer, String> m = iterator.next(); 
//			System.out.println(m.getKey()+" "+m.getValue());
//		}
		System.out.println("student names with unique id numbers::::"+hmap);
		
		/** the ordering maintained by a tree map, like any sorted map, 
		 * and whether or not an explicit comparator is provided, 
		 * must be consistent with equals if this sorted map is to correctly implement the Map interface. 
		 * (See Comparable or Comparator for a precise definition of consistent with equals.) 
		 * 
		 */
		TreeMap<Integer, String> tmap=new TreeMap<Integer, String>();
     	tmap.put(1, "mahesh");
		tmap.put(5, "abcdef");
		tmap.put(3, "suresh");
		tmap.put(2, "suhash");
		tmap.put(4, "sanjay");
		//System.out.println(tmap.put(4, "sany"));
		System.out.println("Student names in order of roll number:::" +tmap);

     
	}

}
