import java.io.*;
public class PrintStreamWritter {

	public static void main(String[] args) throws Exception {
		PrintStream printStream = new PrintStream("printstream.txt");
		PrintWriter printWriter = new PrintWriter ("printwritter.txt");
		printStream.println("Hello");
		printWriter.println("Hello");
		printWriter.flush();

	}

}
