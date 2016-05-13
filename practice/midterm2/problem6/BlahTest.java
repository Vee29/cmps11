// BlahTest.java
class BlahTest{
	public static void main(String[] args){
		Blah A = new Blah(15, 3.0);
		Blah B = new Blah(7, 8);
		System.out.println(A);
		System.out.println(B);
		A.mult();
		//System.out.println(A);
		B.setBar(45.0);
		//System.out.println(B);
		System.out.println(A.equals(B));
	}
}