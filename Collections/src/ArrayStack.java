/**
 * java.Util is the one of the package in java  Contains the collections framework, 
 * legacy collection classes, event model, date and time facilities, internationalization, and 
 * miscellaneous utility classes 
 **/
import java.util.ArrayList;

public class ArrayStack

{
	/**
	 * front is one of the operation in Stack ,which is used to insert the element into Stack, 
	 * front(int ) is user defined method to perform Stack operations
	 * in this method having display() method and add() method;
	 * return type of method is void
	 */
	
	ArrayList<Integer> alist=new ArrayList<Integer>();
	/**
	 * push is the one of the operation in stack operations
	 * which is used to insert the elements in stack 
	 * this push() method is used for implement the stack operation by using ArrayList reference variable 
	 * @param x
	 */
	public void push(int x)
	{
		alist.add(x);
		display();
		
	}
	/**
	 * the method dispaly()  performs display the stack elements
	 */
	public void display()
	{
		System.out.println("the elements in the statck is:" +alist);
	}
	/**
	 * pop is used to remove the elements in stack
	 */
	public void pop()
	{
		int size = alist.size();//calculate size of the stack and store that size into one  variable named as size
		
		if(size > -1) // check  the size  
		{
			System.out.println("poped element is :" +alist.get(size-1));
			alist.remove(size-1); // remove the element from the stack	
		}
		
		System.out.println("after pop :" +alist );	
	}
	public  Object peek()
	{
		return (alist.get(alist.size()-1));
	}
	public static void main(String[] args) 
	{
		
		ArrayStack astack=new ArrayStack();
		astack.push(10); // this method call to the front() method.
		astack.push(11);
		astack.push(12);
		astack.push(13);
		astack.push(14);
		
		astack.push(19);
		
		astack.pop(); //this method call to the rare() method
		astack.pop();
		
		System.out.println("the peek element in the stack is:" +astack.peek());
	}
}	















