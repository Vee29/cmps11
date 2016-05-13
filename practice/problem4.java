class Problem4{
	public static void main( String[] args ){
		int a=2, b=5, c;
		double x=2.5, y=3.5, z;
		c = f(a, b);
		z = g(x, c);
		a = h(y, z, x);
		x = f( (int)z, b);
		System.out.println(a + " " + b + " " + c );
		System.out.println(x + " " + y + " " + z );
	}
	static int f(int n, int m){
		int k = n + m;
		k *= 2;
		return k;
	}
	static double g(double s, int n){
		return n*s;
	}
	static int h(double r, double s, double t){
		int m = (int)(r + s + t);
		return f(m, 1);
	}
}