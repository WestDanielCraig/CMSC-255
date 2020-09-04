/*******************************************************************
* Programming Project-6                                            *
* @author Daniel C. West                                           *
* @version 19 April 2018                                           *
* CSMC 255, Section 1, Spring 2018                                 *
*------------------------------------------------------------------*
/*******************************************************
*WheelSize enumeration                                 *
*------------------------------------------------------*
* Function: Holds constants to be used for wheel sizes.*
* -----------------------------------------------------*
*******************************************************/
public enum WheelSize { //Start enum
  TEN(10),
    TWELVE(12),
    FOURTEEN(14),
    SIXTEEN(16),
    EIGHTEEN(18),
    TWENTY(20),
    TWENTY4(24),
    TWENTY6(26),
    TWENTY9(29);
  
  private final int size; //Variable to hold size as int
  
  /*******************************************************
  *WheelSize Constructor                                 *
  *------------------------------------------------------*
  * Function: Creates a constructor to access int values.*
  * -----------------------------------------------------*
  * @param int value that goes with the enum constant    *
  *******************************************************/
  private WheelSize(int numSize) { //Start constructor
    size = numSize;
  } //End constructor
  
  /*******************************************************
  *getValue method                                       *
  *------------------------------------------------------*
  * Function: gets int value for each enum constant      *
  * -----------------------------------------------------*
  * @return the int size                                 *
  *******************************************************/
  public int getValue() { //Start method
    return size;
  } //End method
} //End enum