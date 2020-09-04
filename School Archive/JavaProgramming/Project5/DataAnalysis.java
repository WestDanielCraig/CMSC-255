/*******************************************************************
* Programming Project  -                                           *
* @author Daniel C. West                                           *
* @version 29 March 2018                                           *
* CSMC 255, Section 1, Spring 2018                                 *
*------------------------------------------------------------------*
* Function:                                                        *
*    This program will take an input file with a year, month, city,*
* daily high temp, daily low temp, and daily rainfall amount. Then *
* calculate the average monthly high temp, and low temp. Then also *
* determine the total monthly rainfall amount. The information will*
* be output to an output file and formatted by the average amount, *
* total rainfall, and each days high and low temp followed by that *
* days rainfall. The file wil also diaplay the year, month and     *
* city at the top, The output will also put a + next to values that*
* are higher than the average temp, and a - next to a value with a * 
* below average value. Also, when there is rainfall on a day in the*
* month it will display an * next to that value. When finished, the*
* user will also be asked if they would like to input another fill *
* into the program.                                                *
*******************************************************************/
import java.util.*;
import java.io.*;
import java.lang.*;

public class DataAnalysis
{ //Start Class

  /*******************************************************************
  * Main Method                                                      *
  * -----------------------------------------------------------------*
  * Function:                                                        *
  *   Outputs printHeading, reads from a file, and writes to a file, *
  *  and repeats if another file needs to be input.                  *
  *******************************************************************/
  public static void main(String [] args) throws FileNotFoundException
  { //Start Main
    
    printHeading(); //Calls printHeading   
    
    String inputDataAnswer = null;  //Variable for holding users answer for input
    int daysInMonth = 0;            //Variable to hold acmount of days in the month that's in the input file    
    
    System.out.print("Would you like to process a weather analysis? Press Y for Yes and N for No: ");  //Prompts user if they would like to process a file   
    inputDataAnswer = decisionValidation(inputDataAnswer);  //Sends answer to method to be evaluated
   
   /*****************************************************************
   * @code If Statement: Executed when Player Answers Y to input    *
   *****************************************************************/
   if(inputDataAnswer.equals("Y"))
   { //Start if
     
     /*****************************************************************
     * @code While Loop: Loop will keep going as long as player's     *
     *     answer is Y to inputting a file                            *
     *****************************************************************/
     while(inputDataAnswer.equals("Y"))
     { //Start while
       Scanner console = new Scanner(System.in);                //Scanner to read user input from console
       System.out.print("Please Enter The Input File Name: ");  //Asks user for file name
       String inputFileName = console.next();                   //Puts user input into a String for file name
       
       File inputFile = new File(inputFileName);                //File to hold input file
       Scanner in = new Scanner(inputFile);                     //Scanner to read from a file
       PrintWriter out = new PrintWriter("dataOutput.txt");     //Printwriter to write into an output file       
       
       int year = 0;       //Variable to hold year value
       String month = "";  //Variable to hold month
       String city = "";   //Variable to hold city
       
       /*****************************************************************
       * @code If Statement: Executed if next input is an int type value*
       *****************************************************************/
       if(in.hasNextInt())
       {  //Start if
         year = in.nextInt();          //Puts value of year into year variable from input file
       }  //End if
       /*****************************************************************
       * @code If Statement: Executed if the file has another input to  *
       *    read                                                        *
       *****************************************************************/
       if(in.hasNext())
       {  //Start if
         month = in.next();            //Puts String of month into month variable from input file
       }  //End if
       /*****************************************************************
       * @code If Statement: Executed if the file has another line to   *
       *     grab                                                       *
       *****************************************************************/
       if(in.hasNextLine())
       {  //Start if
         city = in.nextLine().trim();  //Puts String of city into city variable from input file grabs the while line in case city has 2 words and trims
       }  //End if      
         
       daysInMonth = numDaysInMonth(month, year);                                    //Sends month and year to method to return a number of days       
       out.println("For the month of " + month + " " + year + " in " + city + ":");  //Outputs the month year and city to the outputs file that was read from the input file
       
       int[] dayArray = new int[daysInMonth];        //Array to hold all day numbers from input file
       int[] highTemp = new int[daysInMonth];        //Array to hold all high temps from input file
       int[] lowTemp = new int[daysInMonth];         //Array to hold all low temps from input file
       double[] rainfall = new double[daysInMonth];  //Array to hold all rainfall values from input file
       
       int k = 0; //Declare and Itinialize k counter
       
       /*****************************************************************
       * @code While Loop: Loop will keep going until there are no more *
       *     int values to grab from input file                         *
       *****************************************************************/
       while(in.hasNextInt())
       {  //Start while
         dayArray[k] = in.nextInt();           //Puts value into element of day array     
         /*****************************************************************
         * @code If Statement: Executed if the file has another int to    *
         *     grab                                                       *
         *****************************************************************/
         if(in.hasNextInt())
         {  //Start if
           highTemp[k] = in.nextInt();         //Puts value into element of high temp array 
           /*****************************************************************
           * @code If Statement: Executed if the file has another int to    *
           *     grab                                                       *
           *****************************************************************/
           if(in.hasNextInt())
           {  //Start if
             lowTemp[k] = in.nextInt();        //Puts value into element of low temp array
             /*****************************************************************
             * @code If Statement: Executed if the file has another double to *
             *     grab                                                       *
             *****************************************************************/
             if(in.hasNextDouble())
             {  //Start if
               rainfall[k] = in.nextDouble();  //Puts value into element of rainfall array 
             }  //End if
           }  //End if
         }  //End if        
         k++; //Update counter
       }  //End while       
              
       /*---------------------------------------------------------------*
       * Statements print into the output file. The temps are sent to a *
       *     method and their average temps are calculated and sent back*
       *     to be read into the output file. The rainfall value is also*
       *     sent to a method to calculate the sum of the rainfall for  *
       *     the month then send back and formatted so they will all    *
       *     show 2 decimal places.                                      *
       *---------------------------------------------------------------*/
       out.println("The average high temperature was " + calculateAverage(highTemp) + " degrees.");
       out.println("The average low temperature was " + calculateAverage(lowTemp) + " degrees.");
       out.print("The total rainfall was ");
       out.printf("%.2f", calculateSum(rainfall));
       out.println(" inches.");
       
       /*****************************************************************
       * @code For Loop: Loop will continue to run until the counter is *
       *    the same value as the daysInMonth value. This loop prints   *
       *    the days, high temps, low temps, and rainfall amount to the * 
       *    output file. It also sends the temps to a method to put a   *
       *    +, - or " " after the number. The rainfall is also sent to  *
       *    a method to put an next to the value if is greater than zero*
       *****************************************************************/
       for(int i = 0; i < daysInMonth; i++)
       {  //Start for
         out.print(dayArray[i] + "\t");
         out.print(highTemp[i] + plusMinusSign(calculateAverage(highTemp), highTemp[i]) + "\t");
         out.print(lowTemp[i] + plusMinusSign(calculateAverage(lowTemp), lowTemp[i]) + "\t");
         out.printf("%.2f", rainfall[i]);
         out.print(printStar(rainfall[i]));
         out.println();
       }  //End for   
      
       System.out.println("Your data has been processed."); //Lets the user know their data had been processed 
       System.out.print("Do you have another weather analysis to process? Press Y for Yes and N for No: "); //Asks if the user wants to process another file
       inputDataAnswer = decisionValidation(inputDataAnswer); //Sends user input for validation
       
       /*****************************************************************
       * @code If Statement: Executed if the user does not want to input*
       *     another file                                               *
       *****************************************************************/
       if(inputDataAnswer.equals("N"))
       {  //Start if
         System.out.println("Thank you, have a great day!"); //Sends the user off
       }  //End if
       
       in.close();  //Closes input file scanner
       out.close(); //Closes output file printwriter
     }  //End while
   }  //End if
   
   /*****************************************************************
   * @code Else If Statement: Executed if the user does not want to *
   *     input another file                                         *
   *****************************************************************/
   else if(inputDataAnswer.equals("N"))
   {  //Start else if
     System.out.println("Thank you, have a great day!"); //Sends the user off
   }  //End else if
  } //End Main
  
