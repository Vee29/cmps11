//-----------------------------------------------------------------------------
// PersonTest.java
// Uses the Person class
//-----------------------------------------------------------------------------

class PersonTest{

   public static void main(String[] args){
      Person a;
      Person b;

      a = new Person();
      b = new Person();

      // initialize a
      a.name = "Dick";
      a.phoneNumber = "123-456-7890";
      a.age = 6;
      a.weight = 50.0;

      // initialize b
      b.name = "Jane";
      b.phoneNumber = "123-456-7890";
      b.age = 5;
      b.weight = 40.0;

      // print out stats
      System.out.println();
      printPerson(a);          // notice how printPerson() is called
      System.out.println();
      printPerson(b);          // notice how printPerson() is called
      System.out.println();
   }

   static void printPerson(Person x){
      System.out.println("Name: " + x.name);
      System.out.println("Phone Number: " + x.phoneNumber);
      System.out.println("Age: " + x.age);
      System.out.println("Weight: " + x.weight);
   }
}
