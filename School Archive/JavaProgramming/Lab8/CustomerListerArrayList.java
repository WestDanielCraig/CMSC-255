import java.util.ArrayList;
import java.util.*;

public class CustomerListerArrayList
{
  public static void main(String[] Args)
  {
    ArrayList<String> names = new ArrayList<String>();
    names.add("Chris");
    names.add("Lois");
    names.add("Meg");
    names.add("Peter");
    names.add("Stewie");
    
    for(String element: names)
    {
      System.out.println(element);
    }
    names.set(4, "Brian");
    names.set(3, "Meg");
  
    System.out.println();
    
    for(int i = 0; i < names.size(); i++)
    {
      if(names.get(i).equals("Meg"))
      {
        names.remove(i);
        i--;
      }
    }
    
    for(String element: names)
    {
      System.out.println(element);
    }
    
  }
 
  
  
}