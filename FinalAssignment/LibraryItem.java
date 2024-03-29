//*******************************************************************
// Include an abstract superclass for the common information a library might have for each item.
// Add additional instance variables or methods as needed to model the characteristics of each class.
// In addition, each class should implement a printable interface that provides a standardized way
// to print a summary of the items data.
// By: Jonathan Heilman	
// Date: 12/09/2019
//*******************************************************************

public abstract class LibraryItem {
	// Fields
	private static int itemCount = 1000; //constructor will increment this static field with each new LibraryItem instantiation
	private int itemNumber; //this will store a unique number each time a LibraryItem is instantiated
	private String title;
		
	//Constructor
	public LibraryItem(String title) {
		itemCount++; //will increment the static variable with each instantiation of this class
		this.itemNumber = itemCount; //set a unique number from the static variable of this class
		this.title = title;
	}
		
	// Methods

	//itemNumber getter
	public int getItemNumber() { 
		return this.itemNumber;
	}
	
	//title setter
	public void setTitle(String title) { 
		this.title = title; 
	}
	
	//title getter
	public String getTitle() { 
		return this.title;
	}
	
	//reserve an item
	public void reserve(String name, int libraryId) { 
		System.out.println(name + " (Library ID: " +  libraryId + ") has reserved " + title + " (Item Number: " + itemNumber + ").");
	}
	
	//check an item in
	public void checkIn() {
		System.out.println(title + " (Item Number: " + itemNumber + ") has been checked back in.");
	}
	
	//check an item out
	public void checkOut(String name, int libraryId) {
		System.out.println(title + " (Item Number: " + itemNumber + ") has been checked out to " + name + " (Library ID: " +  libraryId + ").");
	}
	
	public void payFines(String name, int libraryId) {
		System.out.println(name + " (Library ID: " +  libraryId + ") has paid their late fees and has permission to check out items again.");
	}
	
	@Override 
	public String toString() { //print string representation of this object
		return "Item Number: " + itemNumber + " | Item Title: " + title;
	}
}