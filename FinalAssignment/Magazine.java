public class Magazine extends LibraryItem {
	// Fields
	private String coverStory;
	private String issueDate;
	
	//Constructor
	public Magazine(String title, String coverStory, String issueDate) {
		super(title);
		this.coverStory = coverStory;
		this.issueDate = issueDate;
	}
	
	// Methods
	public String getCoverStory() {
		return coverStory;
	}

	public void setCoverStory(String coverStory) {
		this.coverStory = coverStory;
	}

	public String getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
	
	@Override
	public String toString() { 
		return "Item Number: " + this.getItemNumber() + " | Magazine Title: " + this.getTitle() + " | Magazine Cover Story: " + coverStory + " | Magazine Issue Date: " + issueDate;
	}
	
}