import java.util.Scanner;
import java.util.*;

public class CustomerListerArray
{
  public static void main(String[] Args)
  {
    final int LENGTH = 7;
    String[] customerName = new String[LENGTH];
    
    customerName[0] = "Chris";
    customerName[1] = "Lois";
    customerName[2] = "Meg";
    customerName[3] = "Pete";
    customerName[4] = "Stewie";
    
    for(String element: customerName)
    {
      System.out.println(element);      
    }
    
    customerName[3] = "Meg";
    customerName[4] = "Brian";
    customerName[5] = "Pete";
    customerName[6] = "Stewie";
    
    System.out.println();
    
    for(String element: customerName)
    {
      System.out.println(element); 
    }
        
    System.out.println();
    modifyArray(customerName);
    System.out.println();    
    
  }  
  
  private static void modifyArray(String[] customer)
  {
    for(int i = customer.length - 1; i >= 0; i--)
    {
      if(customer[i].equals("Meg"))
      {
        for(int j = i; j < customer.length; j++)
        {
          if(j == customer.length - 1)
          {
            customer[j] = null;
          }
          else
          customer[j] = customer[j + 1];          
          
          /**if(customer[j].equals(customer[j - 1]))
          {
            customer[j] = null;
            while(j <= customer.length - 1)
            {        
              customer[j] = null;
              j++;
            }
          }**/
          
        }
      }         
    }
    
    for(String element: customer)
    {
      System.out.println(element); 
    }
    
  }
}