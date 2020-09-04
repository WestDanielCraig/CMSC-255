import java.util.*;
import java.io.*;
import java.lang.*;

public class SimpleDataTester
{
  public static void main(String[] args)
  {
    
    ArrayList<SimpleDate> dateCollection = new ArrayList<SimpleDate>();
    
    int month;
    int day;
    int year;    
    String answer = null;
    
    Scanner in = new Scanner(System.in);    
    
    System.out.print("Would you like to enter a date? Press Y for yes or N for no: ");
    answer = decisionValidation(answer);
    
    while(answer.equals("Y"))
    {      
      try
      {      
      System.out.print("Please enter a month: ");     
      month = in.nextInt();
      
      System.out.print("Please enter a day: ");
      day = in.nextInt();
      
      System.out.print("Please enter a year: ");
      year = in.nextInt();
      
      SimpleDate simpleD = new SimpleDate(month, day, year);
      
      
        dateCollection.add(simpleD);
      }
      catch(IllegalArgumentException exception)
      {
        System.out.println(exception.getMessage());
      }
      catch(InputMismatchException exception)
      {
        System.out.println("eh wrong");
        in.next();
      }
      //System.out.println(dateCollection);
      
      System.out.print("Would you like to enter another date? Press Y for yes or N for no: ");
      answer = decisionValidation(answer);
      
    }  
    
    for(SimpleDate elements: dateCollection)
    {
      System.out.println(elements);
    }
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