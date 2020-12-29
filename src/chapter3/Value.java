package chapter3;

//for-each循环对于对象数组和普通数组的表现不一样
public class Value {
	
	private int i;
	public void set(int i) {this.i=i;}
	public int get() {return i;}
	public String toString() {return ""+i;}
	
	public static void main(String[] args) {
		Value[] a = new Value[10];
		for(int i=0;i<a.length;i++){
			a[i] = new Value();
			a[i].set(i);
		}
		
		for(Value v : a) {
			System.out.println(v.get());
			v.set(0);
		}
		for(Value v : a) {
			System.out.println(v.get());
		}
	}

}
