package chapter2;

public class Display {
	private int value = 0;
	private int limit = 0;
	private static int step = 1; //只属于类的变量，不属于任何对象
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
	
	public static void main(String[] args) {
		Display d = new Display(24);
		Display.step = 2;
		System.out.println(Display.step);
		for(;;) {
			d.increase();
			System.out.println(d.getValue());
		}
	}

}
