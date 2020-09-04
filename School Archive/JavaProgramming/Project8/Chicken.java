public class Chicken extends BarnYardAnimal
{
  private String sound;
  
  public Chicken(String n, String sound)
  {
   super(n);
   this.sound = sound;
  }
  
  public String display() //Polymorphism
  {
   return "The Chicken's " + super.display() + "\nThe Sound it makes is " + sound;
  }
}