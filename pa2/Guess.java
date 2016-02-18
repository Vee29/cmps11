import java.util.*;

class Guess {
public static void main (String args[]) {
Random r = new Random();
int num = r.nextInt(11-1) + 1;
int input;
Scanner sc = new Scanner(System.in);
//System.out.println(num);
System.out.println("I'm thinking of an integer in the range 1 to 10. You have three guesses.\n");
//First Guess
System.out.print("Enter your first guess: ");
input = sc.nextInt();
if(num == input) {
System.out.println("you win!\n");
System.exit(0);
}
else if(input > num) System.out.println("Your guess is too high.\n");
else if(input < num) System.out.println("Your guess is too low.\n");
//Second Guess
System.out.print("Enter your second guess: ");
input = sc.nextInt();
if(num == input) {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
System.out.println("you win!\n");
System.exit(0);
}
else if(input > num) System.out.println("Your guess is too high.\n");
else if(input < num) System.out.println("Your guess is too low.\n");
//Third Guess
System.out.print("Enter your third guess: ");
input = sc.nextInt();
if(num == input) {
System.out.println("you win!\n");
System.exit(0);
}
else if(input > num) System.out.println("Your guess is too high.\n");
else if(input < num) System.out.println("Your guess is too low.\n");
if(input != num) System.out.println("You lose the number was " + num + ".\n");
}
}
