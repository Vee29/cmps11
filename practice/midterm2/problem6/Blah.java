// Blah.java
class Blah{
	private int foo;
	private double bar;
	Blah(int f, double b){
		foo = f;
		bar = b;
	}
	Blah(int a, int b){
		foo = a+b;
		bar = 0.0;
	}
	int getFoo(){
		return foo;
	}
	void setBar(double x){
		bar = x;
	}
	void mult(){
		bar *= foo;
	}
	public String toString(){
		return "("+foo+", "+bar+")";
	}
	public boolean equals(Object x){
		boolean eq = false;
		Blah B;
		if( x instanceof Blah ){
			B = (Blah)x;
			eq = (foo==B.foo && bar==B.bar);
		}
		return eq;
	}
}