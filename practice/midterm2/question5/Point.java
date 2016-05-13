// point.java

class Point {
	// fields
	private int xcoord;
	private int ycoord;

	// constructor
	Point(int x, int y) {
	xcoord = x;
	ycoord = y;
	}

	// methods
	public String toString() {
		return "(" + xcoord + ", " + ycoord + ")";
	}

	void swap() {
		int temp = xcoord;
		xcoord = ycoord;
		ycoord = temp;
	}

	boolean isRightOf(Point P) {
		return (this.xcoord > P.xcoord);
	}

	boolean isAbove(Point P) {
		return (this.ycoord > P.ycoord);
	}
}