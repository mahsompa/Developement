
public class SumDigits {

	public static void main(String[] args) {
		int num=123;
		int rem;
		int sum=0;
		while(num!=0)
		{
		rem=num%10;
		sum+=rem;
		num=num/10;
		
		}
		System.out.println("sum"+sum);

	}

}
