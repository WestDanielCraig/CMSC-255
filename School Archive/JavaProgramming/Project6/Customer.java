/*******************************************************************
* Programming Project-6                                            *
* @author Daniel C. West                                           *
* @version 19 April 2018                                           *
* CSMC 255, Section 1, Spring 2018                                 *
*------------------------------------------------------------------*
* Function:                                                        *
*    This class file will take all the customers information, like *
* first and last name, phone number, email, and bike owned. Then   *
* prings all the information input out to the screen for tracking  *
* *****************************************************************/
import java.util.*;

public class Customer { //Start Class
  //Variable declerations
  private String firstName;
  private String lastName;
  private String eMail;
  private String phoneNum;
  private Bicycle bicycle;
 
  /*******************************************************
  *Customer Constructor                                  *
  *------------------------------------------------------*
  * Function: Creates a constructor to set initial values*
  *******************************************************/
  public Customer() { //Start constructor
   firstName = "Tory";
   lastName = "Welds";
   eMail = "wrecker8@gmail.com";
   phoneNum = "(568)345-6789";
   bicycle = new Bicycle();    
  } //End Constructor
  
  /*******************************************************
  *Paramaterized Customer Constructor                    *
  *------------------------------------------------------*
  * Function: Creates a constructor to assign strings to *
  *     three variables.                                 *
  * -----------------------------------------------------*
  * @param String phone                                  *
  * @param String firstName                              *
  * @param String lastName                               *
  *******************************************************/
  public Customer(String phone, String firstName, String lastName) { //Start constructor
   this.setPhoneNum(phone);
   this.setName(firstName, lastName);
  } //End constructor
 
  /*******************************************************
  *getFirstName method                                   *
  *------------------------------------------------------*
  * Function: returns firstName variable                 *
  * -----------------------------------------------------*
  * @return String firstName                             *
  *******************************************************/
  public String getFirstName() { //Start method
    return firstName;
  } //End method
  
  /*******************************************************
  *getLastName method                                    *
  *------------------------------------------------------*
  * Function: returns lastName variable                  *
  * -----------------------------------------------------*
  * @return String lastName                              *
  *******************************************************/
  public String getLastName() { //Start method
    return lastName;
  } //End method
  
  /*******************************************************
  *geteMail method                                       *
  *------------------------------------------------------*
  * Function: returns eMail variable                     *
  * -----------------------------------------------------*
  * @return String eMail                                 *
  *******************************************************/
  public String geteMail() { //Start method
    return eMail;
  } //End method
  
  /*******************************************************
  *getPhone method                                       *
  *------------------------------------------------------*
  * Function: returns phoneNum variable                  *
  * -----------------------------------------------------*
  * @return String phoneNum                              *
  *******************************************************/
  public String getPhone() { //Start method
    return phoneNum;
  } //End method
  
  /*******************************************************
  *getCustBike method                                    *
  *------------------------------------------------------*
  * Function: returns bicycle variable                   *
  * -----------------------------------------------------*
  * @return String bicycle                               *
  *******************************************************/
  public Bicycle getCustBike() { //Start method
    return bicycle;
  } //End method
  
  /*******************************************************
  *setName method                                        *
  *------------------------------------------------------*
  * Function: take two strings and assigns them to first *
  *     and last name instance variables                 *
  * -----------------------------------------------------*
  * @param String firstName                              *
  * @param String lastName                               *
  *******************************************************/
  public void setName(String firstName, String lastName) { //Start method
    /*****************************************************************
    * @code If Statement: Executed when first name was not entered   *
    *****************************************************************/
    if(firstName == null || firstName.length() == 0) { //Start if
      throw new IllegalArgumentException("Must enter a first name to proceed");
    } //End if
    this.firstName = firstName;
    /*****************************************************************
    * @code If Statement: Executed when last name was not entered    *
    *****************************************************************/
    if(lastName == null || lastName.length() == 0) { //Start if
      throw new IllegalArgumentException("Must enter a last name to poceed");
    } //End if
    this.lastName = lastName;
  } //End method
  
  /*******************************************************
  *seteMail method                                       *
  *------------------------------------------------------*
  * Function: assigns a string to eMail instance variable*
  * -----------------------------------------------------*
  * @param String eMail                                  *
  *******************************************************/
  public void seteMail(String eMail) { //Start method
    this.eMail = eMail;  
  } //End method
  
  /*******************************************************
  *setPhoneNum method                                    *
  *------------------------------------------------------*
  * Function:  assigns a string to phoneNum instance var *
  * -----------------------------------------------------*
  * @param String phoneNum                               *
  *******************************************************/
  public void setPhoneNum(String phoneNum) { //Start method
    /*****************************************************************
    * @code If Statement: Executed when phoneNum was not entered     *
    *****************************************************************/
    if(phoneNum == null || phoneNum.length() == 0) { //Start if
     throw new IllegalArgumentException("Must enter a valid phone number");
    } //End if
    this.phoneNum = phoneNum;
  } //End method
  
  /*******************************************************
  *setCustBike method                                    *
  *------------------------------------------------------*
  * Function:  assigns a Bicycle para to bicycle variable*
  * -----------------------------------------------------*
  * @param String bicycle                                *
  *******************************************************/
  public void setCustBike(Bicycle bicycle) { //Start method
    this.bicycle = bicycle;
  } //End method
 
  /*******************************************************
  *toString method                                       *
  *------------------------------------------------------*
  * Function:  prints out all variables to string output *
  * -----------------------------------------------------*
  * @return String output                                *
  *******************************************************/  
  public String toString() { //Start method
    String banner = "****************************************************************";
    
    String output = banner + "\n" +
      "Customer: " + firstName + " " + lastName + "\n" +
      "Phone: " + phoneNum + "\n" +
      "Email: " + eMail + "\n" +
      bicycle + "\n";
    /*****************************************************************
    * @code If Statement: Executed if bicycle or eMail are left out  *
    *****************************************************************/
    if(bicycle == null && eMail == null) { //Start if
      output = banner + "\n" +
        "Customer: " + firstName + " " + lastName + "\n" +
        "Phone: " + phoneNum + "\n" +
        "Email: \n";
    } //End if
    /*****************************************************************
    * @code Else If Statement: Executed if bicycle if left out       *
    *****************************************************************/
    else if(bicycle == null) { //Start if
      output = banner + "\n" +
        "Customer: " + firstName + " " + lastName + "\n" +
        "Phone: " + phoneNum + "\n" +
        "Email: " + eMail + "\n";
    } //End if   
    /*****************************************************************
    * @code Else If Statement: Executed if eMail if left out         *
    *****************************************************************/
    else if(eMail == null) { //Start if
      output = banner + "\n" +
        "Customer: " + firstName + " " + lastName + "\n" +
        "Phone: " + phoneNum + "\n" +
        "Email: \n" +
        bicycle + "\n";
    } //End if
    return output;      
  } //End method  
} //End class