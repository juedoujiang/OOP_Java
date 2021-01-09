package chapter4;

import java.util.ArrayList;

public class Database {
	private ArrayList<Item> ItemList = new ArrayList<Item>();
	
	public void add(Item item) {
		ItemList.add(item);
	}

	public void list() {
		for (Item item : ItemList) {
			item.print();
//			System.out.println();
		}
	}

	public static 
	void main(String[] args) {

		Database db = new Database();
		db.add(new CD("String title 1", "String artist 1", 4, 60, "..."));
		db.add(new CD("String title 2", "String artist 2", 4, 60, "..."));
		db.add(new DVD("String title", "String director", 60, "..."));
		db.add(new VideoGame("String title", 60, false, "...", 60));
		db.list();
	}

}
