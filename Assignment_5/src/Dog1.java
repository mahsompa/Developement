
public class Dog1 extends Mammal1{
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
    	 Animal ani=new Animal(5);
    	 ani.sleep();
    	 ani.eat();
    	 Animal dog=new Dog1();
    	 dog.eat();
    	 dog.sleep();
    	 
     }
}