  /*****************************************************************************************************
     
  /*******************************************************************
  * printHeading Method                                              *
  * -----------------------------------------------------------------*
  * Function:                                                        *
  *   Prints header for program to console when called               *
  *     Input:                                                       *
  *       Parameters - None                                          *
  *     Output:                                                      *
  *       Return - None                                              *
  *******************************************************************/
  private static void printHeading()
  {
    System.out.println(); //Line created for console display appeal
    System.out.println("Daniel C. West");                  //Name of Program Author
    System.out.println("CMSC 255 Section 1 Spring 2018");  //Class, Section, and Semester
    System.out.println("Programming Project 5");           //Program Number
    System.out.println("Temperture Analysis");             //Program Name
    System.out.println(); //Line created for console display appeal   
  } //End printHeading
  
  /*******************************************************************
  * decisionValidation Method                                        *
  * -----------------------------------------------------------------*
  * Function:                                                        *
  *   Validates user input for choosing a yes or no answer           *
  *     Input:                                                       *
  *       Parameters - String input                                  *
  *     Output:                                                      *
  *       Return - String                                            *
  *******************************************************************/  
  private static String decisionValidation(String input)
  { //Start Method
    Scanner console = new Scanner(System.in); //Scanner to read user input   
    /*****************************************************************
    * @code While Loop: Loop will execute until Y or N is input      *
    *****************************************************************/
    while (console.hasNext("[^YN]+"))
    { //Start while loop
      System.out.print("Please press Y or N: "); //Ask User Again for Y or N
      console.next();                            //Scans Next String
    } //End while loop
    input = console.next();
    return input; //Returns string
  } //End method
  
