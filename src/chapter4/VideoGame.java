package chapter4;

public class VideoGame extends Item {
	private int numOfPlayers;
	 
	
	public VideoGame() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VideoGame(String title, int playtimes, boolean gotIt, String comment, int number) {
		super(title, playtimes, gotIt, comment);
		this.numOfPlayers = number;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.print("VideoGame:");
		super.print();
		System.out.print(numOfPlayers);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
