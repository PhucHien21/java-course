package homework5;

public class Music implements Comparable<Music>{
	
	//Variables
	private String title;
	private String artist;
	private double duration;
	private double rating;
	
	//Constructors
	public Music(String title, String artist, double duration, double rating) {
		this.title = title;
		this.artist = artist;
		this.duration = duration;
		this.rating = rating;
	}

	//Getters and Setters
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

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	//Other methods
	@Override
	public String toString() {
		return "Music title: " + title + ", artist: " + artist + 
				", duration: " + duration + ", rating: " + rating;
	}
	
	public int compareTo(Music music) {
		return title.compareToIgnoreCase(music.title);
	}
	
}
