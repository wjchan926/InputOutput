import java.io.*;


public class ReadWriteDriver {
	public static void main (String[] args) throws IOException {

		
		try {
			ReadFile rf = new ReadFile("SmallAreaIncomePovertyEstData.txt");					
			
			
			WriteFile wf = new WriteFile("test.txt");
			
			for (int i = 0; i < rf.getFileLines().length; i++){
				wf.writeToFile(rf.readFromFile()[i]);
			}
			
			
		} catch (IOException e){
			System.out.println(e.getMessage());
		}			
		
		
	
	}
}
