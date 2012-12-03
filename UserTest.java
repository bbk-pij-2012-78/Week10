import org.junit.*;
import static org.junit.Assert.*;
import java.util.Random;

public class UserTest {

	@Test
	public void testName() {
		String name = "John Smith";
		int id = 1;

		User user = new UserImpl(name, id);
		assertTrue(user.getName() == name);
	}
	@Test
	public void testLibraryID() {
		String name = "John Smith";
		int id = 1;

		User user = new UserImpl(name, id);
		assertTrue(user.getLibraryID() == id);
	}

	@Test
	public void testLibraryIDChange() {
		String name = "John Smith";
		int id = 1;

		User user = new UserImpl(name, id);
		id = 2;
		user.setLibraryID(id);
		assertTrue(user.getLibraryID() == id);
	}

	@Test
	public void testLibraryObjID() {
		String name = "John Smith";
		int id = 1;

		UserImpl user = new UserImpl(name, id);
		user.register(new LibraryImpl());
		assertTrue(user.getLibrary().getID() == 13);
	}

	@Test
	public void testLibraryObjName() {
		String name = "John Smith";
		int id = 1;

		UserImpl user = new UserImpl(name, id);
		user.register(new LibraryImpl());
		assertTrue(user.getLibrary().getName() == "Mock Library Name");
	}

}