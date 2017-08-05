package FileReadWrite;
import java.io.*;

/**
 * Reads data from file
 * 
 * @author Wesley Chan
 *
 */
public class ReadFile {

	private File f;
	private String[] fileLines;

	/**
	 * Constructor with file path and number of lines as arguments
	 * 
	 * @param fileName filepath
	 * @param numLines	number of records in file
	 * @throws IOException throws exception if it cannot find the file
	 */
	public ReadFile(String fileName, String numLines) throws IOException {
		f = new File(fileName);
		fileLines = new String[Integer.parseInt(numLines)];
	}
	
	/**
	 * Gets the fileLines array
	 * @return fileLines array
	 */
	public String[] getFileLines() {
		return fileLines;
	}

	/**
	 * Reads the file line by line and stores each in an index of the fileLines array
	 * @throws IOException throws exception if it cannt find the file
	 */
	public void readFromFile() throws IOException {

		FileReader fr = new FileReader(f);
		BufferedReader input = new BufferedReader(fr);

		for (int i = 0; i < fileLines.length; i++) {
			fileLines[i] = input.readLine();
		}
		input.close();
	}

}
