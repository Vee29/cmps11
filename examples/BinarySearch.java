// BinarySearch.java
// Use bisection search to find a selected value in an ordered array

class BinarySearch {
	public static void main (String[] args) {
		int[] data = {100,110, 120, 130, 140, 150};
		int index = binarySearch(data, 120);
		System.out.println(index);
	}

	// find the index of element v in array keys
	// return -1 if it is not found
	static int binarySearch(int[] keys, int v) {
		int position;
		int begin = 0, end = keys.length -1;
		while (begin <= end) {
			position = (begin + end)/2;
			if (keys[position] == v) return position;
			else if (keys[position] < v)
				begin = position+1;
			else
				end = position-1;
		}
		return -1;
	}
}