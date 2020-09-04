public class Pig extends BarnYardAnimal
{
  private String sound;
  
  public Pig(String n, String sound)
  {
   super(n);
   this.sound = sound;
  }
  
  public String display() //Polymorphism
  {
   return "The Pig's " + super.display() + "\nThe Sound it makes is " + sound; 
  }
}