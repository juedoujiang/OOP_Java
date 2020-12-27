package chapter1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Fraction a = new Fraction(in.nextInt(),in.nextInt());
		Fraction b = new Fraction(in.nextInt(),in.nextInt());
		a.print();
		b.print();
		a.plus(b).print();
		a.multiply(b).plus(new Fraction(5,6)).print();
		a.print();
		b.print();
		in.close();
	}

}

class Fraction {
	int upper;
	int under;
	
	Fraction(int a, int b)
	{
		this.upper = a;
		this.under = b;
		Appointment();
	}
	
	private static int gcd(int a, int b) //辗转相除法求最大公约数
	{
		return b==0?a:gcd(b,a%b);
	}
	
	void Appointment()
	{
		if (upper == 0 || under ==1) return;
		int gcd = gcd(upper,under);
		this.upper /= gcd;
		this.under /= gcd;
	}
	
	double toDouble(int a, int b)
	{
		return (double)a/b;
	}
	
	Fraction plus(Fraction r)
	{
		return new Fraction(this.upper*r.under + this.under*r.upper, this.under*r.under);
	}
	
	Fraction multiply(Fraction r)
	{
		return new Fraction(this.upper*r.upper,this.under*r.under);
	}
	
	void print()
	{
		if (under == 1 && upper != 0)
		{
			System.out.println(String.valueOf(upper));
		}
		else if (upper == 0)
		{
			System.out.println('0');
		}
		else
		{
			System.out.println(String.valueOf(upper)+'/'+String.valueOf(under));
		}
	}
	
}
