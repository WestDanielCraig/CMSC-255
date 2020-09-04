/*******************************************************************
* Programming Project 2 - Jelly Bean Jar                           *
* @author Daniel C. West                                           *
* @version 16Feb2018                                               *
* CSMC 255, Section 1, Spring 2018                                 *
*------------------------------------------------------------------*
* Function:                                                        *
*   This program will calculate the number of jelly beans in a     *
*   specified volume jar with specified size jelly beans. The user *
*   will input the jelly bean length and diameter then input the   *
*   jar volume. Then the program will calculate the jelly bean     *
*   volume and divide that volume by the jar volume to calculate   *
*   the exact number of jelly beans that can fit inside the jar.   *
*   The program will also factor in that the jelly beans will only *
*   take up 69.8% of the jar volume per the LOAD_FACTOR constant.  *
*******************************************************************/
import java.util.Scanner; //Imports Scanner class to program
import java.lang.Math;    //Imports Math class to program

public class JellyBeans
{ //Start JellyBeans Class

  /*******************************************************************
  * Main Method                                                      *
  * -----------------------------------------------------------------*
  * Function:                                                        *
  *   Outputs printHeading                                           *
  *   Calculates amount of jelly beans in usable jar volume          *
  *******************************************************************/
  public static void main(String [] args)
  { //Start Main
    
    Scanner scan = new Scanner(System.in); //Creates a scanner object to read user inputs
    
    printHeading(); //Calls printHeading
    
    /*****************************************************************
    * Declare Variables:                                             *
    *   beanLength - Variable for holding user input for jelly bean  *
    *                length.                                         *
    *   beanDiameter - Variable for holding user input for jelly     *
    *                  bean diameter.                                *
    *   beanVolume - Variable for holding program calculated jelly   *
    *                bean volume.                                    *
    *   jarVolume - Variable for holding user input for jar volume   *
    *   beanCount - Variable for holding program calculated total    *
    *               number of jelly beans in the jar.                *
    *   LOAD_FACTOR - Constant for usable percentage in jar          *
    *****************************************************************/
    
    final double LOAD_FACTOR = 0.698;  //Percent of Jar Volume Jelly Beans Use
    
    double beanLength;    //Jelly Bean Length
    double beanDiameter;  //Jelly Bean Diameter
    double beanVolume;    //Jelly Bean Volume
    double usableVolume;  //Usable Volume In Jelly Bean Jar
    double jarVolume;     //Jelly Bean Jar Volume
    double beanCount;     //Total Jelly Beans In Jar
    
   	System.out.print("Enter the jelly bean jar volume (mL): ");     //Asks user jar volume
   	/*****************************************************************
    * @code While Loop: do until user enters a valid number          *
    *****************************************************************/
    while(!scan.hasNextDouble())
    { //Start While Loop
    	scan.next();                                                //Scans next input for double
    	System.out.print("Please enter a valid jar volume (mL): "); //Loop continues if input is not a double
    } //End While Loop
        jarVolume = scan.nextDouble();                              //User inputs jar volume scans for double
        
        
    System.out.print("Enter the jelly bean length (cm): ");         //Asks user jelly bean length
    /*****************************************************************
    * @code While Loop: do until user enters a valid number          *
    *****************************************************************/
    while(!scan.hasNextDouble())
    { //Start While Loop
    	scan.next();                                                //Scans next input for double
    	System.out.print("Please enter a valid length (cm): ");     //Loop continues if input is not a double
    } //End While Loop
        beanLength = scan.nextDouble();                             //User inputs bean length scans for double
        
        
    System.out.print("Enter the jelly bean diameter (cm): ");       //Asks user jelly bean diameter
    /*****************************************************************
    * @code While Loop: do until user enters a valid number          *
    *****************************************************************/
    while(!scan.hasNextDouble())
    { //Start While Loop
    	scan.next();                                                //Scans next input for double
    	System.out.print("Please enter a valid diameter (cm): ");   //Loop continues if input is not a double
    } //End While Loop
        beanDiameter = scan.nextDouble();                           //User inputs bean length scans for double
        
        
        
    //Calculates Usable Jelly Bean Jar Volume Due To Empty Space Left By Jelly Beans
    usableVolume = (jarVolume * LOAD_FACTOR);
    
    //Calculates Actual Jelly Bean Volume For A Single Bean
    beanVolume = ((Math.PI / 6) * (beanDiameter * beanDiameter) * (beanLength));
    
    //Calculates Final Jelly Bean Count Inside Jar And Rounds To The Nearest Whole Number
    beanCount = Math.round(usableVolume / beanVolume);
    
    /*****************************************************************
    * Outputs final jelly bean count in the jar                      *
    *****************************************************************/
    System.out.print("There are approximately ");
    System.out.print(beanCount);
    System.out.println(" beans in the jar.");
    
    
    System.out.println(); //Line Printed for console display appeal

  } //End Main
  
  /***************************************************************************************

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
  public static void printHeading()
  {
    System.out.println(); //Line created for console display appeal
    System.out.println("Daniel C. West");                  //Program Author Name
    System.out.println("CMSC 255 Section 1 Spring 2018");  //Course Number and Section
    System.out.println("Programming Project 2");           //Project Number
    System.out.println("Jelly Bean Jar");                  //Project Name
    System.out.println(); //Line created for console display appeal

   
  } //End printHeading
   
} //End NameArt Class