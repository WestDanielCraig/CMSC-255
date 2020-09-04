import java.io.*;
import java.util.Scanner;

public class Lab7Methods 
{

   public static void main(String[] args) 
   {
     // variable declarations for part 1
     String date;
     String partner1Name;
     String partner2Name;
     Scanner in = new Scanner(System.in);
     // prompt for input for part 1
     System.out.print("Enter a date:");
     date = in.nextLine();
     System.out.print("Enter the partner one's first and last name:");
     partner1Name = in.nextLine();
     System.out.print("Enter the partner two's first and last name:");
     partner2Name = in.nextLine();
     // write the call the method in Part 1
     
     greeting(date, partner1Name, partner2Name);
     
     // variable declarations for part 2
     int num1;
     int num2;
     int num3;
     int num4;
     int num5;
          
     // user prompts for part 2
     System.out.print("Enter first number:");
     num1 = in.nextInt();
     System.out.print("Enter second number:");
     num2 = in.nextInt();
     System.out.print("Enter third number:");
     num3 = in.nextInt();
     System.out.print("Enter fourth number:");
     num4 = in.nextInt();
     System.out.print("Enter fifth number:");
     num5 = in.nextInt();
    
     System.out.println("The higher number is " + max(num1, num2));
     
     System.out.println("The absolute value of the combined number is " + abs(num1, num2, num3, num4, num5));
     // call the methods for part 2 inside the println statement
     
   }// end main    

public static void greeting(String date, String partner1Name, String partner2Name )
{
  System.out.println(); //Line created for console display appeal
  System.out.println("Today is: " + date);                                  //Today Date
  System.out.println("We are " + partner1Name + " and " + partner2Name);  //Names
  System.out.println(); //Line created for console display appeal   
} //End printHeading

public static int max(int num1, int num2)
{
  int max;
  if(num1 > num2)
  {
    max = num1;
  }
  else
  {
    max = num2;
  }
  return max;
}

public static int abs(int num1, int num2, int num3, int num4, int num5)
{
  int sum;
  sum = Math.abs(num1) + Math.abs(num2) + Math.abs(num3) + Math.abs(num4) + Math.abs(num5);
  return sum;
}

}// end class


