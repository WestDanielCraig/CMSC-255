/*******************************************************************
* Programming Project  -                                           *
* @author Daniel C. West                                           *
* @version 27Jan2018                                               *
* CSMC 255, Section 1, Spring 2018                                 *
*------------------------------------------------------------------*
* Function:                                                        *
*                                                                  *
*                                                                  *
*******************************************************************/
import java.util.Scanner;
import java.util.Random;

public class Iteration
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
    
	Scanner scan = new Scanner(System.in);
    
    int playGame;
    
    System.out.print("Would You Like To Play The Guessing Game? Hit 1 = Yes, 2 = No: ");
    
    while(!scan.hasNextInt())
    {
    	System.out.print("Please enter 1 for Yes or 2 for No: ");
    	scan.next();    
    }
    
    playGame = scan.nextInt();
    
    while(playGame < 1 || playGame > 1)
    {
    	
    	if(playGame == 2)
    	{
    		System.out.println("Goodbye!");
    		System.exit(2);
    	}
    	System.out.print("Please enter 1 for Yes or 2 for No: ");
    	playGame = scan.nextInt();
    }
    
    while(playGame >= 1 && playGame <= 1)
    {
    
    	Random rand = new Random();
    	int randomNum = rand.nextInt(100) + 1;   
   
    	int guessCount = 0;
    
    	System.out.print("Please guess a number between 1-100: ");
    	int guessNum = scan.nextInt();
    	
    	if(guessNum < 0)
    	{
    		System.exit(0);
    	}
    	
    
    	if(guessNum < randomNum)
    	{
    		System.out.println("Too Low");
    	} else if(guessNum > randomNum)
    	{
    		System.out.println("Too High");
    	}
    
    		while(guessNum != randomNum)
    		{
    		
    			System.out.print("Please guess again: ");
    			guessNum = scan.nextInt();
    				guessCount++;
    			if(guessNum < 0)
    			{
    				System.exit(0);
    			}
    			if(guessNum < randomNum)
    			{
    				System.out.println("Too Low");
    			} else if(guessNum > randomNum)
    			{
    				System.out.println("Too High");
    			}
    		}
    	
    	if(guessNum == randomNum)
    		{
    			System.out.println("Thats Right!");
    		}
    
    	System.out.println("Random Number Is: "+ randomNum);
    	System.out.println("Guess Number Is: "+ guessNum);
    	System.out.println("Guess Count was " + guessCount);
    
		System.out.print("Would You Like To Play Again? Hit 1 = Yes, 2 = No: ");
		playGame = scan.nextInt();
    }

    System.out.println("Goodbye!");
    
    
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
    System.out.println("Programming Lab 5");            //Program Number
    System.out.println("Lab 5");                                //Program Name
    System.out.println(); //Line created for console display appeal
   
   
  } //End printHeading
   
} //End Class