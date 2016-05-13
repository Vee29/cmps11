class RationalTest {
	public static void main(String[] args) {
		String str;
		Rational x = new Rational(7,5);
		Rational y = new Rational(12,3);
		Rational z = new Rational(28,20);

		System.out.println(x+"+"+y+" = "+ x.plus(y));
		System.out.println(x +"*"+ y +" = "+ x.times(y) );
 		System.out.println(x +"*("+ y +"+"+ z +") = "+ x.times(y.plus(z)));
 		str = (x.equals(y)?" is equal to ":" is not equal to ");
 		System.out.println(x + str + y);
 		str = (x.equals(z)?" is equal to ":" is not equal to ");
 		System.out.println(x + str + z);
	}
}