package FileReadWrite;
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

	public ReadFile(String fileName, String numLines) throws IOException {
		f = new File(fileName);
		fileLines = new String[Integer.parseInt(numLines)];
	}

	public String getFileName() {
		return f.getPath();
	}

	public String[] getFileLines() {
		return fileLines;
	}

	public void readFromFile() throws IOException {

		FileReader fr = new FileReader(f);
		BufferedReader input = new BufferedReader(fr);

		for (int i = 0; i < fileLines.length; i++) {
			fileLines[i] = input.readLine();
		}
		input.close();

	}

	private int lines() throws IOException {
		// For testing only
		BufferedReader br = new BufferedReader(new FileReader(f.getName()));
		int lines = 0;
		while (br.readLine() != null) {
			lines++;
		}
		br.close();

		return lines;
	}

}
