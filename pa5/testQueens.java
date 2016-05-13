/* Queens.java
*  Ben Sherriff
*  bsherrif
*  pa5
*  This program will find n Queens solution. 
*/
import java.util.Scanner;
import java.lang.Integer;

class testQueens {
	
	public static void main ( String[] args) {
		Scanner s = new Scanner(System.in);
		int numberR, b,k=0;
		String v = "-v";
		
		for(int i=0; i<args.length; i++){
				s = new Scanner(args[i]);
		}
		if(args.length == 0){
			System.out.println("Usage: Queens[-v] number");
			System.out.println("option: -v verbose output, print all solutions");
			System.exit(0);
		}else if (!v.equals(args[0]) && args.length == 2){
			System.out.println("Usage: Queens[-v] number");
			System.out.println("option: -v verbose output, print all solutions");
			System.exit(0);
		}else if (args.length>=3){
			System.out.println("Usage: Queens[-v] number");
			System.out.println("option: -v verbose output, print all solutions");
			System.exit(0);
		}else if (Integer(args[0]) && args.length == 1 ){
			System.out.println("Usage: Queens[-v] number");
			System.out.println("option: -v verbose output, print all solutions");
			System.exit(0);
		}else if (args.length == 1){		
			int number = Integer.parseInt(args[0]);
			numberR = number;
			//first step of permutation
			int [] a = new int [number+1];
			a[0] = 0;
			for( int i=1; i <= number; i++){
				a[i] = i;
			}
		
			b = factorial(number);
			for(int i=1 ;i<=b;i++){
				nextPermutation(a);
				if (isSolution(a)){
					k++;
				}
			}
			System.out.println(numberR+"-Queens has "+k+" solutions");
		}else if (args.length == 2 && v.equals(args[0])){
			int number = Integer.parseInt(args[1]);
			numberR = number;
			//first step of permutation
			int [] a = new int [number+1];
			a[0] = 0;
			for( int i=1; i <= number; i++){
				a[i] = i;
			}
		
			b = factorial(number);
			for(int i=1 ;i<=b;i++){
				nextPermutation(a);
				if (isSolution(a)){
					printS(a);
					k++;
				}
			}
			System.out.println(numberR+"-Queens has "+k+" solutions");
		}
			
	}// end main
	
	static void nextPermutation(int[] A) {
		int pivot=0, successor=0;
		
		//right most element and compare it to the right.(smaller than)
		for (int i = A.length-2; i >0; i--){
			if (A[i] < A[i+1]) {
				pivot = i;
				break;
			}
		}
		
		if (pivot == 0){
			reverse(A,1,A.length-1);
			return;
		}
		//right most element and compare it to the right.(larger than)
	
		for (int m = A.length-1; m > pivot; m--){
			if (A[m] > A[pivot]){
				successor = m;
				break;
			}
		}
		swap(A,pivot,successor);
		reverse(A,pivot+1,A.length-1);
		return;
	}
	
	static void reverse(int[] A, int i, int j) {
		while(i<j){
			swap(A, i, j);
			i++;
			j--;
		}
	}
	
	static void swap(int[] a, int i, int j){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	static boolean isSolution(int[] A){
		for (int i=2; i< A.length; i++){
			for (int j=1; j<i; j++){
				if ((A[i] - A[j]) == (i-j)){
					return false;
				}else if ((A[j] - A[i]) == (i-j)){
					return false;
				}
			}
		}
		return true;
	}
	
	static void printS(int []A){
		System.out.print("(");
		for (int i=1; i<A.length-1; i++){
			System.out.print(A[i]+", ");
		}
		System.out.print(A[A.length-1]);
		System.out.print(")\n");
	}
	
	static int factorial(int A){
		int all=1;
		for (int i=1;i<=A;i++){
			all *= i;
		}
		return all;
	}
	
	static boolean Integer(String s){
		try {
			Integer.parseInt(s);
		} catch(NumberFormatException e){
			return true;
		}
		return false;
	}
} //end class