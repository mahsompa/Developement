
public class ReverseNum {

	public static void main(String[] args) {
		int num=123;
		int rev=0;
		//int temp;
		while(num!=0)
		{
			rev=rev*10;
			rev=rev+(num%10);
			num=num/10;
		}
		System.out.println("reverse of 123 is:"+rev);

	}

}
