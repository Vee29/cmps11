import java.util.Scanner;
import java.io.*;

class Problem7 {
	public static void main(String[] args) throws FileNotFoundException {
		double avg=0;
		Scanner sc = new Scanner(new File(args[0]));
		double[] A = new double[8];
		for(int i=0; i<A.length; i++) {
			A[i] = sc.nextDouble();
			avg = avg+A[i];
		}
		avg = avg/A.length;
		System.out.println("The average value in file test is "+avg);
	}
}