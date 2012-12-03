import java.util.ArrayList;

public class LibraryImpl implements Library {

	private final String name;
	private int maxBooksBorrowed;
	private ArrayList<User> users;

	public LibraryImpl(String name) {
		this.name = name;
		users = new ArrayList<User>(0);
	}

	public String getName() {
		return this.name;
	}

	public void setMaxBooksBorrowed(int max) {
		this.maxBooksBorrowed = max;
	}

	public int getMaxBooksBorrowed() {
		return this.maxBooksBorrowed;
	}

	public int getID(String name) {

		Boolean found = false;
		int retID = 0;

		if (!users.isEmpty()) {
			for (int x = 0; x < users.size(); x++){
				if (users.get(x).getName() == name) {
					found = true;
					//if the user ID is zero we need to assign a new one
					if (users.get(x).getID() == 0) {
						users.get(x).setID(nextUserID());
					}
					retID = users.get(x).getID();
				}
			}
		}

		if (!found) {
			UserImpl user = new UserImpl(name, nextUserID());
			users.add(user);
			retID = user.getID();
		}

		return retID;

	}

	private int nextUserID() {

		int retVal = 0;

		//loop over all users to get the highest ID
		if (!users.isEmpty()) {
			for (int x = 0; x <= users.size(); x++) {
				if (users.get(x).getID() > retVal) {
					retVal = users.get(x).getID();
				}
			}
		}

		//add one to the highest ID and return
		return retVal + 1;
	}
}