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
		double resolution = 0.01, tolerance = 0.0000001, threshold = 0.001;
		double root;
		
		// Enter Degree
		System.out.print("Enter the degree: ");
		int degree = sc.nextInt();
		double[] C = new double[degree+1];
		double[] D = diff(C);

		// Enter Coefficients
		System.out.print("Enter the " + (degree+1) + (" coefficients: "));
		for(int i = 0; i<C.length; i++) {
			D[i] = sc.nextDouble();
		}

		// Enter LR Endpoints
		System.out.print("Enter the left and right endpoints: ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();

		for(double i=a; i<b; i+=resolution) {
			if (poly(C, i) > 0 && (poly(C,i+resolution)) < 0) {
				root = findRoot(C, i, i+resolution, tolerance);
				System.out.println("Root found at: " + (double)Math.round(root*100000d)/100000d);
			}
			else if (poly(C, i) < 0 && (poly(C,i+resolution)) > 0) {
				root = findRoot(C, i, i+resolution, tolerance);
				System.out.println("Root found at: " + (double)Math.round(root*100000d)/100000d);
			}
			else if (poly(D, i) > 0 && (poly(D,i+resolution)) < 0) {
				root = findRoot(D, i, i+resolution, tolerance);
				System.out.println("Root found at: " + (double)Math.round(root*100000d)/100000d);
			}
			else if (poly(D, i) < 0 && (poly(D,i+resolution)) > 0) {
				root = findRoot(D, i, i+resolution, tolerance);
				System.out.println("Root found at: " + (double)Math.round(root*100000d)/100000d);
			}
		}
		if (((poly(D,a) >= 0) && (poly(D,b) >= 0)) || (poly(D,a) < 0) && (poly(D,b) < 0)) {
			System.out.println("No roots were found in the specified range.");
			System.exit(0);
		}
	}

	static double poly(double[] C, double x) {
		double [] D = new double[C.length];
		double sum = 0;
		for(int i=0; i<C.length; i++) {
			D[i] = C[i]*Math.pow(x,i);
			sum = sum + D[i];
		}
		return sum;
	}

	static double[] diff(double[] C) {
		double [] D = new double[C.length];
		for(int i=1; i<C.length-1; i++) {
			D[i-1] = C[i]*i;
		}
		D[D.length-1] = 0;
		return D;
	}

	static double findRoot(double[] C, double a, double b, double tolerance) {
		double w = b-a, mid = 0;
		while(Math.abs(w) > tolerance) {
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
