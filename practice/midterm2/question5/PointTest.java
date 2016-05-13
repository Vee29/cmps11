// pointTest.java

class PointTest {
	public static void main (String[] args) {
		Point A = new Point(2,5);
		Point B = new Point(1,-3);
		Point C = new Point(7,3);
		Point D = new Point(8,4);
		String str1, str2;
		A.swap();
		D.swap();
		System.out.println("A = " + A);
		System.out.println("B = " + B);
		System.out.println("C = " + C);
		System.out.println("D = " + D);
		str1 = A.isRightOf(B)?"right":"left";
		str2 = C.isAbove(D)?"above":"below";
		System.out.println("A is to the " + str1 + " of B");
		System.out.println("C is " + str2 + " D");
	}
}