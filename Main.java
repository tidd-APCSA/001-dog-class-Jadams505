public class Main 
{
  public static void main(String[] args) 
  {
    // test your code here by creating a three different dogs from the Dog class. Be sure you give each dog different characteristics. 


    /* Declares 3 dogs of different characteristics */

    Dog dog1 = new Dog("Toto", "German Shepard", 40.5, "Brown", true);
    Dog dog2 = new Dog("Fido", "Bulldog", 100.2, "Black", true);
    Dog dog3 = new Dog("Max", "Poodle", 20.75, "White", false);

    /* Prints dog1 and all its characteristics */

    System.out.println(dog1);
    System.out.println(dog1.getBreed());
    System.out.println(dog1.getWeight());
    System.out.println(dog1.getColor());
    System.out.println(dog1.isHouseTrained());
    
    System.out.println();

   /* Prints dog2 and all its characteristics */

    System.out.println(dog2);
    System.out.println(dog2.getBreed());
    System.out.println(dog2.getWeight());
    System.out.println(dog2.getColor());
    System.out.println(dog2.isHouseTrained());
    
    System.out.println();

    /* Prints dog3 and all its characteristics */

    System.out.println(dog3);
    System.out.println(dog3.getBreed());
    System.out.println(dog3.getWeight());
    System.out.println(dog3.getColor());
    System.out.println(dog3.isHouseTrained());

    System.out.println();
    


  }
}