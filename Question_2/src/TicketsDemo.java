
public class TicketsDemo {

	public static void main(String[] args) {
		float adult=200;
		double child=0.7*adult;
		//double total=adult+child;
		int cAdult=4;
		int cChild=6;
		double totAdulFare=4*adult;
		double totChiFare=6*child;
		double total=totAdulFare+totChiFare;
		double tax=0.14*total;
		double totalll=total+tax;
		
		System.out.println("Total children's fare is :"+totChiFare);
		System.out.println("Total adults's fare is :"+totAdulFare);
		System.out.println("Total fare is :"+totalll);
		
	}

}
