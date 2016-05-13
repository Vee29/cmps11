import java.util.Scanner;
import java.io.*;

class Problem3 {
	public static void main(String[] args) throws FileNotFoundException{
		Scanner sc = new Scanner(new File(args[0]));
		String str = sc.next();
		int n;

		while(sc.hasNextInt()) {
			n = sc.nextInt();
			if (str.equals("zero") && n%3==0)
				System.out.print(n + " ");
			else if (str.equals("one") && n%3==1)
				System.out.print(n + " ");
			else if (str.equals("two") && n%3==2)
				System.out.print(n + " ");
			else continue;
		}
		System.out.println("end of " + str + "s");
	}
}