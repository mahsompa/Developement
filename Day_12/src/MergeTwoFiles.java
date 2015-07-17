import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class MergeTwoFiles
{

/* this program explains how to merge two files into another file */
	public static void main(String[] args) throws IOException 
	{         
         /*  create a new file named as text1  */
		File file1=new File("text1");
		file1.createNewFile();
		File file2=new File("text2");
		file2.createNewFile();
		/*using the file writer to write the data to file  */
		FileWriter fw1=new FileWriter("text1");
		fw1.write("text1 file content "); // method which is used for write the data
		fw1.flush(); // method is used for flush the data
		fw1.close(); // close the file
		
		FileWriter fw2=new FileWriter("text2");
		fw2.write("text2 file content");
		fw2.flush();
		fw2.close();
		try {
			FileReader fr = new FileReader("text1");// to read the data from the file
			int size;
			while((size=fr.read())!=-1) // check the condition for file is empty or not
			{
				System.out.print((char)size); // get the data 
			}
			System.out.println();
			FileReader fr1 = new FileReader("text2");
			int size1;
			while((size1=fr1.read())!=-1) //iterate the loop until file is empty
			{
			{
				System.out.print((char)size1);
			}
			}
		}
		catch (FileNotFoundException e) //catch the exception if file is not found
		{
			e.printStackTrace();
		}
		File f=new File("text3") ; // create a file
		f.createNewFile();
		/**
		 * Reads text from a FileReader, 
		 * buffering characters so as to provide for the efficient reading of characters,
		 *  arrays, and lines. 
		 *  */
		BufferedReader	reader1 = new BufferedReader(new FileReader("text1"));
		BufferedReader	reader2 = new BufferedReader(new FileReader("text2"));
		BufferedWriter wr = new BufferedWriter(new FileWriter("text3",true));
		String str ;
		while((str=reader1.readLine())!=null)//iterate the loop until file is empty
		{
			wr.write(str ); // write the data line by line
		}
		wr.write("\n");
		while((str=reader2.readLine())!=null)
		{
			wr.write(str);
		}
		wr.write("\n");
		wr.flush();

		wr.close(); // close the file 

	

}
}
