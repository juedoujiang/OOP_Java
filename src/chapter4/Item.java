package chapter4;

public class Item {
	private String title;
	private int playtimes;
	private boolean gotIt = false;
	private String comment;
	
	public Item() {
		
	}

	public Item(String title, int playtimes, boolean gotIt, String comment) {
		super();
		this.title = title;
		this.playtimes = playtimes;
		this.gotIt = gotIt;
		this.comment = comment;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void print() {
		// TODO Auto-generated method stub
		System.out.print(title + "-" + "-" + Integer.toString(playtimes) + "-" + comment + "-" + Boolean.toString(gotIt));
	}

}
