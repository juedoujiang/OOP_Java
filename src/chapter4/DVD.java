package chapter4;

public class DVD extends Item{
	private String director;
	
	public DVD(String title, String director, int playtimes, String comment) {
		super(title, playtimes, false, comment);
		this.director = director;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void print() {
		System.out.print("DVD:");
		super.print();
		System.out.println(director);
	}
}
