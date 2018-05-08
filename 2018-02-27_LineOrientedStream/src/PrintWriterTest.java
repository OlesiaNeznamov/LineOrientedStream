import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.Instant;

public class PrintWriterTest implements IStreamWriter {
	
	PrintWriter writer;
	int nLines;
	public PrintWriterTest(String fileName, int nLines) throws FileNotFoundException{
		writer = new PrintWriter(fileName);
		this.nLines=nLines;
	}

	@Override
	public void runTest() {
		Instant start = Instant.now();
		for (int i = 0; i < nLines; i++) {
			writer.println(line);
		}
		writer.close();
		Instant finish = Instant.now();
		displayResults(start, finish, "PrintWriter");

	}

}
