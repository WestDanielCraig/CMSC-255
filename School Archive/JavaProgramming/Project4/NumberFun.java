/*******************************************************************
* Programming Project 4 - Number Fun (Writing User-defined Methods *
* @author Daniel C. West                                           *
* @version 13Mar2018                                               *
* CSMC 255, Section 1, Spring 2018                                 *
*------------------------------------------------------------------*
* Function:                                                        *
*     This program will determine if a positive, whole number is   *
* even, prime, a palindrome, or emirp. The input to the program is *
* a series of numbers, one per line, read from a text file.        *
*******************************************************************/
import java.io.*;   
import java.util.*;

public class NumberFun
{ //Start Class

  /*******************************************************************
  * Main Method                                                      *
  * -----------------------------------------------------------------*
  * Function:                                                        *
  *   Outputs printHeading, creates scanners to read from txt file   *
  *   and console, also creates array to store data from txt file for*
  *   evaluatino of even, prime, palindrome, or emirp numbers.       *
  *******************************************************************/
  public static void main(String [] args) throws FileNotFoundException
  { //Start Main
    
    printHeading(); //Calls printHeading   
    
    final int NUMBER_OF_INPUTS = 13;               //Constant to hold the number of inputs there will be from the .txt file
    int[] numberSet = new int[NUMBER_OF_INPUTS];  //Makes an integer array to hold numbers from the .txt file
    
    //Scanner to read input from the console for file name and messages to ask for file name input and warn that the data needs to be integers.
    Scanner console = new Scanner(System.in);
    System.out.println("Enter Input File Name, File Must Only Contain Non Negative Integers.");
    System.out.print("Input File Name: ");
    String inputFileName = console.next(); //Variable to hold name of input file
    
    File inputFile = new File(inputFileName); //Variable to hold all the values from the input file
    Scanner in = new Scanner(inputFile);      //Scanner to be used to read from the file and input to array
    
    System.out.println();    //Line created for appeal    
    
    /*****************************************************************
    * @code For Loop: Loop will keep going until all integers are    *
    *     read from the input file that is a .txt file. The integers *
    *     are then placed inside the numberSet array for use.        *
    *****************************************************************/
    for(int i = 0; i < numberSet.length; i++)
    { //Start for loop
      
      /*****************************************************************
      * @code If Statement: Executed as long as the next input read is *
      *     an integer from the txt document.                          *
      *****************************************************************/
      if(in.hasNextInt())
      { //Start if statement
        numberSet[i] = in.nextInt(); //Sets the next input read to an element in the array numbersSet
      } //End if statement
      
      /*****************************************************************
      * @code Else Statement: Executed if the next input read from the *
      *    txt file was not an integer.                                *
      *****************************************************************/
      else 
      { //Start else statement
        in.next(); //Process next input
        System.out.println("Input Number " + (i + 1) + " Has Bad Input, Please Check Your Text Document"); //Output at the beginning of the console to tell user that their txt document has bad input and change it
      } //End else statement
    } //End for loop 
       
    System.out.println(); //Line created for appeal
             
    /*****************************************************************
    * @code Advanced For Loop: Loop will continue to go until each   *
    *     element has been read from the arry and then evaluated by  *
    *     each if statement following.                               *
    *****************************************************************/
    for(int element : numberSet)
    { //Start for loop
      System.out.print(element + " - ");
      
      /*****************************************************************
      * @code If Statement: Executed as long as the next element value *
      *     is equal or larger than 0.                                 *
      *****************************************************************/
      if(element >= 0)
      { //Start if statement
        
        /*****************************************************************
        * @code If Statement: Executed as long as the next element       *
        *     returns from the method true. This verifies that the       *
        *     element is an even number.                                 *
        *****************************************************************/
        if(evenNumber(element) == true)
        { //Start if statement
          System.out.print("even  "); //Output to console that the number is even
        } //End if statement
        
        /*****************************************************************
        * @code If Statement: Executed as long as the next element       *
        *     returns from the method true. This verifies that the       *
        *     element is a prime number.                                 *
        *****************************************************************/
        if(primeNumber(element) == true)
        { //Start if statement
          System.out.print("prime  "); //Output to console that the number is prime
        } //End if statement
        
        /*****************************************************************
        * @code If Statement: Executed as long as the next element       *
        *     returns from the method true. This verifies that the       *
        *     element is a palindrome number.                            *
        *****************************************************************/
        if(palindromeNumber(element) == true)
        { //Start if statement
          System.out.print("palindrome  "); //Output to console that the number is palindrome        
        } //End if statement
        
        /*****************************************************************
        * @code If Statement: Executed as long as the next element       *
        *     returns from the method true. This verifies that the       *
        *     element is a emirp number.                                 *
        *****************************************************************/
        if(emirpNumber(element) == true)
        { //Start if statement
          System.out.print("emirp  "); //Output to console that the number is emirp
        } //End if statement
        System.out.println(); //Added for output formatting in console  
      } //End if statement
      
      /*****************************************************************
      * @code Else Statement: Executed if the element number is less   *
      *     than zero.                                                 *
      *****************************************************************/
      else
      { //Start else statement
        System.out.println("Bad input, this is a negative number."); //Outputs to console that the .txt file input was bad becasue it was negative
      } //End else statement
    } //End for loop
    
    in.close(); //Closes file after finished using it
    
    System.out.println(); //Print line for appeal

  } //End Main
  
