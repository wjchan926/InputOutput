import java.io.*;

/**
 * This class represents a text (.txt) file
 * 
 * @author Wesley
 *
 */
public class ReadFile {

	private File f;
	private String[] fileLines;
	
	/**
	 * Constructor for the ReadFile class.
	 * 
	 * @param fileName FileName with an extension of .txt
	 * @throws IOException 
	 */
	public ReadFile(String fileName) throws IOException{
		f = new File(fileName);
		fileLines = new String[numLines()];
	}
	
	public String getFileName(){
		return f.getPath();
	}
	
	public String[] getFileLines(){
		return fileLines;
	}
	/**
	 * Reads each record of the File f and prints out the record on the console.
	 * Then closes out the file.
	 * 
	 * @throws IOException
	
	public void readFromFile() throws IOException{		

		 BufferedReader input = new BufferedReader( new FileReader(f) );
		 String record = null;
	
		 while((record = input.readLine()) != null){
			 System.out.println(record);
		 }
		 
		 input.close();
	} */
	
	/**
	 * Returns the number of lines in a file
	 * @return i is the number of lines in a file
	 * @throws IOException
	 */
	private int numLines() throws IOException {
		BufferedReader bf = new BufferedReader(new FileReader(f));
		
		int i = 0;
		
		while (bf.readLine() != null){
			i++;
		}
		
		bf.close();
		
		return i;		
	}
	
	public String[] readFromFile() throws IOException{		

		 BufferedReader bf = new BufferedReader( new FileReader(f) );
	//	 String record = null;

		 for (int i = 0; i < fileLines.length; i++){			
			 fileLines[i] = bf.readLine();
		 }
		 
		 bf.close();
		 
		 return fileLines;
		 
	/*	 while((record = input.readLine()) != null){
			 System.out.println(record);
		 }*/
		 
//		 input.close();
	}
		
}
