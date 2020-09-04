/*******************************************************************
* Programming Lab 6                                                *
* @author Daniel C. West                                           *
* @version 26Feb2018                                               *
* CSMC 255, Section 1, Spring 2018                                 *
*------------------------------------------------------------------*
* Function:                                                        *
*                                                                  *
*                                                                  *
*******************************************************************/
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class SoccerStats
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
    
    File inputFile = new File("SoccerStatsBonus.txt");
    Scanner in = new Scanner(inputFile);
    PrintWriter out = new PrintWriter("SoccerSummary.txt");
    
    //Variables
    String winningTeam = null;
    String losingTeam = null;    
    int highestGoals = 0;
    int lowestGoals = Integer.MAX_VALUE;    
    double totalShots = 0;    
    int shotCounter = 0;   
    
    //Pulling info from .txt file line by line
    while (in.hasNextLine())
    {
      String line = in.nextLine();
      
      //Reading lines into two different strings
      int i = 0;
      while (!Character.isDigit(line.charAt(i))) 
      { 
        i++; 
      }
      String teamName = line.substring(0, i);
      String goalsAndShots = line.substring(i);
      
      //Reading substrings into two other substrings 
      int j = 0;
      while(!Character.isWhitespace(goalsAndShots.charAt(j))) 
      { 
        j++;      
      }
      String goals = goalsAndShots.substring(0, j);
      String shots = goalsAndShots.substring(j);
     
      //Counter to be used at the end to find the average shots taken
      shotCounter++;
      
      //Getting rid of whitesapce to prep for turning them into int, and double
      goalsAndShots = goalsAndShots.trim();
      goals = goals.trim();
      shots = shots.trim();  
      teamName = teamName.trim();      
      
      //Turn into int, and double from being a string
      int numGoals = Integer.parseInt(goals);
      double numShots = Double.parseDouble(shots);
      
      //Find higest goals scored by a team, and lowest scored
      if(numGoals > highestGoals)
      {
       highestGoals = numGoals;
       winningTeam = teamName;
      } 
      else if(numGoals < lowestGoals)
      {
       lowestGoals = numGoals; 
       losingTeam = teamName;
      }
      
      //Keeping track of running total of shots to calculate the average later
      totalShots = totalShots + numShots;
      
    }
    
    //calculate the aver shots taken divied by the shot counter
    double averageShots = totalShots / shotCounter;
    
    //Printing all information to the .txt document
    out.println("Maximum Goals Scored: " + winningTeam + " " + highestGoals);
    out.println("Minimum Goals Scored: " + losingTeam + " " + lowestGoals);
    out.printf("Average Shots Per Game: %.3f%n", averageShots);

    //Close input and output .txt files
    in.close();
    out.close();    
    
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
    System.out.println("Programming Lab 6");               //Program Number
    System.out.println("Lab 6");                           //Program Name
    System.out.println(); //Line created for console display appeal
   
   
  } //End printHeading
   
} //End Class