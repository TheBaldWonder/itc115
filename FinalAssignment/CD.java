public class CD extends LibraryItem {
	// Fields
	private String artist;
	private String recordLabel;
	private String[] trackList;
	
	//Constructor
	public CD(String title, String artist, String recordLabel, String[] trackList) { //trackList must be an array of strings
		super(title);
		this.artist = artist;
		this.recordLabel = recordLabel;
		this.trackList = trackList;
	}

	// Methods
	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getRecordLabel() {
		return recordLabel;
	}

	public void setRecordLabel(String recordLabel) {
		this.recordLabel = recordLabel;
	}

	public String[] getTrackList() {
		return trackList;
	}

	public void setTrackList(String[] trackList) { //setTrackList requires an array of strings to be passed in
		this.trackList = trackList;
	}
	
	@Override
	public String toString() { 
		String stringResult = "Item Number: " + this.getItemNumber() + 
							  " | CD Title: " + this.getTitle() + 
							  " | CD Record Label: " + recordLabel + 
							  "\nCD Track List:\n";
		
		for (int i = 0; i < trackList.length; i++) {
			stringResult += (i + 1) + ". " + trackList[i] + "\n";
		}
		
		return stringResult;
	}
}