package FileReadWrite;

import java.io.*;

/**
 * Displays a report on the console
 * 
 * @param args[0] input file path
 * @param args[1] number of records
 * <p>
 * precondition: args[0] is an absolute file path, args[1] is not negative
 * @author Wesley
 *
 */
public class Reporter {
	public static void main(String[] args) throws IOException {
		try {
			FileReader fr = new FileReader(args[0]);
			BufferedReader input = new BufferedReader(fr);

			for (int i = 0; i < Integer.parseInt(args[1]) + 2; i++) {
				System.out.println(input.readLine());
			}

			input.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
