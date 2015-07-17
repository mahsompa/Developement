import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.TreeSet;
/* this program explains  eliminate duplicate word in the file and merge that files content into single file    */

public class RemoveDuplicateText {

	public static void main(String[] args) {
		/*  create a new file named as text1  */
		try{
		File file1=new File("duplicate1");
		file1.createNewFile();
		File file2=new File("duplicate2");
		file2.createNewFile();
		/*using the file writer to write the data to file  */
		FileWriter fw1=new FileWriter("duplicate1");
		fw1.write("text1 file content mahesh suresh"); // method which is used for write the data
		fw1.flush(); // method is used for flush the data
		fw1.close(); // close the duplicate1
		FileWriter fw2=new FileWriter("duplicate2");
		fw2.write("text2 file content mahesh");
		fw2.flush();
		fw2.close();//close the duplicate2
		}
		catch(IOException ioe)
		{
		ioe.printStackTrace();	
		}
		TreeSet<String> tr=new TreeSet<String>();
		/**
		 * Reads text from a FileReader, 
		 * buffering characters so as to provide for the efficient reading of characters,
		 *  arrays, and lines. 
		 *  */
		try { // try block to  checking file for read
			/* BufferReader is used to read the data from file using file reader*/
           BufferedReader	reader1 = new BufferedReader(new FileReader("duplicate1"));
			{
				String str;
				while((str=reader1.readLine())!=null) // iterate the loop until file is empty
				{
					String temp=str;
					String[] starr=temp.split(" "); // this method is used for split the line word by word
					for(int i=0;i<starr.length;i++)
					{
						tr.add(starr[i]); // to add the string array words to TreeSet
					}
				}

			}
		
			/* BufferReader is used to read the data from file using file reader*/
			BufferedReader	reader2 = new BufferedReader(new FileReader("duplicate2"));
			{
				String str;
				while((str=reader2.readLine())!=null)// iterate the loop until file is empty
				{

					String temp=str;
					String[] starr=temp.split(" ");// this method is used for split the line word by word
					for(int i=0;i<starr.length;i++)
					{
						tr.add(starr[i]);// to add the string array words to TreeSet
					}
				}
			}
		}
		catch (IOException nfe) 
		{
			System.out.println(" file is notfound for  read" +nfe);			
		}//close catch block
		try 
		{ //  try block for PrintWrite 
			PrintWriter pw=new PrintWriter("duplicate3");
			for(String line: tr)
			{
				pw.println(line);
			}
			pw.flush();
			System.out.println("file with out duplicate data merged to duplicate3 file succesed ............");
			pw.close();
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} //closed inner catch block

	}
}

