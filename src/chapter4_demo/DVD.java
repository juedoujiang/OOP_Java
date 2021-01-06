package chapter4_demo;

public class DVD {
	private String title;
	private String director;
	private int playtimes;
	private boolean gotIt = false;
	private String comment;
	
	public DVD(String title, String director, int playtimes, String comment) {
		super();
		this.title = title;
		this.director = director;
		this.playtimes = playtimes;
		this.comment = comment;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void print() {
		System.out.println("DVD:" + title + "-" + director + "-" + Integer.toString(playtimes) + "-" + comment + "-" + Boolean.toString(gotIt));
	}
}
