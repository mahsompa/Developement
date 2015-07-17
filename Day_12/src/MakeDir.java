import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/* program explains merge the all directory file contents to single file */
public class MakeDir
{
	public static void main(String[] args) throws IOException {
		File dirfiles=new File("DirName");// create a directory 
		dirfiles.mkdir(); // make the directory
		//File f1=new File()
		String[] str=dirfiles.list();// list is the method returns string array
		System.out.println(str.length);// displays how many files persent in the directory
		try{
		for (int i = 0; i < str.length; i++) // loop repeats upto end of all files 
		{
			FileReader fr=new FileReader("DirName\\"+str[i]); // read the directory files 
			BufferedReader read1=new BufferedReader(fr); // read the files
			
			FileWriter fw=new FileWriter("File3.txt",true);// write data to file
			BufferedWriter wr = new BufferedWriter(fw);
			String str1 ;
			while((str1=read1.readLine())!=null)// iterate the loop until file is empty 
			{
				wr.write(str1 +" \r\n"); // write the data line by line
			}
		
		
			wr.flush();// flush the data to file
			
			wr.close();
		}
		}
		catch (Exception e) {
       System.out.println("file not found exception" +e);
		}
		}
	}
