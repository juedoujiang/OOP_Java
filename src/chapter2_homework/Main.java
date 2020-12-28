package chapter2_homework;

public class Main {

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		Clock clock = new Clock(in.nextInt(), in.nextInt(), in.nextInt());
		clock.tick();
		System.out.println(clock);
		in.close();

	}

}

class Display {
	private int value = 0;
	private int limit = 0;
	public Display(int limit) {
		this.limit = limit;
	}
	
	public boolean increase() {
		this.value++;
		if(value==limit){
			this.value = 0;
			return true;
		} else {
			return false;
		}
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public static void main(String[] args) {
		Display d = new Display(24);
		for(;;) {
			d.increase();
			System.out.println(d.getValue());
		}
	}
}

class Clock {
	private Display hour = new Display(24);
	private Display minute = new Display(60);
	private Display second = new Display(60);
	
	public Clock(int hour, int minute, int second){
		this.hour.setValue(hour);
		this.minute.setValue(minute);
		this.second.setValue(second);
	}
	
	public String toString() {
		return String.format("%02d:%02d:%02d", hour.getValue(),minute.getValue(),second.getValue());
	}
	
	public void tick() {
		if (second.increase()) {
			if(minute.increase()){
				hour.increase();
			}
		}
	}
}

