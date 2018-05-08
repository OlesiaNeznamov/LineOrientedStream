import java.io.FileNotFoundException;

public class PrintStreamWriterTestAppl {

	private static final int N_LINES = 100;

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("tra-la-la");
		IStreamWriter writer = new PrintWriterTest("printwriter", N_LINES);
		writer.runTest();
		IStreamWriter stream = new PrintStreamTest("printstream", N_LINES);
		stream.runTest();

	}

}
