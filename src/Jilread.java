import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Jilread {
	private static final String FILENAME = "c:\\users\\sreekanth\\Desktop\\sample.jil";
	private static ArrayList<String> srra=null;
	private static String appendingStr;

	public static void main(String[] args) {
		
		
		srra=Reading_filedetails();
		//change common paths for the base string
		
		
		for(String sr:srra)
		{
			for(int i=2;i<=13;i++)
			{			
				if(i>9)
					appendingStr="0"+Integer.toString(i);
				else
					appendingStr=""+Integer.toString(i);
				
				
			}
		ReadFiles_details(sr);
		}
		

		}

	

private static void ReadFiles_details(String FILENAME)
{
	BufferedReader br = null;
	FileReader fr = null;

	try {

		//br = new BufferedReader(new FileReader(FILENAME));
		fr = new FileReader(FILENAME);
		br = new BufferedReader(fr);

		String sCurrentLine;

		while ((sCurrentLine = br.readLine()) != null) {
			System.out.println(sCurrentLine);
		}

	} catch (IOException e) {

		e.printStackTrace();

	} finally {

		try {

			if (br != null)
				br.close();

			if (fr != null)
				fr.close();

		} catch (IOException ex) {

			ex.printStackTrace();

		}
		}
}

	private static ArrayList<String> Reading_filedetails() {
		// TODO Auto-generated method stub
		
		 ArrayList<String> same = null;
		 try
		 {
			 same=new ArrayList<String>();

		File folder = new File("c:\\users\\sreekanth\\Desktop\\");
		File[] listOfFiles = folder.listFiles();

		for (File file : listOfFiles) {
			if (file.isFile()) {				
				System.out.println("the details"+file.getAbsolutePath());
				same.add(file.getAbsolutePath());
				System.out.println(file.getName());
			}
		 }	
		 }
		 catch(Exception e)
		 {
			 System.out.println("the message is"+e.getMessage());
		 }
		 return same;
	}

}
