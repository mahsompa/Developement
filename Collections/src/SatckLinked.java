import java.util.LinkedList;


public class SatckLinked
{
	/**
	 * Doubly-linked list implementation of the List and Deque interfaces. 
	 * Implements all optional list operations, and permits all elements (including null).
	 *  Class Object is the root of the class hierarchy. Every class has Object as a superclass.
	 *  All objects, including arrays, implement the methods of this class
	 */
	 LinkedList<Object> arraylist=new LinkedList<Object>();
	 /**
	  * push is the one of the operation in stack operations
	  * which is used to insert the elements in stack 
	  * this push() method is used for implement the stack operation by using LinkedList reference variable 
	  * @param x
	  */
	public void push(int x)
	{
	arraylist.add(x);
	display();
	//System.out.println("the pushed element is:" +arraylist );
	}
	/**
	 *  the method dispaly()  performs display the stack elements
	 */
	public void display()
	{
		System.out.println("the elements in the stack " +arraylist);
	}

	/**
	 * pop is used to remove the elements in stack 
	 */
	public void pop()
	{
		//flag=true;
		 
 
 
		if(!arraylist.isEmpty()) // check if the stack is  empty or not   
		{
			
			arraylist.removeLast(); // if stack is not empty remove last element
			System.out.println("after pop:"+arraylist);
		}
		else
		{
			System.out.println("stack is already empty");
		}
		
	}
	/**
	 * display the top element in the stack
	 */
	
	public void peek()
	{
		System.out.println("stack peek element is"+arraylist.getLast());
	}
	public static void main(String[] args)
	{
		SatckLinked arrstack=new SatckLinked();
		arrstack.push(10);
		arrstack.push(11);
		arrstack.push(12);
		arrstack.push(13);
		
		arrstack.push(16);
		
		
		arrstack.pop();
		arrstack.pop();
		arrstack.pop();
		arrstack.pop();
		
		
		//arrstack.isEmpty();
	//	arrstack.peek();
		
		

	}

}
