public interface Library {

	/**
	*returns a string with the name of the Library
	*/
	public String getName();

	/**
	*sets the maximum number of books a user can borrow
	*/
	public void setMaxBooksBorrowed(int max);

	/**
	*gets the maximum number of books a user can borrow
	*/
	public int getMaxBooksBorrowed();

	/**
	*gets the ID of a user who macthes the name passed in
	*/
	public int getID(String name);

}