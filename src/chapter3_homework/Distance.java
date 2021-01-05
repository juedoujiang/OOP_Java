package chapter3_homework;

import java.util.HashMap;

public class Distance {
	private HashMap<String, HashMap<String, Integer>> allDistances = new HashMap<String, HashMap<String, Integer>>();
	
	public void addCity(String city) {
		allDistances.put(city, new HashMap<String,Integer>());
	}
	
	public void addDistance(String cityA, String cityB, int distance) {
		allDistances.get(cityA).put(cityB, distance);
	}
	
	public int getDistance(String cityA, String cityB) {
		return allDistances.get(cityA).get(cityB);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
