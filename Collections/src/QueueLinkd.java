import java.util.LinkedList;


public class QueueLinkd
{
	/**Doubly-linked list implementation of the List and Deque interfaces. 
	 * Implements all optional list operations, and permits all elements (including null).
	 *  Class Object is the root of the class hierarchy. Every class has Object as a superclass.
	 *  All objects, including arrays, implement the methods of this class
	 */
	LinkedList<Object> queuelinkedlist=new LinkedList<Object>();
	/**
	 * front is one of the operation in Queue ,which is used to insert the element into Queue, 
	 * front(int ) is user defined method to perform Queue operations
	 * in this method having display() method and add() method;
	 * return type of method is void
	 * @param x
	 */
	public void front(int x)
	{
		queuelinkedlist.add(x);
	display();
	
	}
	/**
	 * the method display()  performs display the queue elements
	 */
	public void display()
	{
		System.out.println("the elements in the Queue " +queuelinkedlist);
	}
/**
 * rare is one of the operation in Queue ,which is used to delete the element into Queue,
 **/
	public void rare()
	{
		//flag=true;
		if(!queuelinkedlist.isEmpty()) // check if the queue is empty or not
		{
			
			queuelinkedlist.removeFirst(); // if it is not empty remove first element
			System.out.println("after rare:"+queuelinkedlist);
		}
		else //the queue is empty 
		{
			System.out.println("queue is already empty");
		}
		
	}
	/**
	 * top() this method is used for display the top element in the queue.
	 */
	
	public void top()
	{
		System.out.println("queue top element is"+queuelinkedlist.getFirst());
	}
	public static void main(String[] args)
	{
		/**
		 * "arrstack" is object reference for QueueLinked().
		 */
		QueueLinkd arrstack=new QueueLinkd();
		arrstack.front(10); //this method call to the front() method.
		arrstack.front(11);
		arrstack.front(12);
		arrstack.front(13);
		arrstack.front(14);
		arrstack.rare();    //this method call to the rare() method
		arrstack.rare();
		arrstack.top();   //this method call to the top() method
		
		

	}

}
