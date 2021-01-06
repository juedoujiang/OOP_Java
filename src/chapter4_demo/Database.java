package chapter4_demo;

import java.util.ArrayList;

public class Database {
	private ArrayList<CD> CDList = new ArrayList<CD>();
	private ArrayList<DVD> DVDList = new ArrayList<DVD>();
	
	public void add(CD cd) {
		CDList.add(cd);
	}
	
	public void add(DVD dvd) {
		DVDList.add(dvd);
	}

	public void list() {
		for (CD cd : CDList) {
			cd.print();
		}
		for (DVD dvd : DVDList) {
			dvd.print();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Database db = new Database();
		db.add(new CD("String title 1", "String artist 1", 4, 60, "..."));
		db.add(new CD("String title 2", "String artist 2", 4, 60, "..."));
		db.add(new DVD("String title", "String director", 60, "..."));
		db.list();
	}

}
