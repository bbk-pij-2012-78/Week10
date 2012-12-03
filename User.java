public interface User {

	/**
	*returns a string with the name of the user
	*/
	public String getName();

	/**
	*returns a int with the ID of the users library
	*/
	public int getLibraryID();

	/**
	*sets the ID of the users library
	*/
	public void setLibraryID(int newID);

	/**
	*gets the users ID
	*/
	public int getID();

	/**
	*sets the users ID
	*/
	public void setID(int id);

}