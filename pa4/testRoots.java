import java.util.Scanner;

class testRoots {

	public static void main( String[] args) {
		Scanner s = new Scanner(System.in);
		double resolution = 0.01, tolerance = 0.0000001, threshold = 0.001, z;
		int n = 0;
		int[] e = new int[2]; //end points
		
		System.out.print("Enter the degree: ");
		n = s.nextInt();
		double[] w = new double[n+1];
		
		double[] d = diff(w);
		
		System.out.print("Enter "+(n+1)+" coefficients: ");
		for(int i=0; i<(n+1); i++) {
			d[i] = s.nextDouble();
		}
        
		System.out.print("Enter the left and right endpoints: ");
		for(int p=0; p<2; p++) {
			e[p] = s.nextInt();
		}
			System.out.println("");
		for ( double i=e[0]; i<e[1]; i+=resolution) {
			if (poly(w,i) > 0 && (poly(w,i+resolution)) < 0) {
				double x = findRoot(w,i,i+resolution,tolerance);
				System.out.printf("Root found at %.5f%n", x);
				
			}else if (poly(w,i) < 0 && poly(w,i+resolution) > 0) {
				double x = findRoot(w,i,i+resolution,tolerance);
				System.out.printf("Root found at %.5f%n", x);
				
			}else if (poly(d,i) > 0 && poly(d,i+resolution) < 0) {
				double x = findRoot(d,i,i+resolution,tolerance);
				System.out.printf("Root found at %.5f%n", x);
				
			}else if (poly(d,i) < 0 && poly(d,i+resolution) > 0) {
				double x = findRoot(d,i,i+resolution,tolerance);
				System.out.printf("Root found at %.5f%n", x);
			}
		}
		if ((poly(d,e[0]) >= 0) && (poly(d,e[1]) >= 0)
			 || (poly(d,e[0]) < 0) && (poly(d,e[1]) <0)){
			System.out.println("No roots were found in the specified range.");
			System.exit(0);
		}
	}
	
	static double poly(double[] C, double x) {
		double all = 0;
		double [] temp = new double [C.length];
		for(int i = 0; i<C.length; i++){
			temp[i] = C[i]*Math.pow(x,i);
			all = all + temp[i];
		}
		return all;
	}
	
	static double[] diff(double[] C) {
		double [] temp = new double [C.length];
		for (int i=1; i<=C.length-1; i++) {
			temp[i-1] = C[i]*i;
		}
		temp[temp.length-1] = 0;
		return(temp);
	}
	
	static double findRoot(double[] C,double a, double b, double tolerance) {
		double m = 0.0, k = (b-a);
		while( Math.abs(k) > tolerance) {
			m = (a+b)/2.0;
			if ((poly(C,a))* (poly(C,m)) <= 0) {
				b = m;
				k = b-a;
			}else if ((poly(C,b))*(poly(C,m)) <= 0){
				a = m;
				k = b-a;
			}
		}
		return m;
	}
}