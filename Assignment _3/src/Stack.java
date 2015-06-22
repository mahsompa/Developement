public class Stack 
{  
 private static final int capacity = 3;  //Initialize capacity of stack
 int arr[] = new int[capacity];  
 int top = -1;  
  
 public void push(int pushedElement) //Push method for stack operation
 {  
  if (top < capacity - 1) 
  {  
   top++;  
   arr[top] = pushedElement;  
   System.out.println("Element " + pushedElement  
     + " is pushed to Stack !");  
   printElements();  
  } 
  else 
  {  
   System.out.println("Stack Overflow !");  
  }  
 }  
  
 public void pop()                // Pop method for stack OPeration
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
 }  
  
 public void printElements()  // PrintElements method for print all the operation 
 {  
  if (top >= 0) 
  {  
   System.out.println("Elements in stack :");  
   for (int i = 0; i <= top; i++) 
   {  
    System.out.println(arr[i]);  
   }  
  }  
 }  
  
 public static void main(String[] args) 
 {  
  Stack stackDemo = new Stack();  //create an object for class
  
  stackDemo.pop();  
  stackDemo.push(23);  
  stackDemo.push(2);  
  stackDemo.push(73);  
  stackDemo.push(21);  
  stackDemo.pop();  
  stackDemo.pop();  
  stackDemo.pop();  
  stackDemo.pop();  
 }  
  
}