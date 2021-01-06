package chapter4_demo;

public class CD {
	private String title;
	private String artist;
	private int numofTracks;
	private int playtimes;
	private boolean gotIt = false;
	private String comment;

	public CD(String title, String artist, int numofTracks, int playtimes, String comment) {
//		super();
		this.title = title;
		this.artist = artist;
		this.numofTracks = numofTracks;
		this.playtimes = playtimes;
		this.comment = comment;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void print() {
		System.out.println("CD:" + title + "-" + artist + "-" + Integer.toString(numofTracks) + "-" + Integer.toString(playtimes) + "-" + comment + "-" + Boolean.toString(gotIt));
	}

}
