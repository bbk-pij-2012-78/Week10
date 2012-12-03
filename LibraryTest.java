import org.junit.*;
import static org.junit.Assert.*;
import java.util.Random;

public class LibraryTest {

	@Test
	public void testName() {
		String name = "Birkbeck Library";

		Library lib = new LibraryImpl(name);
		assertTrue(lib.getName() == name);
	}

	@Test
	public void testMaxBooks() {
		String name = "Birkbeck Library";
		int max = 12;

		Library lib = new LibraryImpl(name);
		lib.setMaxBooksBorrowed(max);
		assertTrue(lib.getMaxBooksBorrowed() == max);
	}

	@Test
	public void testGetID() {
		String name = "Nick Sutton";

		Library lib = new LibraryImpl("Birkbeck");
		assertTrue(lib.getID(name) == 1);
	}
}