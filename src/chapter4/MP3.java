package chapter4;

public class MP3 extends Item {
	private String artist;
	private String album;
	public MP3() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MP3(String title, int playtimes, boolean gotIt, String comment,String artist,String album) {
		super(title, playtimes, gotIt, comment);
		// TODO Auto-generated constructor stub
		this.artist = artist;
		this.album = album;
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.print("MP3:");
		super.print();
		System.out.print(artist +"-"+ album);
	}
	
	

}
