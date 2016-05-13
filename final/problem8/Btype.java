// Btype.java
	class Btype extends Atype {
		Btype() {
			System.out.println("constructing a Btype object");
		}

		public void foo() {
			System.out.println("in Btype's foo");
		}

		public void bar() {
			System.out.println("in Btype's bar()");
		}

		public String toString() {
			return "I am a Btype object";
		}
	}