/*******************************************************************
* Programming Project 1 - Name in Code                             *
* @author Daniel C. West                                           *
* @version 27Jan2018                                               *
* CSMC 255, Section 1, Spring 2018                                 *
*------------------------------------------------------------------*
* Function:                                                        *
*   This program will display authors name design                  *
*   and an original art piece created by him.                      *
*******************************************************************/
  
//import java.lang.Math;
  
public class VariableDefinitions
{ //Start NameArt Class

  /*******************************************************************
  * Main Method                                                      *
  * -----------------------------------------------------------------*
  * Function:                                                        *
  *   Outputs printHeading, Name Art, and Picture Art                *
  *******************************************************************/
  public static void main(String [] args)
  { //Start Main
    
    printHeading(); //Calls printHeading
    
	//Part A Variables
	byte numPeople = 3;
	float itemPrice = 32.32f;
	boolean noMore = false;
	char one = 'a';
	short classNum = 207;
	float dinnerPrice = 30.0f;
	double largeNum = 990123456789.0;
	int mediumNum = 177609;
	
	//Part B Variables
	int count = 42;
	double total = 10425.785;
	char stopKey = 'A';
	boolean stopFlag = true;
	float temperatureReading = 75.6f;
	byte numPets = 3;
	short littleNum = 408;
	double reallyBigNumber = 240056009789.0;
	
	//Part A Variables Output
	System.out.println("The numPeople variable has a value of:           " + numPeople);
	System.out.println("The itemPrice variable has a value of:           " + itemPrice);
	System.out.println("The noMore variable has a value of:              " + noMore);
	System.out.println("The one variable has a value of:                 " + one );
	System.out.println("The classNum variable has a value of:            " + classNum);
	System.out.println("The dinnerPrice variable has a value of:         " + dinnerPrice);
	System.out.println("The largeNum variable has a value of:            " + largeNum);
	System.out.println("The mediumNum variable has a value of:           " + mediumNum);
	
	//Part B Variables Output
	System.out.println("The count variable has a value of:               " + count);
	System.out.println("The total variable has a value of:               " + total);
	System.out.println("The stopKey variable has a value of:             " + stopKey);
	System.out.println("The stopFlag variable has a value of:            " + stopFlag);
	System.out.println("The temperatureReading variable has a value of:  " + temperatureReading);
	System.out.println("The numPets variable has a value of:             " + numPets);
	System.out.println("The littleNum variable has a value of:           " + littleNum);
	System.out.println("The reallyBigNumber variable has a value of:     " + reallyBigNumber);
	
	final byte NUM_DOGS = 4;
	final short NUM_CATS = 6;
	final int NUM_MILES = 745;
	final long NUM_STEPS = 50357862;
	final float INTEREST_AMOUNT = 0.146f;
	final double MAX_LOAN = 5000000.0;
	final char WEB_ONE = 'A';
	final boolean STOP_TALKING = true;
	
	//NUM_DOGS = 45;
	
	System.out.println("\nThe NUM_DOGS constant has a value of:            " + NUM_DOGS);
	System.out.println("The NUM_CATS constant has a value of:            " + NUM_CATS);
	System.out.println("The NUM_MILES constant has a value of:           " + NUM_MILES);
	System.out.println("The NUM_STEPS constant has a value of:           " + NUM_STEPS);
	System.out.println("The INTEREST_AMOUNT constant has a value of:     " + INTEREST_AMOUNT);
	System.out.println("The MAX_LOAN constant has a value of:            " + MAX_LOAN);
    System.out.println("The WEB_ONE constant has a value of:             " + WEB_ONE);
    System.out.println("The STOP_TALKING constant has a value of:        " + STOP_TALKING);
    
    
    System.out.println();

  } //End Main
  
  /************************************************************************

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
    System.out.println("Daniel C. West");                  //Name of Program Author
    System.out.println("CMSC 255 Section 1 Spring 2018");  //Class, Section, and Semester
    System.out.println("Programming Project Lab 4 ");            //Program Number
    System.out.println("Lab 4");                                //Program Name
    System.out.println(); //Line created for console display appeal

   
  } //End printHeading
   
} //End NameArt Class