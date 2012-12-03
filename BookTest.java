import org.junit.*;
import static org.junit.Assert.*;
import java.util.Random;

public class BookTest {
	@Test
	public void testName() {
		String name = "Midsummers's...";
		String author = "Sh...";

		Book book = new BookImpl(name, author);
		assertTrue(book.getName() == name);
	}
	@Test
	public void testAuthor() {
		String name = "Midsummers's...";
		String author = "Sh...";

		Book book = new BookImpl(name, author);
		assertTrue(book.getAuthor() == author);
	}
}