
public class StaticInnerClass {
	static int x=40;
	static class Staticclass
	{
	void display()
	{
		System.out.println(x);
	}
	}
	public static void main(String[] args) {
		StaticInnerClass.Staticclass sc= new StaticInnerClass.Staticclass();
		sc.display();
		
	}

}
