public class UserImpl implements User {

	private final String name;
	private int id;
	private LibraryImpl library;

	public UserImpl() {
		this.name = "";
		this.id = 0;
		this.library = null;
	}

	public UserImpl(String userName, int userID) {
		this.name = userName;
		this.id = userID;
		//this.library = new LibraryImpl();
	}

	public String getName() {
		return this.name;
	}

	public int getID() {
		return this.id;
	}

	public void setID(int id) {
		this.id = id;
	}

	public int getLibraryID() {
		return this.id;
	}

	public void setLibraryID(int newID) {
		this.id = newID;
	}

	public void register(LibraryImpl lib) {
		this.library = lib;
	}

	public LibraryImpl getLibrary() {
		return this.library;
	}
}