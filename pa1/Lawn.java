//-----------------------------------------------------------
// Lawn.java
// Ben Sherriff
// bsherrif
// pa1
// Calculates the mowing time
//-----------------------------------------------------------
import java.util.Scanner;
class Lawn {
	public static void main (String[] args) {
		double lotWidth, lotLength, houseWidth, houseLength, mow, sec, lawnArea;
		int h, m, s; //Time variables
		Scanner sc = new Scanner(System.in);
        //Enter Lot Info
        System.out.print("Enter the length and width of the lot, in feet: ");
        lotLength = sc.nextDouble();
        lotWidth = sc.nextDouble();
        //Enter House Info
        System.out.print("Enter the length and width of the house, in feet: ");
        houseLength = sc.nextDouble();
        houseWidth = sc.nextDouble();
        //Print Area
        lawnArea = (lotLength*lotWidth)-(houseWidth*houseLength);
        System.out.println("The lawn are is " + lawnArea + " square feet.");
        //Enter Mowing Rate
        System.out.print("Enter the mowing rate, in square feet per second: ");
        mow = sc.nextDouble();
        //Calculate Mowing Time
        sec = lawnArea/mow;
        s = (int) Math.round(sec);
        m = s/60;
        s = s%60;  // same as s %= 60
        h = m/60;
        m = m%60;  // same as m %= 60
        //Print Mowing Time
        System.out.println("The mowing time is " + h + " hour" + (h==1?" ":"s ") + m + " minute" + (m==1?" ":"s ") + s + " second" + (s==1?".":"s."));
    }
}
