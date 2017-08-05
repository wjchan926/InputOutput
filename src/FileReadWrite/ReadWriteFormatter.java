package FileReadWrite;
import java.io.*;

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
