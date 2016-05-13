class factorial {

   public static void main( String[] args ){
      int n = 5;
      //System.out.println(fact1(n));
      System.out.println(fact2(n));
      //System.out.println(fact3(n));
   }

   static int fact1(int n){
      int product = 1, i = 1;
      while(i<=n){
         product *= i;
         i++;
      }
      return product;
   }

   static int fact2(int n){
      if(n>0){
         return n*fact2(n-1);
      }else{
         return 1;
      }
   }

   static int fact3(int n){
      if(n==0){  // what's wrong with this test?
         return 1;
      } else {
         return n*fact3(n-1);
      }
   }

}