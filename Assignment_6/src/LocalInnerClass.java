
public class LocalInnerClass {
	private int x=10;
	public void xyz()
	{
		class Inner //Local Inner class
		{
		void iss()
		{
			System.out.println(x);
			System.out.println("localinner class block");
		}
		
		}
		Inner i=new Inner(); // object for Ineer Class
		i.iss();
	}
	

	public static void main(String[] args)
	{
		LocalInnerClass ln=new LocalInnerClass(); //object for outer class
		ln.xyz();
	
	}

}
