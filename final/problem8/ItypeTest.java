// ItypeTest.java
class ItypeTest{
	public static void main(String[] args){
		Itype I;
		Atype A;
		Btype B;
		A = new Atype();
		B = new Btype();
		I = A;
		A = B;
		I.foo();
		A.foo();
		B.bar();
		System.out.println(I);
		System.out.println(A);
		System.out.println(B);
	}
}