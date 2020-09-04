import java.util.Scanner;
import java.util.InputMismatchException;

/*******************************************************************************
 *   DaysPerMonth 
 * -----------------------------------------------------------------------------
 *   VCU - Computer Science Department
 *   A program that prompts the user for a month and year (both as integers)
 *   then displays the number of days in that month.
 ******************************************************************************/
 class DaysPerMonth {

 public static void main(String[] args) 
 {
    int month;
    int year;

    Scanner userInput = new Scanner(System.in);

    if(args.length > 0 && args.length < 2)
    {
      try 
      {
        month = Integer.parseInt(args[0]);

        while(month < 1 || month > 12)
        {
          System.out.print("Month must be between 1 and 12. Try again: "); 
          inputValidation(userInput);
          month = userInput.nextInt();
        }

        year = Integer.parseInt(args[1]);
        
        while(year < 0)
        {
          System.out.print("Year cannot be negative. Try again: ");
          inputValidation(userInput);
          year = userInput.nextInt();
        } 

        int numDays = getDays(month, year);
        System.out.println("There are " + numDays + " days in this month.");
        System.exit(0);
      }
      catch(NumberFormatException exception)
      {
        System.out.print("Not an integer. Try again: ");
      }
    }

    System.out.print("\nEnter a month (1-12): ");
    inputValidation(userInput);

    month = userInput.nextInt();
  
    while(month < 1 || month > 12)
    {
      System.out.print("Month must be between 1 and 12. Try again: "); 
      inputValidation(userInput);
      month = userInput.nextInt();
    }
      
    System.out.print("Enter a year: ");

    inputValidation(userInput);

    year = userInput.nextInt();

      while(year < 0)
      {
        System.out.print("Year cannot be negative. Try again: ");
        inputValidation(userInput);

        year = userInput.nextInt();
      }

      int numDays = getDays(month, year);

      System.out.println("There are " + numDays + " days in this month.");
        
      userInput.close();
    

 } //end of main
 public static void inputValidation(Scanner userInput)
 {
   while(!userInput.hasNextInt())
   {
     System.out.print("Not an integer. Try again: ");
     userInput.next();
   }
 }

/*******************************************************************************
 *   getDays 
 * -----------------------------------------------------------------------------
 *   Function: Get number of days in a month
 *   Input:  month 
 *           year
 *   Output: Number of days in the month
 ******************************************************************************/

private static int getDays(int mon, int yr) {
  int numDays = 0;
  switch(mon) 
  {
    case 2: // February
    numDays = 28;
    if(yr % 4 == 0) 
    {
      numDays = 29;
      if(yr % 100 == 0 && yr % 400 != 0)
        numDays = 28;
    }
    break;
    case 4:   //April
    case 6:   // June
    case 9:   // September
    case 11:  // November
    numDays = 30;
    break;
    default: numDays = 31;  // all the rest
  }
  return numDays;
 }

}