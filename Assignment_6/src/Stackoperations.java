public class Stackoperations 
{  
	private static final int capacity = 6;  
	Object arr[] = new Object[capacity];  
	int top = -1;  

	public void push(Object pushedElement) 
	{  
		if (top < capacity - 1) 
		{  
			top++;  
			arr[top] = pushedElement;  
			System.out.println("Element " + pushedElement  
					+ " is pushed to Stack !"); 
			printElements(); 
			
		} else 
		{  
			System.out.println("Stack Overflow !");  
		}  
	}  

	public void pop(Object popedElement) 
	{

		if (top >= 0) 
		{  
			top--;  
			System.out.println("Pop operation done !");  
		} 
		else 
		{  
			System.out.println("Stack Underflow !");  
		}  
		printElements();
	}  

	public Object printElements() 
	{  
		if (top >= 0) 
		{  
			System.out.println("Elements in stack :");  
			for (int i = 0; i <= top; i++) 
			{  
				System.out.println(arr[i]);  
			}  
		} 
		return arr;
	}  

	public static void main(String[] args) 
	{  
		Stackoperations stackDemo = new Stackoperations();  
  
		stackDemo.push("mahesh");  
		stackDemo.push("devraj");  
		stackDemo.push("mah"); 
		stackDemo.push("mahanth"); 
		stackDemo.push("vishal"); 
		stackDemo.pop("mah");
		stackDemo.pop("mahanth"); 
		
		
	}  

}  