public class UseLibraryItem {

	public static void main(String[] args) {
		//create new Book
		Book book1 = new Book("The DaVinci Code", "Dan Brown", "Transworld & Bantam Books");
		
		//test LibraryItem methods
		book1.reserve("Jonathan Heilman", 385715);
		book1.checkOut("Jonathan Heilman", 385715);
		book1.checkIn();
		book1.payFines("Jonathan Heilman", 385715);
		System.out.println(); //create an empty line in the console
		
		//test Book methods
		System.out.println("Complete Book Info:\n" + book1.toString() + "\n");
		System.out.println("Item Number:    " + book1.getItemNumber());
		System.out.println("Book Title:     " + book1.getTitle());
		System.out.println("Book Author:    " + book1.getAuthor());
		System.out.println("Book Publisher: " + book1.getPublisher());
		System.out.println(); //create an empty line in the console
		
		//create new Magazine
		Magazine magazine1 = new Magazine("Muscle and Fitness", "Train Like Thor!", "December 2019");
		
		//test Magazine methods
		System.out.println("Complete Magazine Info:\n" + magazine1.toString() + "\n");
		System.out.println("Item Number:          " + magazine1.getItemNumber());
		System.out.println("Magazine Title:       " + magazine1.getTitle());
		System.out.println("Magazine Cover Story: " + magazine1.getCoverStory());
		System.out.println("Magazine Issue Date:  " + magazine1.getIssueDate());
		System.out.println(); //create an empty line in the console
		
		//create new DVD
		DVD dvd1 = new DVD("Joker", "Todd Phillips", "Crime, Drama, Thriller", 122);
		
		//test DVD methods
		System.out.println("Complete DVD Info:\n" + dvd1.toString() + "\n");
		System.out.println("Item Number:  " + dvd1.getItemNumber());
		System.out.println("DVD Title:    " + dvd1.getTitle());
		System.out.println("DVD Director: " + dvd1.getDirector());
		System.out.println("DVD Duration: " + dvd1.getDuration());
		System.out.println(); //create an empty line in the console
		
		//create new CD
		//first create an array for the track list
		String [] trackList = { "The Outsiders",
					"Valey of Tomorrow",
					"Through Smoke",
					"Lay 'Em Down",
					"What Youve Done to Me",
					"Hurricane",
					"These Hard Times",
					"Stones Under Rushing Water",
					"Prisoner",
					"Wont Turn Back", 
					"Girl Named Tennessee",
					"Something Beautiful",
					"Garden",
					"Let Us Love"};
		
		//then initiate new CD object
		CD cd1 = new CD("The Outsiders", "Needtobreathe", "Atlantic Records", trackList);
		
		//test CD toString method
		System.out.println("Complete CD Info:\n" + cd1.toString() + "\n");
	}
}