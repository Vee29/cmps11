//-----------------------------------------------------------------------------
// ArrayEx4.java
// Illustrates right and wrong ways to copy an array
//-----------------------------------------------------------------------------

class ArrayEx4{

   public static void main( String[] args ){
      int[] A = {5, 6, 7, 8};
      int[] B, C, D, E;

      B = A;  // Wrong way!
              // This just copies the reference, making A and B point to the
              // the very same array object.  Any change to B[i] will also 
              // change the original A[i]
      B[1] = 60;  
      printArray(A);  // A is now: 5 60 7 8
      printArray(B);

      // Here's the right way
      C = new int[A.length];          // first allocate space for the copy
      for(int i=0; i<A.length; i++){  // then copy elements one by one
         C[i] = A[i];
      }
      C[3] = 80;  // Now changing the copy does not change the original
      printArray(A);
      printArray(C);

      // If you need to copy many arrays, it's a good idea to write a function
      // to do it.  See below.
      D = copyArray(A);
      printArray(A);
      printArray(D);
      D[2] = 70;  // Again, changing the copy does not change the original
      printArray(A);
      printArray(D);
      
      // Actually java has a built in function to do this
      E = new int[A.length];  // you have to allocate before the function call though
      System.arraycopy(A, 0, E, 0, A.length);
      printArray(A);
      printArray(E);

      // Exercise:  
      // Write a function that behaves exactly like System.arraycopy().  
      // See the documentation at:
      // http://docs.oracle.com/javase/7/docs/api/java/lang/System.html#arraycopy(java.lang.Object, int, java.lang.Object, int, int)

   }

   // printArray()
   // prints the contents of an int array to stdout
   static void printArray(int[] A){
      System.out.print("( ");
      for(int i=0; i<A.length; i++)
         System.out.print(A[i]+" ");
      System.out.println(")");
   }

   // copyArray()
   // returns a new array object that is a copy of the input array
   static int[] copyArray(int[] X){
      int[] Y = new int[X.length];    // allocate space for new array
      for(int i=0; i<X.length; i++){  // copy elements one by one
         Y[i] = X[i];
      }
      return Y;   // return a reference to the new array object
   }

}