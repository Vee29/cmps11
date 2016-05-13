import java.util.Scanner;
class problem2 {
	public static void main (String args[]) {
	double x,y;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a double value: ");
	x = sc.nextDouble();
	System.out.print("Enter another double value: ");
	y = sc.nextDouble();
	double a = Math.sqrt(x)+Math.sqrt(y);
	System.out.println(a);
	}
}