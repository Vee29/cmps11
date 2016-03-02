// -----------------------------------------
// Queens.java
// Ben Sherriff
// bsherrif
// Find n Queens solution
// -----------------------------------------

import java.util.Scanner;

class Queens {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();


		int[] A = new int[n];
		for (int i = 0; i < A.length; i++) {
			
		}
		if(isSolution(A[i]) == false) {
			nextPermutation(A[i]);
		} else
			for(int i = 0; i <= A.length; i++) {
				System.out.println(A[i]);
			}
	}

	static void nextPermutation(int[] A) {
		int pivot, int successor;
		
		// Scan array right to left
		for(int i = A.length; i > 0; i--) {
			if (A[i] < A[i+1]) {
				pivot = i;
				break;
			}
		}
		// If end is reached without pivot
		if (pivot == 0) {
			reverse(A, 1, A.length-1);
			return;
		}
		// Scan the array from right to left again
		for(int i = A.length; i > 0; i--) {
			if (A[i] > pivot) {
				successor = i;
				break;
			}
		}
		swap(A,pivot,successor); // Swap pivot and successor
		reverse(A,pivot,A.length-1); // Reverse array to the right of pivot
		return;
	}

	static boolean isSolution(int[] A) {
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				if ((A[i]-A[j]) == (i-j))
					return false;
				if ((A[j]-A[i]) == (i-j))
					return false;
			}
		}
	}

	// Reverse the direction of the permutation
	static void reverse(int[] A, int i, int j) {
		while (i<j) {
			swap(A,i,j);
			i++;
			j--;
		}
	}

	// Swap the values
	static void swap(int[] A, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	// Calculate the factorial
	static int factorial(int n) {
		for(int i = 1; i <= n; i++)
			factorial *= i;
		return factorial;
	}

	static void printUsage {
		System.out.println("Usage: java Queens [-v] number");
		System.out.println("Option: -v verbose output, print all solutions");
		System.exit(0);
	}
}
