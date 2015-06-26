/**
 * java.Util is the one of the package in java  Contains the collections framework, 
 * legacy collection classes, event model, date and time facilities, internationalization, and 
 * miscellaneous utility classes 
 **/
import java.util.ArrayList;
/*  Queuearray is the main class in the programe    */
public class Queuearray

{
	/**
	 *ArrayList is  Resizable-array implementation of the List interface. 
	 * Implements all optional list operations, and permits all elements, including null. 
	 * In addition to implementing the List interface, 
	 * this class provides methods to manipulate the size of the array that is used internally to store the list. 
	 * (This class is roughly equivalent to Vector, except that it is unsynchronized.) 
	 * */
	ArrayList<Integer> alist=new ArrayList<Integer>();
	/**
	 * front is one of the operation in Queue ,which is used to insert the element into Queue, 
	 * front(int ) is user defined method to perform Queue operations
	 * in this method having display() method and add() method;
	 * return type of method is void
	 * @param x
	 */
	public void front(int x) 
	{
		alist.add(x);
		display();
		
	}
	/**
	 * the method dispaly()  performs display the queue elements  
	 */
	public void display()
	{
		System.out.println("the elements in the Queue is:" +alist);
	}
	/**rare is one of the operation in Queue ,which is used to delete the element into Queue,
	 * this method having  "size" variable to store the size of the queue by using size() 
	 * and having if() condition for check the capacity of size  
	 * remove(int index) is the method used for checking the element based on element.
	 */
	public void rare()
	{
		int size = alist.size();
		int i=0;
		//System.out.println(size);
		if(size>i)
		{
			
			alist.remove(i);
			i--;
		}
		
		System.out.println("after rare :" +alist );
		
		
	}
	/**
	 * top() this method is used for display the top element in the queue. 
	 * @return
	 */
	public  Object top()
	{
		return (alist.get(alist.size()-1));
	}
	public static void main(String[] args) 
	{
		/**
		 *"astack" is object reference for Queuearray()    
		 */
		Queuearray astack=new Queuearray();
		astack.front(10); //this method call to the front() method.
		astack.front(11);
		astack.front(12);
		astack.front(13);
		astack.front(14);
		
		
		astack.rare(); //this method call to the rare
		astack.rare();
		astack.rare();
		astack.rare();
		System.out.println("the top element in the queue is:" +astack.top());
		
	}
}	
