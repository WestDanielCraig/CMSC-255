/*******************************************************************
* Programming Lab 4 - Selection                                          *
* @author Daniel C. West                                           *
* @version 17Feb2018                                               *
* CSMC 255, Section 1, Spring 2018                                 *
*------------------------------------------------------------------*
* Function:                                                        *
*                                                                  *
*                                                                  *
*******************************************************************/
import java.util.Scanner;
import java.lang.Math;

public class Selection
{ //Start Selection Class

  /*******************************************************************
  * Main Method                                                      *
  * -----------------------------------------------------------------*
  * Function:                                                        *
  *   Outputs printHeading,                                          *
  *******************************************************************/
  public static void main(String [] args)
  { //Start Main
    
    Scanner scan = new Scanner(System.in);
    
    printHeading(); //Calls printHeading
    
    String letterChoice;
    letterChoice = null;
        
    System.out.print("Enter a single capital letter, and I will tell you what the ");
    System.out.print("corresponding digit is on the telephone: ");
    
	while(!scan.hasNext("[ABCDEFGHIJKLMNOPQRSTUVWXYZ]"))	
	{
		
		System.out.print("That is not a single capital letter, try again: ");
		scan.next();
	}
    	letterChoice = scan.next();

		if("A".equals(letterChoice)){
    		System.out.println("The digit 2 corresponds to the letter A on the telephone");
    	} else if("B".equals(letterChoice) || "C".equals(letterChoice)){
        	System.out.println("The digit 2 corresponds to the letter B on the telephone");
    	} else if("C".equals(letterChoice)){
        	System.out.println("The digit 2 corresponds to the letter C on the telephone");
    	} else if("D".equals(letterChoice)){
        	System.out.println("The digit 3 corresponds to the letter D on the telephone");
    	} else if("E".equals(letterChoice)){
        	System.out.println("The digit 3 corresponds to the letter E on the telephone");
    	} else if("F".equals(letterChoice)){
        	System.out.println("The digit 3 corresponds to the letter F on the telephone");
    	} else if("G".equals(letterChoice)){
        	System.out.println("The digit 4 corresponds to the letter G on the telephone");
    	} else if("H".equals(letterChoice)){
        	System.out.println("The digit 4 corresponds to the letter H on the telephone");
    	} else if("I".equals(letterChoice)){
        	System.out.println("The digit 4 corresponds to the letter I on the telephone");
    	} else if("J".equals(letterChoice)){
        	System.out.println("The digit 5 corresponds to the letter J on the telephone");
    	} else if("K".equals(letterChoice)){
        	System.out.println("The digit 5 corresponds to the letter K on the telephone");
    	} else if("L".equals(letterChoice)){
        	System.out.println("The digit 5 corresponds to the letter L on the telephone");
    	} else if("M".equals(letterChoice)){
        	System.out.println("The digit 6 corresponds to the letter M on the telephone");
    	} else if("N".equals(letterChoice)){
        	System.out.println("The digit 6 corresponds to the letter N on the telephone");
    	} else if("O".equals(letterChoice)){
        	System.out.println("The digit 6 corresponds to the letter O on the telephone");
    	} else if("P".equals(letterChoice)){
        	System.out.println("The digit 7 corresponds to the letter P on the telephone");
    	} else if("Q".equals(letterChoice)){
        	System.out.println("The digit 7 corresponds to the letter Q on the telephone");
    	} else if("R".equals(letterChoice)){
        	System.out.println("The digit 7 corresponds to the letter R on the telephone");
    	} else if("S".equals(letterChoice)){
        	System.out.println("The digit 7 corresponds to the letter S on the telephone");
    	} else if("T".equals(letterChoice)){
        	System.out.println("The digit 8 corresponds to the letter T on the telephone");
    	} else if("U".equals(letterChoice)){
        	System.out.println("The digit 8 corresponds to the letter U on the telephone");
    	} else if("V".equals(letterChoice)){
        	System.out.println("The digit 8 corresponds to the letter V on the telephone");
    	} else if("W".equals(letterChoice)){
        	System.out.println("The digit 9 corresponds to the letter W on the telephone");
    	} else if("X".equals(letterChoice)){
        	System.out.println("The digit 9 corresponds to the letter X on the telephone");
    	} else if("Y".equals(letterChoice)){
        	System.out.println("The digit 9 corresponds to the letter Y on the telephone");
    	} else if("Z".equals(letterChoice)){
        	System.out.println("The digit 9 corresponds to the letter Z on the telephone");
    	}
		
    
    System.out.println("Thanks for playing!");    
    
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
    System.out.println("Programming Lab 4");               //Program Number
    System.out.println("Selection Lab");                   //Program Name
    System.out.println(); //Line created for console display appeal
   
   
  } //End printHeading
   
} //End Class