  /**************************************************************************************************************

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
  { //Start printHeading
    System.out.println(); //Line created for console display appeal
    System.out.println("Daniel C. West");                             //Name of Program Author
    System.out.println("CMSC 255 Section 1 Spring 2018");             //Class, Section, and Semester
    System.out.println("Programming Project 4");                      //Program Number
    System.out.println("Number Fun (Writing User-defined Methods)");  //Program Name
    System.out.println(); //Line created for console display appeal   
  } //End printHeading
  
  /*******************************************************************
  * evenNumber Method                                                *
  * -----------------------------------------------------------------*
  * Function:                                                        *
  *   Will verify if a number is even or not and return a boolean    *
  *     Input:                                                       *
  *       Parameters - int elementNum                                *
  *     Output:                                                      *
  *       Return - result which is a boolean                         *
  *******************************************************************/
  public static boolean evenNumber(int elementNum)
  { //Start evenNumber method
    boolean result = false; //Variable to hold a boolean value for return 
    /*****************************************************************
    * @code If Statement: Executed to see if the elementNum can be   *
    *     divided by 2 with no remaindor which will make it an even  *
    *     number.                                                    *
    *****************************************************************/
    if(elementNum % 2 == 0)
    {
      result = true; //Updates results boolean value
    }
    return result; //Returns boolean value
  } //End evenNumber method  
  
  /*******************************************************************
  * primeNumber Method                                               *
  * -----------------------------------------------------------------*
  * Function:                                                        *
  *   Will verify if a number is prime or not and return a boolean   *
  *     Input:                                                       *
  *       Parameters - int elementNum                                *
  *     Output:                                                      *
  *       Return - boolean                                           *
  *******************************************************************/
  public static boolean primeNumber(int elementNum)
  { //Start primeNumber method
    /*****************************************************************
    * @code If Statement: Executed to see if the elementNum is less  *
    *    thatn or equal to 1 to start.                               *
    *****************************************************************/
    if(elementNum <= 1)
    { //Start if statement
      return false; //Returns boolean value
    } //End if statement
    /*****************************************************************
    * @code For Loop: Loop will continue to go until it find if the  *
    *     elementNum can divisible by anything but itself and 1, if  *
    *     not then it is a prime number                              *
    *****************************************************************/
    for(int i = 2; i < elementNum; i++)
    { //Start for loop
      /*****************************************************************
      * @code If Statement: Executed to see if the elementNum has a    *
      *     remaindor or not                                           *
      *****************************************************************/
      if(elementNum % i == 0)
      { //Start if statement
        return false; //If remaindor is 0
      } //End if statement
    } //End for loop
    return true; //Return boolean value
  } //End primeNumber method
  
  
  /*******************************************************************
  * palindromeNumber Method                                          *
  * -----------------------------------------------------------------*
  * Function:                                                        *
  *   Will verify if a number is palindrome or not and return a      *
  *     blloean value, it will reverse the number and see if its the *
  *     as before.                                                   *
  *     Input:                                                       *
  *       Parameters - int elementNum                                *
  *     Output:                                                      *
  *       Return - result as a boolean                               *
  *******************************************************************/
  public static boolean palindromeNumber(int elementNum)
  { //Start palindromeNumber method
    boolean result = false; //Variable to hold boolean value
    
    int reverseNum, //Variable to hold reversed number
      number = 0,   //Variable to hold anotehr number
      num;          //Variable to hold a number for math
    
    reverseNum = elementNum; //Initialize variable reverseNum
    /*****************************************************************
    * @code While Loop: Loop will continue to go until the elementNum*
    *     is no longer great than zer, this loop will eventually     *
    *     reverse the orginal number it started with and see if its  *
    *     the same number as before.                                 *
    *****************************************************************/
    while(elementNum > 0)
    { //Start while loop
      
      //Math to take the last number and make it the first then so on and so fourth until the number is reversed
      num = elementNum % 10;    
      number = number * 10 + num;
      elementNum = elementNum / 10;
    } //End while loop
    /*****************************************************************
    * @code If Statement: Executed to see if the elementNum has      *
    *     been reversed as the orginial number                       *
    *****************************************************************/
    if(number == reverseNum)
    {
      result = true; //Update result as true
    }    
    return result; //Return boolean 
  } //End palindromeNumber method
  
  
  /*******************************************************************
  * emirpNumber Method                                               *
  * -----------------------------------------------------------------*
  * Function:                                                        *
  *   Will verify if a number is emirp or not and return a           *
  *     blloean value, it will reverse the number and see if its the *
  *     as before. then test to see if it is prime by passing ot to  *
  *     the primeNumber method.                                      *
  *     Input:                                                       *
  *       Parameters - int elementNum                                *
  *     Output:                                                      *
  *       Return - result as a boolean                               *
  *******************************************************************/
  public static boolean emirpNumber(int elementNum)
  { //Start emirpNumber method
    /*****************************************************************
    * @code If Statement: Executed to see if the elementNum is a     *
    *     prime number when its reversed                             *
    *****************************************************************/
    if(primeNumber(elementNum) == false)
   { //Start if statement
     return false; //Return boolean
   } //End if statement
   
   int reverseNum, //Variable to hold reversed number
     number = 0,   //Variable to hold anotehr number
     num;          //Variable to hold a number for math
   
   reverseNum = elementNum; //Initialize variable reverseNum
   /*****************************************************************
    * @code While Loop: Loop will continue to go until the elementNum*
    *     is no longer great than zer, this loop will eventually     *
    *     reverse the orginal number it started with and see if its  *
    *     the same number as before.                                 *
    *****************************************************************/
   while(elementNum > 0)
   { //Start while loop
    
     //Math to take the last number and make it the first then so on and so fourth until the number is reversed
     num = elementNum % 10;
     number = number * 10 + num;
     elementNum = elementNum / 10;
   } //End while loop
   return primeNumber(reverseNum); //Pass back the variable to the primeNumber method to test to see if its prime and then have the prime method return a boolean  
  } //End emirpNumber method  
   
} //End Class