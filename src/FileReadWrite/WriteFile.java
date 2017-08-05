package FileReadWrite;
import java.io.*;

/**
 * Writes data to file
 * @author Wesley Chan
 *
 */
public class WriteFile {

	private String filepath;
	private FileWriter outFile;
	private PrintWriter printFile;
	
	/**
	 * Constructor for WriteFile class with a filepath as a argument
	 * @param s filepath
	 * @throws IOException throws exception if it cannot find a file
	 */
	WriteFile(String s) throws IOException {
		filepath = s;
		outFile = new FileWriter(filepath);
		printFile = new PrintWriter(outFile);
	}
	
	/**
	 * Writes a formatted string to file
	 * @param format printf method format-string
	 * @param s string that will be formatted
	 * @throws IOException throws expection if it cannot find file
	 */
	public void writeToFile(String format, String s) throws IOException {
		printFile.printf(format, s);
	}
	
	
	/**
	 * Closes the WriteFile object
	 */
	public void closeFile(){
		printFile.close();
	}

}
