import java.time.Instant;
import java.time.temporal.ChronoUnit;

public interface IStreamWriter {
    String line = "Hello";
	void runTest();
	default void displayResults(Instant start, Instant finish, String text){
		long duration=ChronoUnit.MILLIS.between(start, finish);
		System.out.printf("test %s running time %d", text, duration);
	}
}
