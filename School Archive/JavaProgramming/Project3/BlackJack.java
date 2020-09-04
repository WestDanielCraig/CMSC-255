/*******************************************************************
* Programming Project 3 - BlackJack                                *
* @author Daniel C. West                                           *
* @version 20Feb2018                                               *
* CSMC 255, Section 1, Spring 2018                                 *
*------------------------------------------------------------------*
* Function:                                                        *
*   This program will play a game a blackjack against the computer *
*   Cards have a value from 2-11 and all cards are equally likely  *
*     to be drawn                                                  *
*   The player will draw two cards and be displayed, while the     *
*     dealer will also draw two cards with one hidden              *
*   The player can draw a new card as many times as they like, and *
*     the dealer draws until he beats the player or busts          *
*   Dealer always wins a tie
*******************************************************************/
import java.util.Scanner; //Import scanner class
import java.util.Random;  //Import random class


public class BlackJack //Create public class BlackJack
{ //Start Class

  /*******************************************************************
  * Main Method                                                      *
  * -----------------------------------------------------------------*
  * Function:                                                        *
  *   Outputs printHeading, allows player to start or end game,      *
  *   allows player to hit or stay through loops, also allows dealer *
  *   to hit or stay depending on what their total is                *
  *******************************************************************/
  public static void main(String [] args)
  { //Start Main
    
    printHeading(); //Calls printHeading
    
    /*****************************************************************
    * Declare Variables:                                             *
    *   playGameAnswer - variable to hold yes or no choice to play   *
    *       blackjack at the beginning.                              *
    *   hitOrStay - variable to hold hit or stay choice as an H or S *
    *   playerFirstCar - variable to hold value of the player's first*
    *       card drawn at the beginning of the game.                 *
    *   playerSecondCard - variable to hold value of the player's    *
    *       second card drawn at the beginning of the game           *
    *   playerHitCard - variable to hold value of all the player's   *
    *       hit cards.                                               *
    *   dealerFirstCard - variable to hold value of the dealer's     *
    *       first card drawn at the beginning of the game.           *
    *   dealersSecondCard - variable to hold value of the dealer's   *
    *       second card drawn at the beginning of the game.          *
    *   dealersHitCard - variable to hold value of all the dealer's  *
    *       hit cards                                                *
    *   playerTotal - variable to hold total player's card value     *
    *   dealerTotal - variable to hold total dealer's card value     *
    *   END_LOOP_VALUE - constant to hold a value to end while loops *
    *       when needed in the code                                  *
    *****************************************************************/
    String playGameAnswer;          //Start or End Game Choice
    String hitOrStay;               //Hit or Stay Choice
    
    final int END_LOOP_VALUE = 22;  //Value to end several loops in program
    
    int playerFirstCard;            //Hold Player First Card Value
    int playerSecondCard;           //Hold Player Second Card Value
    int playerHitCard;              //Hold Player Hit Card Value
    
    int dealerFirstCard;            //Hold Dealer First Card Value
    int dealerSecondCard;           //Hold Dealer Second Card Value
    int dealerHitCard;              //Hold Dealer Hit Card Value
    
    int playerTotal;                //Hold Player Total
    int dealerTotal;                //Hold Dealer Total
    
    Scanner scan = new Scanner(System.in); //Creates a scanner object to read user inputs
    
    System.out.print("Would you like to play blackjack? Press Y for Yes and N for No: "); //Player Option to Start Playing
    
    /*****************************************************************
    * @code While Loop: do until user enters a valid Y or N          *
    *****************************************************************/
    while(!scan.hasNext("[YN]"))
    { //Start while loop
     System.out.print("Please press Y or N: "); //Ask User Again for Y or N
     scan.next();                               //Scans Next String
    } //End while loop
    playGameAnswer = scan.next();               //Holds Y or N Answer From User

    /*****************************************************************
    * @code If Statement: Executed when Player Answers Y to play     *
    *****************************************************************/
    if(playGameAnswer.equals("Y"))
    { //Start if      
      /*****************************************************************
      * @code While Loop: Do While playGameAnswer is Y                 *
      *****************************************************************/
      while(playGameAnswer.equals("Y"))
      { //Start while loop
        Random rand = new Random();                //Random generator to generate int for variables
        playerFirstCard = rand.nextInt(11) + 1;    //Generates random value between 1 and 11 for players first card
        playerSecondCard = rand.nextInt(11) + 1;   //Generates random value between 1 and 11 for players second card
        
        dealerFirstCard = rand.nextInt(11) + 1;    //Generates random value between 1 and 11 for dealer first card
        dealerSecondCard = rand.nextInt(11) + 1;   //Generates random value between 1 and 11 for dealer second card
        
        playerTotal = playerFirstCard + playerSecondCard; //Adds players first and second card to hold total
        dealerTotal = dealerFirstCard + dealerSecondCard; //Adds dealers first and second card to hold total
        
        /*****************************************************************
        * @code If Statement: execute if players first two random numbers*
        *     are 11s. Subtract one from 22 so the player starts with 21 *
        *****************************************************************/
        if(playerTotal == 22)
        { //Start if
          playerTotal = playerTotal - 1;
        } //End if
        
        /*****************************************************************
        * @code If Statement: execute if dealers first two random numbers*
        *     are 11s. Subtract one from 22 so the dealer starts with 21 *
        *****************************************************************/
        if(dealerTotal == 22);
        { //Start if
          dealerTotal = dealerTotal - 1;
        } //End if
        
        /*****************************************************************
        * Output for players two starting card values and toatl and      *
        *     dealers first starting care but does not show dealers      *
        *     second card or total.                                      *
        *****************************************************************/
        System.out.println("Player's first card is: " + playerFirstCard);
        System.out.println("Player's second card is: " + playerSecondCard);
        System.out.println("Player's total is: " + playerTotal + "\n");
        System.out.println("Dealer's first card is: " + dealerFirstCard);
        System.out.println("Dealer's second card is: hidden");
        System.out.println("Dealer's total is: hidden\n");
        
        /*****************************************************************
        * @code If Statement: executes if dealer starts with blackjack   *
        *     because when dealer starts with blackjack, player cannot   *
        *     beat dealer.
        *****************************************************************/
        if(dealerTotal == 21)
        { //Start if
          System.out.println("Dealer has BlackJack, dealer wins");
        } //End if
        
        /*****************************************************************
        * @code While Loop: Loop keeps going if player total is 21 and   *
        *     the dealer total is less than 21                           *
        *****************************************************************/
        while(playerTotal == 21 && dealerTotal < 21)
        { //Start while loop
          System.out.println("Player has BlackJack, dealer will hit until he has 17 or higher"); //Tells player he has blackjack and the dealer keeps going until he gets 17 or higher
          
          dealerHitCard = rand.nextInt(11) + 1;      //Generate random number between 1 and 11 for dealer hit card value
          dealerTotal = dealerTotal + dealerHitCard; //Add dealer hit card to dealer total
          
          /*****************************************************************
          * @code If Statement: execute if dealer has less than 17 total   *
          *****************************************************************/
          if(dealerTotal < 17)
          { //Start if
            System.out.println("Dealer has " + dealerTotal + " dealer will hit again"); //Output dealer total and that he will hit again
          } //End if
          
          /*****************************************************************
          * @code Else If Statement: execute if dealer has greater than 21 *
          *****************************************************************/
          else if(dealerTotal > 21)
          { //Start else if
            System.out.println("Dealer has " + dealerTotal + " dealer busts, player wins"); //Output dealer total and that dealer busted
          } //End else if
          
          /*****************************************************************
          * @code Else If Statement: execute if dealer total equals 21     *
          *****************************************************************/
          else if(dealerTotal == 21)
          { //Start else if
            System.out.println("Dealer has 21, dealer wins"); //Output dealer hit 21 and that he wins
          } //End else if
          
          /*****************************************************************
          * @code Else If Statement: execute dealer total is greater than  *
          *     or equal to 17 AND dealer total is less than player total  *
          *     AND dealer total is less than 21, used to make sure dealer *
          *     will stop hitting after 17                                 *
          *****************************************************************/
          else if(dealerTotal >= 17 && dealerTotal < playerTotal && dealerTotal < 21)
          { //Start else if
            System.out.println("Dealer has " + dealerTotal + ", dealer will stay, player wins"); //Output dealer total and that player wins
            dealerTotal = END_LOOP_VALUE; //Dealer total changed so another loop will not execute and the user will just be prompted to start another game
          } //End else if
        } //End While Loop
        
        /*****************************************************************
        * @code While Loop: Loop keeps going if player total is less than*
        *     21 AND dealer total does not equal 21                      *
        *****************************************************************/
        while(playerTotal < 21 && dealerTotal != 21)
        { //Start while loop
          System.out.print("Would you like to hit or stay? Press H to hit or S to stay: "); //Output question for user to take another card or stay
          
          /*****************************************************************
          * @code While Loop: do until player enter a valid H or S         *
          *****************************************************************/
          while(!scan.hasNext("[HS]"))
          { //Start while loop
            System.out.print("Please enter H or S: "); //Output if player does not enter valid H or S
            scan.next();                               //Scans next string pplayer inputs
          } //End while loop
          hitOrStay = scan.next(); //Stores next string in hitOrStay variable
          
          /*****************************************************************
          * @code While Loop: do while player answers H for hit            *
          *****************************************************************/
          while(hitOrStay.equals("H"))
          { //Start while loop
            playerHitCard = rand.nextInt(11) + 1;      //Generate random care for player between 1 and 11 and assign it to playerHitCard variable
            playerTotal = playerTotal + playerHitCard; //Add player hit card to player total
            
            System.out.println("Player's hit card is: " + playerHitCard); //Output player hit care value            
            System.out.println("Player has: " + playerTotal);             //Output player new total
            
            /*****************************************************************
            * @code If Statement: execute if player total is greater than 21 *
            *****************************************************************/
            if(playerTotal > 21)
            { //Start if
              System.out.println("\nPlayer busts, dealer wins"); //Output player busts and dealer wins
              System.out.println("Dealer had: " + dealerTotal);  //Output dealer hidden total
              hitOrStay = "S";                //Assign S to player hitOrStay variable to exit the loop
              dealerTotal = ++playerTotal;    //Assign dealer total 1 higher than player total to fall through to the end of the program
              playerTotal = END_LOOP_VALUE;   //Assign player total to constant to fall through to the end of the program
            } //End if
            
            /******************************************************************
            * @code Else If Statement: execute if player total is less than 21*
            ******************************************************************/
            else if(playerTotal < 21)
            { //Start else if
              System.out.print("\nH or S: "); //Output to player if they would like to hit or stay again
            } //End else if
            
            /*****************************************************************
            * @code Else If Statement: execute if player total equals 21     *
            *****************************************************************/
            else if(playerTotal == 21)
            { //Start else if
             System.out.println("Player total is: " + playerTotal + ", I suggest you enter S to stay"); //Output player total and suggest they might want to stay because they have 21
            } //End else if            
            
            /*****************************************************************
            * @code If Statement: execute if player total is less than or    *
            *     equal to 21 OR hitOrStay variable does not equal S         *
            *****************************************************************/
            if(playerTotal <= 21 || !hitOrStay.equals("S"))
            { //Start if
              
              /*****************************************************************
              * @code While Loop: do until user enter valid H or S             *
              *****************************************************************/
              while(!scan.hasNext("[HS]"))
              { //Start while loop
                System.out.print("Please enter H or S: "); //Output to ask user for valid H or S
                scan.next();                               //Scans next string entered by user
              } //End while loop
              hitOrStay = scan.next();  //Holds value for next H or S input by user
            } //End if
          } //End while loop
          
          
          /*****************************************************************
          * @code If Statement: execute if player enter S for hitOrStay    *
          *     variable AND player total is greater than or equal to      *
          *     dealer total                                               *
          *****************************************************************/
          if(hitOrStay.equals("S") && playerTotal >= dealerTotal)
          { //Start if
            System.out.println("Player will stay"); //Output that player decided to stay         
            
            /*****************************************************************
            * @code If Statement: execute if player total equals dealer total*
            *****************************************************************/
            if(playerTotal == dealerTotal)
            { //Start if
              System.out.println("Dealer has: " + dealerTotal); //Output what the dealer has after player stays
              
              //Busts both player and dealer values so loop will end and prompt to start another game
              playerTotal = END_LOOP_VALUE; 
              dealerTotal = END_LOOP_VALUE;
              
              System.out.println("Dealer ties player, dealer wins"); //Output dealer wins after player and dealer tie
            } //End if
            
            /******************************************************************
            * @code Else If Statement: execute if dealer total is greater than*
            *     or equal to 17 AND dealer total is less than 21             *
            ******************************************************************/
            else if(dealerTotal >= 17 && dealerTotal < 21)
            { //Start else if
              System.out.println("Dealer has: " +dealerTotal + ", and stays with 17 or higher, player wins"); //Output dealer total and that he must stay if his total is between 17 and 21
              
              //Busts both player and dealer values so loop will end and prompt to start another game
              playerTotal = END_LOOP_VALUE;
              dealerTotal = END_LOOP_VALUE;
            } //End else if
          
            /*****************************************************************
            * @code While Loop: do until dealer total is less than player    *
            *     total OR player total is not equal to the END_LOOP_VALUE   *
            *     constant                                                   *
            *****************************************************************/
            while(dealerTotal < playerTotal || playerTotal != END_LOOP_VALUE)
            { //Start while loop
              System.out.println("Dealer has: " + dealerTotal + ", dealer will hit"); //Ouput dealer toatl and that he will hit
              
              dealerHitCard = rand.nextInt(11) + 1;       //Generate random number for dealer hit care between 1 and 11
              dealerTotal = dealerTotal + dealerHitCard;  //Add dealer hit card to dealer total
              
              System.out.println("Dealer now has: " + dealerTotal); //Output new dealer total
              
              /*****************************************************************
              * @code If Statement: execuse if dealer total equals 21          *
              *****************************************************************/
              if(dealerTotal == 21)
              { //Start if
                System.out.println("Dealer wins"); //Ouput dealer wins with 21
                
                //Busts both player and dealer values so loop will end and prompt to start another game
                playerTotal = END_LOOP_VALUE;
                dealerTotal = END_LOOP_VALUE;
              } //End if
              
              /*****************************************************************
              * @code Else If Statement: execute if dealer total is greater    *
              *     than 21                                                    *
              *****************************************************************/
              else if(dealerTotal > 21)
              { //Start else if
                System.out.println("Dealer has: " + dealerTotal + ", dealer busts, player wins");
                playerTotal = END_LOOP_VALUE;
              } //End else if
              
              /*****************************************************************
              * @code Else If Statement: execute if dealer total is greater    *
              *     than or equal to 17 AND dealer total is less than 21 AND   *
              *     dealer total is greater than or equal to player total      *
              *****************************************************************/
              else if(dealerTotal >= 17 && dealerTotal < 21 && dealerTotal >= playerTotal)
              { //Start else if
                System.out.println("Dealer total is: " + dealerTotal + ", player total is: " + playerTotal + ", dealer wins"); //Output dealer total and player total and that dealer wins
                
                //Busts both player and dealer values so loop will end and prompt to start another game
                playerTotal = END_LOOP_VALUE;
                dealerTotal = END_LOOP_VALUE;
              } //End else if
              
              /*****************************************************************
              * @code Else If Statement: execute if dealer total is equal to   *
              *     player total                                               *
              *****************************************************************/
              else if(dealerTotal == playerTotal)
              { //Start else if
                System.out.println("Dealer total is: " + dealerTotal + ", player total is: " + playerTotal + ", dealer wins"); //Output dealer total and player total and that dealer wins
                
                //Busts both player and dealer values so loop will end and prompt to start another game
                playerTotal = END_LOOP_VALUE;
                dealerTotal = END_LOOP_VALUE;
              } //End else if
              
              /*****************************************************************
              * @code Else If Statement: execute if dealer total is greater    *
              *     than player total                                          *
              *****************************************************************/
              else if(dealerTotal > playerTotal)
              { //Start else if
                System.out.println("Dealer total is: " + dealerTotal + ", player total is: " + playerTotal + ", dealer wins"); //Output dealer and player total and that dealer wins
                
                //Busts both player and dealer values so loop will end and prompt to start another game
                playerTotal = END_LOOP_VALUE;
                dealerTotal = END_LOOP_VALUE;
              } //End else if
              
              /*****************************************************************
              * @code Else If Statement: execute if dealer total is greater    *
              *     than or equal to 17 AND dealer total is less than 21 AND   *
              *     dealer total is less than player total                     *
              *****************************************************************/
              else if(dealerTotal >= 17 && dealerTotal < 21 && dealerTotal < playerTotal)
              { //Start else if
                System.out.println("Dealer total is: " + dealerTotal + ", player total is: " + playerTotal + ", player wins"); //Out put dealer and player total and that player wins
                
                //Busts both player and dealer values so loop will end and prompt to start another game
                playerTotal = END_LOOP_VALUE;
                dealerTotal = END_LOOP_VALUE;
              } //End else if                
            } //End while loop          
          } //End if
          
          /*****************************************************************
          * @code Else If Statement: execute if player says S for stay AND *
          *     player total is less than dealer total AND player total    *
          *     does not equql the END_LOOP_CONSTANT                       *
          *****************************************************************/
          else if(hitOrStay.equals("S") && playerTotal < dealerTotal && playerTotal != END_LOOP_VALUE)
          { //Start else if
            System.out.println("Player has: " + playerTotal + ", dealer has: " + dealerTotal); //Output player and dealer totals
            System.out.println("Player has less than dealer, dealer wins");                    //Output that player has less than the dealer and dealer wins
            
            //Set player total to END_LOOP_VALUE constant to fall to end of program and prompt to play again
            playerTotal = END_LOOP_VALUE;
          } //End else if          
        } //End while loop
        System.out.print("\nWould you like to play again Y or N?: "); //Output to ask player to play again
        
        /*****************************************************************
        * @code While Loop: do loop to validate user input for Y and N   *
        *****************************************************************/
        while(!scan.hasNext("[YN]"))
        { //Start while loop
          System.out.print("Please press Y or N: "); //Output for validate user input as Y or N
          scan.next();                               //Scan next string user inputs
        } //End while loop
        playGameAnswer = scan.next(); //Assign next scan to user input
        
      } //End while loop      
      System.out.println("Have a nice day!"); //Output for goodbye if the user
    } //End if
   
    /*****************************************************************
    * @code Else If Statement: execute if player says N and not Y    *
    *****************************************************************/
    else if(playGameAnswer.equals("N"))
    { //Start else if
      System.out.println("Have a nice day!"); //Output for good to the user 
    } //End else if
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
    System.out.println("Programming Project 3");           //Program Number
    System.out.println("BlackJack");                       //Program Name
    System.out.println(); //Line created for console display appeal
   
  } //End printHeading
   
} //End Class