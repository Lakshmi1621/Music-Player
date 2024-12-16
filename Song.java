package MusicPlayer;

public class Song {
	 private String title;
	    private String artist;
	    private String category; 
	    @Override
		public String toString() {
			return "Song [title=" + title + ", artist=" + artist + ", category=" + category + ", duration=" + duration
					+ "]";
		}
		public Song(String title, String artist, String category, int duration) {
			super();
			this.title = title;
			this.artist = artist;
			this.category = category;
			this.duration = duration;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getArtist() {
			return artist;
		}
		public void setArtist(String artist) {
			this.artist = artist;
		}
		public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
		public int getDuration() {
			return duration;
		}
		public void setDuration(int duration) {
			this.duration = duration;
		}
		private int duration; 

}
