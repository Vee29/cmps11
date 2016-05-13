// Problem 1

class problem1 {
	public static void main( String[] args) {
		int a=5, b=3, c;
		double x=2.2, y=1.3, z;

		c = fcn1(a,b);
		b = fcn2(x,y);
		//z = fcn2(c,b);
		//System.out.println("a="+a+", b="+b+", c="+c);
		System.out.println("x="+x+", y="+y+", z="+z);
		System.out.println("bye!");
	}

	static int fcn1(int i, int j) {
		int k = (i++) + (++j);
		return k+2;
	}

	static int fnc2(double u, double v) {
		return fcn1((int)(u+v), 3);
	}

	static double fcn2(int r, int s) {
		return (double)fcn1(r+s, 3);
	}
}