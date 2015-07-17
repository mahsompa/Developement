import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
/* this program explains merge the files line by line */
public class MergeFileLinebyLine 
{
	public static void main(String[] args) throws IOException 
	{
		File f1 = new File("file1");//create new file
		f1.createNewFile();
		File f2 = new File("file2");// create new file
		f2.createNewFile();
//
//		FileWriter fw = new FileWriter(f1);
//		fw.write("capgemini india pvlmtd ");
//		fw.write(" ");
//		fw.write("capgemini uk pvlmtd ");
//		fw.flush();
//		fw.close();
//		FileWriter fw1= new FileWriter(f2);
//		fw1.write("capgemini india pvlmtd line2 ");
//		fw1.write(" ");
//		fw1.write("capgemini uk pvlmtd lin2 ");
//		fw1.flush();
//		fw1.close();
//		try {
//			FileReader	fr = new FileReader("file1");
//			int size;
//			while((size=fr.read())!=-1)
//			{
//				System.out.print((char)size);
//			}
//			System.out.println();
//			FileReader	fr1 = new FileReader("file2");
//			int size1;
//			while((size1=fr1.read())!=-1)
//			{
//				System.out.print((char)size1);
//			}
//		} catch (FileNotFoundException e) 
//		{
//			e.printStackTrace();
//		}
		
		ArrayList<String> al1 = new ArrayList<String>(); // create a ArrayList class for check the lines of file
		/**
		 * Reads text from a FileReader, 
		 * buffering characters so as to provide for the efficient reading of characters,
		 *  arrays, and lines. 
		 *  */
		BufferedReader br1 = new BufferedReader(new FileReader("file1"));// read the data from the file
		{
			String line;
			while ((line = br1.readLine()) != null) // iterate the loop until end of the file
			{
				al1.add(line); // add the line to array list
			}
		}
		ArrayList<String> al2 = new ArrayList<String>();
		BufferedReader br2 = new BufferedReader(new FileReader("file2"));
		{
			String line;
			while ((line = br2.readLine()) != null) // iterate the loop until end of the file
			{
				al2.add(line); // add the line to array list
			}
		}
		PrintWriter pw = new PrintWriter("File3.txt");// to create a new file
		Iterator<String> it1 = al1.iterator(); // Interface for iterate the arraylist elements
		Iterator<String> it2 = al2.iterator();
		while (it1.hasNext() || it2.hasNext()) // check the condition
		{
			if (it1.hasNext())
				pw.println(it1.next());// print the file1 content
			if (it2.hasNext())
				pw.println(it2.next());//print the file2 content
		}
		pw.flush();
		pw.close();// close the file

	}

}
