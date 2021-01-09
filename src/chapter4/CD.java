package chapter4;

public class CD extends Item{
	private String artist;
	private int numofTracks;

	public CD(String title, String artist, int numofTracks, int playtimes, String comment) {
		super(title, playtimes, false, comment);
		this.artist = artist;
		this.numofTracks = numofTracks;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void print() {
		System.out.print("CD:");
		super.print();
		System.out.println(artist+Integer.toString(numofTracks));
	}

}
