package chapter1;

public class gcdDemo {
	
	public static int gcd(int a, int b) //辗转相除法的实现
	{
		return b==0?a:gcd(b,a%b);
	}
	
	public static void main(String[] args)
	{
		int gcd = gcd(6, 13);
		System.out.println(gcd);
	}
	

}
