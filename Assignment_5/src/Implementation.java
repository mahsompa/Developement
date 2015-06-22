
public  class Implementation implements Arithmatics {

	public  Implementation(int...num) {
		for(int n:num)
		{
			if(n<100 || n>9999)
			{
				System.out.println("invalid num entered...it sud be between 100-9999");
			}
			else
			{
				allOpp(n);
			}
		}


	}

	public void allOpp(int n){
		sum(n);
		reverse(n);
		factorial(n);
		average(n);
		lastDigit(n);
	}
	public int sum(int num){

		int rem;
		int sum1=0;
		while(num!=0)
		{
			rem=num%10;
			sum1+=rem;
			num=num/10;

		}
		System.out.println("sum of the digit is"+sum1);
		return sum1;
	}
	public int reverse(int num)
	{
		int rev=0;
		while(num!=0)
		{
			rev=rev*10;
			rev=rev+(num%10);
			num=num/10;
		}
		System.out.println("reverse of the digit is"+rev);
		return rev;
	}
	public long factorial(int num)
	{

		int c;
		long result = 1;

		for (c = 1; c <= num; c++)
		{
			result = result * c;
		}

		System.out.println("factorial of the digit is" +result);
		return result;
	}
	public int average(int num)
	{
		int rem;
		int count=0;
		int sum=0;

		while(num!=0)
		{
			rem=num%10;
			sum+=rem;
			num=num/10;
			count++;

		}
		int avg=sum/count;
		System.out.println("average of the digit is"+avg);
		return avg;
	}
	public int  lastDigit(int num)
	{
		int temp=0;
		if(num%10==1)
		{
			 temp=(1*3);
		}else if(num%10==2)
		{
			temp=(2*3);
		}
		System.out.println("the result is" +temp);
		
		for(int i=1;i<=temp;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		return temp;
		
	}

	public static void main(String[] args) {
		Implementation imp=new Implementation(891,702);


	}

}


