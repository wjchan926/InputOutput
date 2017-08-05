package FileReadWrite;
import java.io.*;

public class FormatFile {

	private static final String[] HEADERS = { "State", "Population", "Child Population", "Child Poverty Population",
			"% Child Poverty" };
	private static final String[] HORIZONTAL_RULE = { "-----", "----------", "----------------",
			"------------------------", "---------------" };
	private String[] line;
	private String[] patterns = new String[HEADERS.length];
	private WriteFile writer;

	FormatFile(ReadFile rf, WriteFile wf) {
		line = rf.getFileLines();
		writer = wf;
		createPatterns();
	}

	private final String head() {
		String head =  String.join("   ", HEADERS);

		return head;
	}
	
	private final String horzRule() {
		String horz =  String.join("   ", HORIZONTAL_RULE);

		return horz;
	}

	public void writeFormattedLine() throws IOException {
		String[] data = new String[5];

		writer.writeToFile("%s", head());		
		writer.writeToFile("%n", "");
		writer.writeToFile("%s", horzRule());		
		writer.writeToFile("%n", "");

		for (String s : line) {
			data[0] = s.substring(0, 2).trim(); // State code
			data[1] = s.substring(82, 90).trim(); // District ID
			data[2] = s.substring(91, 99).trim(); // Child Pop
			data[3] = s.substring(100, 108).trim(); // Child Pov
			data[4] = String.format("%.2f", Double.parseDouble(data[3]) / Double.parseDouble(data[2]) * 100.0);
			data[2] = String.format("%,.0f", Double.parseDouble(s.substring(91, 99))); 
			data[3] = String.format("%,.0f", Double.parseDouble(s.substring(100, 108))); 

			for (int i = 0; i < data.length; i++) {
				writer.writeToFile(patterns[i], data[i]);
			}
			writer.writeToFile("%n", "");
		}
		
		writer.closeFile();
	}

	private void createPatterns() {
		// create field for all the patterns
		for (int i = 0; i < HEADERS.length; i++) {

			patterns[i] = i == 0 ? "%" + String.valueOf(HEADERS[i].length()) + "s"
					: "%" + String.valueOf(HEADERS[i].length() + 3) + "s";
		}
	}
}
