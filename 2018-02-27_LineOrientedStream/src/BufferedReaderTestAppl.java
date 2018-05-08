import java.io.*;
public class BufferedReaderTestAppl {

	public static void main(String[] args) throws IOException {
//		BufferedReader reader = new BufferedReader(new FileReader("printstream.txt"));
//		String line;
//		while(true){
//			line = reader.readLine();
//			if(line==null) break;
//			System.out.println(line);
//		}
//		reader.close();
		
		/*******************************/
		
		// source - console, destination - file
		//copyLines(new InputStreamReader(System.in), new PrintStream("fileFromConsole"));
		
		// source - file, destination - console
		copyLines(new FileReader("fileFromConsole"), System.out);

	}
		public static void copyLines(Reader reader, PrintStream stream) throws IOException{
			BufferedReader bufReader = new BufferedReader(reader);
			while(true){
				String line = bufReader.readLine();
				if(line==null) break;
				stream.println(line);
			}
		}


}
