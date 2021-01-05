package chapter3_homework;

import java.util.ArrayList;

public class City {
	private ArrayList<String> cities = new ArrayList<String>();

	public void add(String s) {
		cities.add(s);
	}
	
	public void add(String s, int location) {
		cities.add(location, s);
	}
	
	public String getCity(int index) {
		return cities.get(index);
	}
	
	public int getSize() {
		return cities.size();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
