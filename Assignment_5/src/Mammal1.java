
public abstract class Mammal1 extends Animal{
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
