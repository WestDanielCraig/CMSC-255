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
  public static void main(String [] args) throws FileNotFoundException
  { //Start Main
    
    printHeading(); //Calls printHeading
    
    
    
    File inputFile = new File("strings.txt");
    Scanner in = new Scanner(inputFile);
    PrintWriter out = new PrintWriter("output.txt");
    
    String[] inputStrings = new String[9];
    
    for(int i = 0; i < inputStrings.length; i++)
    {
      inputStrings[i] = in.nextLine();
      inputStrings[i].trim();
      
      System.out.println(inputStrings[i]);
      
    }
    
    String s1 = inputStrings[0].substring(0, 5);
    String s2 = inputStrings[0].substring(5, 6);
    String s3 = inputStrings[0].substring(0, 1);
    String s4 = inputStrings[1].substring(1);
    String s5 = inputStrings[2].substring(2);
    String s6 = inputStrings[3].substring(1);
    String s7 = inputStrings[4].substring(2);
    String s8 = inputStrings[7].substring(0, 1);
    String s9 = inputStrings[8].substring(0, 6);
    String s10 = inputStrings[5].substring(7, 11);
    String s11 = inputStrings[5].substring(3, 6);
    String s12 = inputStrings[6].substring(0, 3);
    String s13 = inputStrings[6].substring(5, 7);
    String s14 = inputStrings[1].substring(0, 1);
    String s15 = inputStrings[7].substring(5, 6);
    String s16 = inputStrings[8].substring(17, 19);
    int i17 = inputStrings[0].indexOf('H');
    int i18 = inputStrings[1].indexOf('a');
    
    int i = 0;
    while(i <= 50)
    {
      out.print(i17);
      i++;
    }
    
    out.println();
    out.println();
    out.println();
    
    out.println(s1 + s2 + s3 + s4 + s5 + s6 + s7);
    out.println("   " + s8 + s2 + s10 + s2 + s11);
    out.println("   " + s9 + s2 + s12);
    out.print("     " + s14 + s13 + s15 + s16);
    
    out.println();
    out.println();
    out.println();
    
    i = 0;
    while(i <= 50)
    {
      out.print(i18);
      i++;
    }
    
    
    in.close();
    out.close();
    
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