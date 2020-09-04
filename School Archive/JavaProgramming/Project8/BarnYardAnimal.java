public class BarnYardAnimal
{
  private String name;
  
  public BarnYardAnimal()
  {
   name = ""; 
  }
  
  public BarnYardAnimal(String n)
  {
    name = n;
  }
    
  public String display()
  {
   return "name is " + name;
  }
}