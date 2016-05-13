// EchoWords.java

import java.util.Scanner;

class EchoWords{

   public static void main( String[] args ){
      
      Scanner sc = new Scanner(System.in);
      String line, word;
      
      word = sc.next();
      System.out.println( word );
      word = sc.next();
      System.out.println( word );
      line = sc.nextLine();
      System.out.println( line );
      
   }
}
