package MusicPlayer;

public enum Category {
	HINDI("Hindi"),
    ENGLISH("English"),
    TELUGU("Telugu");

    private String category;

	private Category(String category) {
		this.category = category;
	}

	public String getCategory() {
		return category;
	}
    
}
