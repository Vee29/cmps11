//-----------------------------------------------------------
// Roots.java
// Ben Sherriff
// bsherrif
// pa4
// 
//-----------------------------------------------------------

import java.util.Scanner;

class Roots {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double resolution = 0.01;
		double tolerance = 0.0000001;
		double threshold = 0.001;
		double roots;
		boolean foundRoot = false;
		
		// Enter Degree
		System.out.print("Enter the degree: ");
		int degree = sc.nextInt();

		// Enter Coefficients
		System.out.print("Enter the " + (degree+1) + (" coefficients: "));
		double[] C = new double[degree+1];
		for(int i = 0; i<C.length; i++) {
			C[i] = sc.nextDouble();
		}

		// Enter LR Endpoints
		System.out.print("Enter the left and right endpoints: ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();

		if(poly(C,a)*poly(C,b)<0) {
			roots=findRoot(C,a,b,tolerance);
		}
	}

	static double poly(double[] C, double x) {
		int w = (C.length-1);
		double sum = 0;
		for(int i = 0; i<w; i++) {
			sum +=C[i]*(Math.pow((x-i),w));
		}
		return sum;
	}

	static double[] diff(double[] C) {
		int w = (C.length-1);
		double D[] = new double[C.length-1];
		for(int i=0; i<w; i++) {
			D[i] = C[i]*(w-1);
		}
		return D;
	}

	static double findRoot(double[] C, double a, double b, double tolerance) {
		double w = b-a, mid = 0;
		while(w > tolerance) {
			mid = (a+b)/2;
			if(poly(C, a)*(poly(C,mid)) <= 0) {
				b = mid;
				w = b-a;
			}
			else if((poly(C, b))*(poly(C,mid)) <= 0) {
				a = mid;
				w = b-a;
			}
		}
		return mid;
	}
}
