package chapter3_homework;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//用City对象记录城市名
		City cities = new City();
		String city = in.next();
		while(!city.equals("###")) {
			cities.add(city);
			city = in.next();
		}
		
		//用Distance对象记录里程数及对应的两个城市
		int distance = in.nextInt();
		int num = cities.getSize();
		Distance allDistances = new Distance();
		for (int i=0;i<num;i++) {
			String cityA = cities.getCity(i);
			allDistances.addCity(cityA);
			for (int j=0;j<num;j++) {
				String cityB = cities.getCity(j);
				allDistances.addDistance(cityA, cityB, distance);
				if (in.hasNextInt()){
					distance = in.nextInt();
				}else {
					break;
				}
			}
		}
		
		//读取城市，输出里程数
		String city1 = in.next();
		String city2 = in.next();
		System.out.println(allDistances.getDistance(city1, city2));
		
		in.close();
	}

}
