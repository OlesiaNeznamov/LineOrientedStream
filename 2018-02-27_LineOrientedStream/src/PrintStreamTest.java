import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.time.Instant;

public class PrintStreamTest implements IStreamWriter {
	
	PrintStream stream;
	int nLines;
	public PrintStreamTest(String fileName, int nLines) throws FileNotFoundException{
		stream = new PrintStream(fileName);
		this.nLines=nLines;
	}

	@Override
	public void runTest() {
		Instant start = Instant.now();
		for(int i=0; i<nLines; i++){
			stream.println(line);
		}
		stream.close();
		Instant finish = Instant.now();
		displayResults(start, finish, "PrintStream");

	}

}
