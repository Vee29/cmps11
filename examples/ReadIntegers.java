//-----------------------------------------------------------------------------
//  ReadIntegers.java
//
//  Opens the file specified on the command line, then picks out any positive 
//  integers in that file and prints them to stdout.  Ignores non-positive
//  integers, double values and non-numeric strings.  Try this out on any text 
//  file containing some tokens interpretable as positive integers, and some
//  tokens not interpretable as positive integers.
//
//-----------------------------------------------------------------------------

import java.util.Scanner;
import java.io.*;

class ReadIntegers{

   public static void main( String[] args ){

      Scanner sc=null;
      int n;

      // check for correct number of command line arguments
      if(args.length!=1){
         Usage();
      }

      // attempt to open file args[0]
      try{
         sc = new Scanner(new File(args[0])); // possibly throw FileNotFoundException
      }catch(FileNotFoundException e){
         System.err.println(e.getMessage());
         Usage();
      }

      // Read from the file given on the command line.  Copy any positive integers
      // to standard out, and skip over any other strings that cannot be interpreted 
      // as integers.
      while(sc.hasNext()){              // while there is another token
         if(sc.hasNextInt()){           //    if that token is an integer
            n = sc.nextInt();           //       read it and assign it to n
            if(n>0)                     //       if it is positive
               System.out.println(n);   //          print it
         }else{                         //    otherwise the token is not an integer so
            sc.next();                  //       discard it
         }
      }

      sc.close();
   }

   // Usage()
   // prints usage message then quits
   static void Usage(){
      System.err.println("Usage: java ReadIntegers <input file>");
      System.exit(1);
   }

}
