public class Dog
{

  /* Instance Variables */
  private final String dogEmoji = "🐶";
  private String name;
  private String breed;
  private double weight;
  private String color;
  private boolean houseTrained;


  /* Dog Contructor */

  public Dog(String name, String breed, double weight, String color, boolean houseTrained)
  {
    this.name = name;
    this.breed = breed;
    this.weight = weight;
    this.color = color;
    this.houseTrained = houseTrained;
  }

  /* Getter Methods */

  public String getName()
  {
    return name;
  }
  public String getBreed()
  {
    return breed;
  }
  public double getWeight()
  {
    return weight;
  }
  public String getColor()
  {
    return color;
  }
  public boolean isHouseTrained()
  {
    return houseTrained;
  }

  /* Prints the Dog's name and a dog emoji */

  public String toString()
  {
    return name + " " + dogEmoji;
  }


}