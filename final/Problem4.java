import java.util.Scanner;
import java.io.*;

class Problem4{
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File(args[0]));
		String[] Z = new String[10];
		int[] A = {2, 1, 9, 8, 7, 6, 4, 5, 3, 0};
		for(int i=0; i<10; i++) Z[i] = sc.next();
			Mix(Z, A);
		Print(Z);
	}

	static void Mix(String[] S, int[] I){
		int j, n = S.length;
		String[] temp = new String[n];
		for(j=0; j<n; j++) temp[j] = S[I[j]];
			for(j=0; j<n; j++) S[j] = temp[j];
		}
	
	static void Print(String[] S){
		for(int j=0; j<S.length; j++) System.out.println(S[j]);
	}
}