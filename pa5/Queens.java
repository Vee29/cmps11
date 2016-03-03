// -----------------------------------------
// Queens.java
// Ben Sherriff
// bsherrif
// Find n Queens solution
// -----------------------------------------

import java.util.Scanner;
import java.lang.Integer;

class Queens {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, b, k=0;
		String v = "-v";

		for(int i = 0; i < args.length; i++)
			sc = new Scanner(args[i]);

		if (args.length== 0)
			printUsage();
		else if (!v.equals(args[0]) && args.length == 2)
			printUsage();
		else if (args.length >= 3)
			printUsage();
		else if (Integer(args[0]) && args.length == 1)
			printUsage();

		else if (args.length == 1){		
			int number = Integer.parseInt(args[0]);
			n = number;
			//first step of permutation
			int [] A = new int [number+1];
			A[0] = 0;
			for( int i=1; i <= number; i++){
				A[i] = i;
			}
		
			b = factorial(number);
			for(int i=1 ;i<=b;i++){
				nextPermutation(A);
				if (isSolution(A)){
					k++;
				}
			}
			System.out.println(n+"-Queens has "+k+" solutions");
		}else if (args.length == 2 && v.equals(args[0])){
			int number = Integer.parseInt(args[1]);
			n = number;
			//first step of permutation
			int [] A = new int [number+1];
			A[0] = 0;
			for( int i=1; i <= number; i++){
				A[i] = i;
			}
		
			b = factorial(number);
			for(int i=1 ;i<=b;i++){
				nextPermutation(A);
				if (isSolution(A)){
					printSolution(A);
					k++;
				}
			}
			System.out.println(n+"-Queens has "+k+" solutions");
		}
	}

	static void nextPermutation(int[] A) {
		int pivot = 0, successor = 0;
		
		// Scan array right to left
		for(int i = A.length-2; i > 0; i--) {
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
		for(int i = A.length-1; i > pivot; i--) {
			if (A[i] > A[pivot]) {
				successor = i;
				break;
			}
		}
		swap(A,pivot,successor); // Swap pivot and successor
		reverse(A,pivot+1,A.length-1); // Reverse array to the right of pivot
		return;
	}

	static boolean isSolution(int[] A){
		for (int i = 2; i < A.length; i++){
			for (int j = 1; j < i; j++){
				if ((A[i] - A[j]) == (i-j)){
					return false;
				}else if ((A[j] - A[i]) == (i-j)){
					return false;
				}
			}
		}
		return true;
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
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}

	// Calculate the factorial
	static int factorial(int A) {
		int factorial = 1;
		for(int i = 1; i <= A; i++)
			factorial *= i;
		return factorial;
	}

	static void printUsage() {
		System.out.println("Usage: java Queens [-v] number");
		System.out.println("Option: -v verbose output, print all solutions");
		System.exit(0);
	}

	static void printSolution(int [] A) {
		System.out.print("(");
		for (int i=1; i<A.length-1; i++)
			System.out.print(A[i]+", ");
		System.out.print(A[A.length-1]);
		System.out.print(")\n");
	}

	static boolean Integer(String s) {
		try {
			Integer.parseInt(s);
		} catch (NumberFormatException e) {
			return true;
		}
		return false;
	}
}
