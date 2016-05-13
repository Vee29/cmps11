// problem2

class problem2 {
	public static void main (String[] args) {
		System.out.println(foo(Integer.parseInt(args[0])+2));
	}

	static int foo(int n) {
		System.out.println("in foo, n = " + n);
		if (n <= 1)
			return 5;
		else
			return foo(n-1) + 8;
	}
}