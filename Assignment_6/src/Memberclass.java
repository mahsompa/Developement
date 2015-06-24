
public class Memberclass {
	private int i=10;
	class Innerclass
	{
		void methdo()
		{
			System.out.println(i);
		}
	}

	public static void main(String[] args)
	{
		Memberclass mc=new Memberclass();
		Memberclass.Innerclass ic= mc.new Innerclass();
		ic.methdo();
		
	}

}
