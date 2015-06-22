
public class Animal {
	private String muvngStyle;
	private String mkSound;
	private int legs;
	public Animal()
	{
		System.out.println("***animal  class is invoked:constructor");
	}
	public Animal(int l)
	{   
		legs=l;
		System.out.println("i m havng legs="+legs);
	}
	
	static{
		System.out.println("***animal static block is invoked:SIB");
	}
	{
		System.out.println("***Animal Intance initialiszer block:IIB");
	}
	public void sleep() 
	{
		System.out.println("***animal is sleeping");
	}
	public void eat()
	{
		System.out.println("***animal is eating");
	}
}



 /*abstract class Mammal1 extends Animal{
	abstract public void givBirth();
	
	public Mammal1()
	{
		System.out.println("---Mammal class is invoked:constructor");
	}
	static{
		System.out.println("---mammal static block is invoked:SIB");
	}
	{
		System.out.println("---Mammal Intance initialiszer block:IIB");
	}
}
  
  
class Dog1 extends Mammal1{
	 public void givBirth()
	 {
		 System.out.println("===abstract mammal class method invoked");
	 }
	 public Dog1()
	 {
		 System.out.println("===Dog class is invoked:constructor"); 
	 }
     static{
    	 System.out.println("===Dog static block is invoked:SIB");
     }
     {
 		System.out.println("===Dog Intance initialiszer block:IIB");
 	}
     
     public static void main(String[] args) {
    	 Animal ani=new Animal();
    	 ani.sleep();
    	 ani.eat();
    	 Animal dog=new Dog1();
    	 dog.eat();
    	 dog.sleep();
    	 
     }
}*/