  /*******************************************************************
  * numDaysInMonth Method                                            *
  * -----------------------------------------------------------------*
  * Function:                                                        *
  *   Determines how many days are in the month eveluated            *
  *     Input:                                                       *
  *       Parameters - String month, int year                        *
  *     Output:                                                      *
  *       Return - int days                                          *
  *******************************************************************/ 
  private static int numDaysInMonth(String month, int year)
  {
    int days = 0;  //Variable to hold number of days
   /*****************************************************************
   * @code If Statement: Executed if the month is January, Marh,    *
   *     May, July, August, October or December                     *
   *****************************************************************/
    if(month.equals("January") || month.equals("March") || month.equals("May") || month.equals("July") || month.equals("August") || month.equals("October") || month.equals("December")) 
    {  //Start if
      days = 31; //Sets days to 31 
    }  //End if
   /*****************************************************************
   * @code Else If Statement: Executed if the month is April, June, *
   *     September, November                                        *
   *****************************************************************/
    else if(month.equals("April") || month.equals("June") || month.equals("September") || month.equals("November")) 
    {  //Start if
      days = 30; //Sets days to 30
    }  //End if
   /*****************************************************************
   * @code Else If Statement: Executed if the month is February     *
   *****************************************************************/
    else if(month.equals("February")) 
    {  //Start else if  
      /*****************************************************************
      * @code If Statement: Executed if February is not a leap year,   *
      *     divides by 4 and no remainder of 0                         *
      *****************************************************************/
      if(year % 4 != 0) 
      {  //Start if
        days = 28; //Sets days to 28
      }  //End if
      /*****************************************************************
      * @code Else If Statement: Executed if February is a leap year   *
      *****************************************************************/
      else if(year % 400 == 0) 
      {  //Start else if
        days = 29; //Sets days to 29
      }  //End else if
      /*****************************************************************
      * @code Else If Statement: Executed if February not a leap year  *
      *****************************************************************/
      else if(year % 100 == 0) 
      {  //Start else if
        days = 28; //Sets days to 28
      }  //End else if
      /*****************************************************************
      * @code Else If Statement: Executed if February is a leap year   *
      *****************************************************************/
      else 
      {  //Start else
        days = 29; //Sets days to 29
      }  //End else    
    }  //End if
    return days; //Returns days number
  }  //End method   
   
