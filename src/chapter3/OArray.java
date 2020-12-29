package chapter3;

public class OArray {
	// 每个字符串为一个对象，故String[]为对象数组

	public static void main(String[] args) {
		int[] ia = new int[10];
		String[] a = new String[10];
		for (int i = 0;i<a.length;i++)
		{
			a[i] = ""+i;
		}
		System.out.println(ia[0]+2);
		System.out.println(a[2].length());
		System.out.println(a[2]);
//		String s = null;
	}

}
