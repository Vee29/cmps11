//-----------------------------------------------------------------------------
// Primes.java - determine primes less than n using the Sieve of Eratosthenes
// from p. 135 of the text
//-----------------------------------------------------------------------------

class Primes {
   public static void main(String[] args) {
      int n = 10000000, i, j;
      boolean[] isPrime = new boolean[n+1];
      
      // initialize isPrime[]
      isPrime[0] = isPrime[1] = false;
      for(i=2; i < n; i++) 
         isPrime[i] = true;

      // cross out multiples of j, for j<sqrt(n)
      for(j=2; j<Math.sqrt(n); j++)
         if (isPrime[j]) 
            crossOut(isPrime, j);
      
      // print out primes
      System.out.println("The primes less than or equal to " + n + " are:");
      for (i=2; i<=n; i++) //print primes
         if (isPrime[i]) 
            System.out.print(i + " ");
   }

   // crossOut()
   // set all multiples of k greater than or equal to k*k to false
   public static void crossOut(boolean[] B, int k){
      for(int i=k*k; i<B.length; i+=k)
         B[i] = false;
   }
}