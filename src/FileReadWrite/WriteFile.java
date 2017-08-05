package FileReadWrite;
import java.io.*;

public class WriteFile {

	private String filepath;
	private FileWriter outFile;
	private PrintWriter printFile;

	WriteFile(String s) throws IOException {
		filepath = s;

		outFile = new FileWriter(filepath);
		printFile = new PrintWriter(outFile);

	}

	public void writeToFile(String format, String s) throws IOException {
		printFile.printf(format, s);
	}
	
	public void closeFile(){
		printFile.close();
	}

}