  /*******************************************************************
  * calculateAverage Method                                          *
  * -----------------------------------------------------------------*
  * Function:                                                        *
  *   Determines the average value of the input array                *
  *     Input:                                                       *
  *       Parameters - int[] temp                                    *
  *     Output:                                                      *
  *       Return - int rounded                                       *
  *******************************************************************/
  private static int calculateAverage(int[] temp)
  { //Start method
    double sum = 0; //Declare and initialize sum variable
    /*****************************************************************
    * @code For Loop: Loop will execute until i equals array length  *
    *****************************************************************/
    for(int i = 0; i < temp.length; i++)
    { //Start for
      sum = sum + temp[i]; //Adds sum to temp array element starting at 0 and going until its length, then keeps adding
    } //End for
    double average = sum / temp.length;       //Finds the average by dividing the final sum to the arrays length
    int rounded = (int) Math.round(average);  //Takes the final average and rounds it then turns it into a double
    return rounded;  //Retrns value 
  } //End method
    
  /*******************************************************************
  * calculateSum Method                                              *
  * -----------------------------------------------------------------*
  * Function:                                                        *
  *   Determines the sum of the input array                          *
  *     Input:                                                       *
  *       Parameters - int[] rainfall                                *
  *     Output:                                                      *
  *       Return - double sum                                        *
  *******************************************************************/
  private static double calculateSum(double [] rainfall)
  { //Start method
    double sum = 0; //Declare and iniitialize sum variable
    /*****************************************************************
    * @code For Loop: Loop will execute until i equals array length  *
    *****************************************************************/
    for(int i = 0; i < rainfall.length; i++)
    { //Start for
    sum = sum + rainfall[i]; //Keeps adding sum to array element starting at 0 and ending at arry length 
    } //End for
    return sum; //Returns sum
  } //End method
  
  /*******************************************************************
  * plusMinusSign Method                                             *
  * -----------------------------------------------------------------*
  * Function:                                                        *
  *   Determines if the value needs a +, -, or white space after the *
  *     value                                                        *
  *     Input:                                                       *
  *       Parameters - int rounded, int temp                         *
  *     Output:                                                      *
  *       Return - String                                            *
  *******************************************************************/
  private static String plusMinusSign(int rounded, int temp)
  { //Start method
    /*****************************************************************
    * @code If Statement: Executed if rounded > temp and returns a   *
    *    minus sign                                                  *
    *****************************************************************/
    if(rounded > temp) 
    { //Start if
      return "-"; //Return value
    } //End if
    /*****************************************************************
    * @code Else If Statement: Executed if rounded < temp and        *
    *     returns a plus sign                                        *
    *****************************************************************/
    else if(rounded < temp) 
    { //Start if
      return "+"; //Return value
    } //End if
    /*****************************************************************
    * @code Else Statement: Executed if rounded = temp and returns a *
    *    white space                                                 *
    *****************************************************************/
    else 
    { //Start if
      return " "; //Return value
    } //End if
  } //End method
  
  /*******************************************************************
  * printStar Method                                                 *
  * -----------------------------------------------------------------*
  * Function:                                                        *
  *   Determines passed variable needs a * after it                  *
  *     Input:                                                       *
  *       Parameters - double rainfall                               *
  *     Output:                                                      *
  *       Return - String                                            *
  *******************************************************************/
  private static String printStar(double rainfall)
  { //Start method
    /*****************************************************************
    * @code If Statement: Executed if rainfall does not equal zero   *
    *****************************************************************/
    if(rainfall != 0) 
    { //Start if
      return "*"; //Returns *
    }  //End if
    /*****************************************************************
    * @code Else Statement: Executed if the value is zero            *
    *****************************************************************/
    else 
    { //Start else
      return " "; //Returns white space
    } //End else
  } //End method  
} //End Class