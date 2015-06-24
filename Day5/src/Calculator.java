public class Calculator implements Operations
{
	/*  develop the avg() method for finding  Average of number*/
	public double avg(double...a)
	{
		double sum=0;
		double average;
		for(double d:a)
		{
			sum=sum+d;
		}
		average=sum/a.length;
		return average;
	}
	/* gcd() used to find Greatest Common Divisor of two numbers  */
	public int gcd(int i,int j)
	{
//		if(j==0)
//		{
//			return i;
//		}
//		
//		return gcd(j,i%j);
		while(i!=j)
		{
			if(i>j)
			
				i=i-j;
			else
				j=j-i;
		}
		return i;
	}
	/* lcm() method is used to find least common multiplier*/
	public int lcm(int i,int j)
	{
		
	int big,small,lcm=1;
		if (i > j) // check whether i is big or j is big
        {
            big = i;
            small = j;
        }
		
		else 
        {
            big = j;
            small = i;
        }
        for (int k= 1; k <= big; k++) 
        {
            if (((big * k) % small) == 0) {
                 lcm = big * k; // condition to calculate the LCM of two
                                    // numbers
               
                break;
            }
	}
        return lcm;
	}
	public void sqre(double a) // method is used to calculate the square root of the number
	{
		if(a==0)
		{
			System.out.println("square root of the"+a+"is zero");
			
		}
		else if(a<0)
			{
			System.out.println("the value of is must be gtreater than 0");	
			}
		
		double x=Math.sqrt(a);
		System.out.println(x);
	}
	
	public void square(int n) // method is used to calculate the square of the number
	{
		int sqr;
		sqr=n*n;
		System.out.println(sqr);
	}
	
	public int sum(int...x) // method is used to calculate the sum of integers.
	{
		int sum1=0;
		for(int d:x)
		{
			sum1=sum1+d;
		}
		
		return sum1;
	}
	
	public void sub(int i,int j) // method is used to calculate the subtraction of two numbers
	{
		int result;
		if(i>j&&i<=0)
		{
			result=i-j;
			System.out.println(result);
		}
		else
		{
			System.out.println("enter correct value of i:");
		}
		
		// return result;
	}
	
	public int mul(int...mul) // method is used to calculate the multiplication of numbers
	{
		int result=1;
		for(int m:mul)
		{
			result=result*m;
		}
		return result;
		
	}
	
	public double div(double i,double j) // method is used to calculate the division of a two numbers.
	
	{
		double result;
		
		result=(i/j);
		
		return result;
		
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Calculator ca=new Calculator();    
		System.out.println(ca.sum(12,13,1));
		ca.sub(0,12);
		System.out.println(ca.mul(2,3,1));
		System.out.println(ca.div(4,0));
		// System.out.println(ca.avg(12,12,12,12));
		ca.square(10);
		ca.sqre(-5);
		System.out.println("gcd of i, j is:" +ca.gcd(2,3));
		System.out.println("lcm of i,j is :" +ca.lcm(2,1));
		
	}
	
}
