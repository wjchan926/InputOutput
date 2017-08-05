package FileReadWrite;
import java.io.*;

/**
 * Reads and Formats a file.
 * 
 * @param args[0] data source file path 
 * @param args[1] destination file path 
 * @parma args[2] number of records in file
 * <p>
 * precondition: args[0] and args[1] are absolute file paths, args[2] is provided to user
 * @author Wesley
 *
 */
public class ReadWriteFormatter {
	public static void main(String[] args) throws IOException {
		try {
			ReadFile rf = new ReadFile(args[0], args[2]);

			rf.readFromFile();

			WriteFile wf = new WriteFile(args[1]);			
			
			FormatFile ff = new FormatFile(rf, wf);			
			
			ff.writeFormattedLine();			

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}
}
