import java.util.*;

public class BarnYardAnimalTester
{
  
  public static void main(String[] args)
  {
    String answer = "";    
    
    Scanner in = new Scanner(System.in);
    
    System.out.print("Would you like to enter some data?");
    answer = decisionValidation(answer);
    
    while(answer.equals("Y"))
    {
           
      System.out.print("Please enter an animal name: ");
      BarnYardAnimal animalOne = new BarnYardAnimal(in.next());

      
      System.out.print("Please enter a chicken name, and the sound it makes: ");
      Chicken animalTwo = new Chicken(in.next(), in.next());

      
      System.out.print("Please enter a pig name, and the sound it makes: ");
      Pig animalThree = new Pig(in.next(), in.next());

      
      System.out.println(animalOne.display() + "\n");
      System.out.println(animalTwo.display() + "\n");
      System.out.println(animalThree.display() + "\n"); 
           
      
      System.out.print("Would you like to enter more data?");
      answer = in.next();
    }      
    System.out.println("Have a nice day!");
  }
  
  private static String decisionValidation(String input)
  {
    Scanner console = new Scanner(System.in);
    while (!console.hasNext("[YN]"))
    { 
      System.out.print("Please press Y or N: "); 
      console.next();                            
    }
    input = console.next();
    return input;  
  }
}