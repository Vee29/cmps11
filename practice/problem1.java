// Problem1.java
import java.util.Scanner;
class Problem1{
 public static void main( String[] args ){
 Scanner sc = new Scanner(System.in);
 int i, x, y, a, c=0, s=0;
 i = sc.nextInt();
 x = y = i;
 while( i!=0 ){
 if( i<x ) x = i;
 if( i>y ) y = i;
 s += i;
 c++;
 i = sc.nextInt();
 }
 a = s/c;
 System.out.println(x);
 System.out.println(y);
 System.out.println(a);
 }
}
