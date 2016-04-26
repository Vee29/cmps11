//-----------------------------------------------------------
// GCD.java
// pa3
// Finds the GCD of two numbers
//-----------------------------------------------------------
import java.util.Scanner;

class GCD {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.print("Enter a positive integer: ");
		while(true){
			if(sc.hasNextInt()) {
				a = sc.nextInt();
				if(a>0) break;
			} else sc.next();
			System.out.print("Enter a positive integer: ");
		}
		System.out.print("Enter another positive integer: ");
		while(true){
			if(sc.hasNextInt()) {
				b = sc.nextInt();
				if(b>0) break;
			} else sc.next();
			System.out.print("Enter another positive integer: ");
		}

		System.out.println("The GCD of " +a+ " and " +b+ " is " + gcd(a,b));
	}
	public static int gcd(int a, int b) {
		int temp = 0;
		if(a<b) {
			temp = a;
			a = b;
			b = temp;
		}
		while(true) {
			temp = a%b;
			a = b;
			b = temp;
			if(temp==0) break;
			else continue;
		}
		return a;
	}
}
