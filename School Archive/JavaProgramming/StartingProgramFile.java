/*******************************************************************
* Programming Project  -                                           *
* @author Daniel C. West                                           *
* @version 29 March 2018                                               *
* CSMC 255, Section 1, Spring 2018                                 *
*------------------------------------------------------------------*
* Function:                                                        *
*                                                                  *
*                                                                  *
*******************************************************************/
import java.util.*;
import java.io.*;

public class StringManipulation
{ //Start Class

  /*******************************************************************
  * Main Method                                                      *
  * -----------------------------------------------------------------*
  * Function:                                                        *
  *   Outputs printHeading,                                          *
  *******************************************************************/
  public static void main(String [] args)
  { //Start Main
    
    printHeading(); //Calls printHeading
    
    File inputFile = new File("strings.txt");
    Scanner in = new Scanner(inputFile);
    PrintWriter out = new PrintWriter("output.txt");
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    System.out.println();

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
    System.out.println("Daniel C. West");                  //Name of Program Author
    System.out.println("CMSC 255 Section 1 Spring 2018");  //Class, Section, and Semester
    System.out.println("Programming Project 5");           //Program Number
    System.out.println("Temperture Analysis");             //Program Name
    System.out.println(); //Line created for console display appeal   
  } //End printHeading
   
} //End Class