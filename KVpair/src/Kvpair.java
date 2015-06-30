import java.util.Scanner;
public class Kvpair 
{
	private	String[] keyarray;
	private String[] valuearray;
	private int keyindex=-1;
	private int valueindex=-1;
	private int size=20;
	/* Default constructor use to initialize the  size*/
	public Kvpair() {
		keyarray=new String[size];
		valuearray=new String[size];
	} 
	/* parameterized constructor to initialize  size of variables keyarray and valuearray*/
	public Kvpair(int size)
	{
		keyarray=new String[size];
		valuearray=new String[size];

	}
	/* put method is used to put the keys and values into the stack*/
	public void put(String key, String value)
			throws ArrayIndexOutOfBoundsException 
	{
		if (keyarray != null)   //outer if condition
		{
			if (keyindex < keyarray.length) //nested if condition
			{
				if (!checkDuplicate(key, value)) //nested if condition
				{ 

					keyarray[++keyindex] = key;
					valuearray[++valueindex] = value;
				} 
				else  // nested else 
				{
					System.out.println("Cannot Insert!!! Duplicate Values");
				}

			} 
			
			else //nested else
			{
				System.out.println("Cannot Insert!! Exceeded key-value Store Capacity!!");
			}
		} 
		
		else // else for outer if condition
			
			System.out.println("Key cannot be null!!");
	}

	/* method to check duplicates */
	private boolean checkDuplicate(String key, String value) 
	{

		for (int i = 0; i < keyarray.length; i++)   // loop for getting the keyarray length
		{
			if (keyarray[i] == key || valuearray[i] == value) // check condition for both key and value are present are not 
			{
				System.out.println("Duplicate Found!!!");
				return true;
			}
		}
		return false;
	}
/* this method  helps kvpair is empty or not */
	public boolean isEmpty()
	{
		if(keyindex==-1)
		{
			return true;
		}
		else

			return false;
	}
	/* this method is helps for getting the key from user end*/
	public String get(String key)
	{
		int index=findKeyIndex(key); // call to findkeyIndex() method
		if(index !=-1 && index<=keyarray.length)
		{
			return valuearray[index];
		}

		return null;
	}
	/* this method is helps for getting the index from user end*/
	public String get(int index) 

	{
		if (index != -1 && index-- <= keyarray.length) 
		{

			return valuearray[index];
		}
		return null;
	}
/* method is used for getting the index value for keyarray  */
	private int findKeyIndex(String key) 
	{

		for (int i = 0; i < keyarray.length; i++) 
		{
			if (keyarray[i].equals(key)) 
			{
				return i;
			}
		}

		return -1;
	}

/* method is used to show all key value pair elements */
	public void showAll() 
	{
		if (!isEmpty()) 
		{
			System.out.println("Key Value Pair:");

			for (int i = 0; i < keyarray.length; i++)
			{
				if (keyarray[i] != null) 
				{
					System.out.println(keyarray[i] + "-->" + valuearray[i]);
				}
			}
		}
	}
	/* method is used for remove key*/
	public void remove(String key)
	{
		int index=findKeyIndex(key);
		if(keyarray[index].equals(key))
		{

			keyarray[index]=null;
			valuearray[index]=null;
		}
	}
/* this method is used for show available spaces*/
	public int showSpaceAvailable()
	{

		int count = 0;
		for (int i = 0; i < keyarray.length; i++) 
		{
			if (keyarray[i] == null) 
			{
				count++;
			}
		}
		return count;
	}
	/* method is used to get total keyset */
	public String[] getKeySet() 
	{
		String keySet[] = new String[keyarray.length];
		if (!isEmpty())
		{
			for (int i = 0; i < keyarray.length; i++) 
			{
				if (keyarray[i] != null) 
				{
					keySet[i] = keyarray[i];
				}
			}
		}
		return keySet;
	}
	public static void main(String[] args) 
	{
		Kvpair kvpair=new Kvpair();

		kvpair.put("1", "mahi"); 
		kvpair.put("1", "suri");
		kvpair.put("2", "sai");
		kvpair.put("3", "syam");
		kvpair.put("4", "sanju");
		boolean b=kvpair.isEmpty();
		System.out.println("is keyvalue pair is empty??" +b);
		kvpair.get("2");
		kvpair.showAll();
		kvpair.remove("3");
		kvpair.showAll();
		System.out.println("available space is " +kvpair.showSpaceAvailable());
		String a[] = kvpair.getKeySet();
		System.out.println("Availabe Keyset:");
		for (String st : a) {
		System.out.print(st + "\n");
		}
		System.out.println("Enter key:");
		Scanner scan = new Scanner(System.in);
		String key = scan.next();
		String val = kvpair.get(key);
		System.out.println("Value for " + key + "-->" + val);

		System.out.println("Enter index:");
		int index = scan.nextInt();

		String val1 = kvpair.get(index);
		System.out.println("Value at index " + index + ":" + val1);


	}


	}
