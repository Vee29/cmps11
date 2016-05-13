import java.util.Scanner;
import java.io.*;

class Problem1 {
	public static void main (String[] args) {
		int a=5, b=6, c=1;
		double x=0.5, y=1.0, z=1.5;

		c = fcn1(a, b);
		y = fcn2(y, a);
		b = fcn3(x, y);
		z = fcn3(c, b);
		System.out.println("a="+a+", b="+b+", c="+c);
		System.out.println("x="+x+", y="+y+", z="+z);
	}

	static int fcn1(int i, int j) {
		int k = i-j;
		return (++k);
	}

	static double fcn2(double t, int n) {
		return (t*n);
	}

	static int fcn3(double u, double v) {
		return fcn1((int)(u*v), 2);
	}

	static double fcn3(int r, int s) {
		return fcn2(r,s);
	}
}