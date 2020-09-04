/*******************************************************************
* Programming Project-6                                            *
* @author Daniel C. West                                           *
* @version 19 April 2018                                           *
* CSMC 255, Section 1, Spring 2018                                 *
*------------------------------------------------------------------*
* Function: Builds a bicycle using all the specified parts         *
* *****************************************************************/
import java.lang.*;

public class Bicycle { //Start class
  //Initialize instance variables
  private int numGear;
  private Condition condition;
  private BikeType bikeType;
  private UserType userType;
  private String brand;
  private FrameMat frame;
  private BrakeType brakeType;
  private WheelSize wheelSize;
  private float weight;
  private String color;
  /*******************************************************
  *Bicycle Constructor                                   *
  *------------------------------------------------------*
  * Function: Creates a constructor to set initial values*
  *******************************************************/
  public Bicycle() { //Start constructor
    numGear = 4;
    bikeType = BikeType.Hybrid;
    condition = Condition.Used;
    userType = UserType.Boys;
    brand = "Mongoose";
    frame = FrameMat.Carbon;
    brakeType = BrakeType.Disc;
    wheelSize = WheelSize.TEN;
    weight = 8;
    color = "Red";    
  } //End constructor
  
  /*******************************************************
  *Paramaterized Bicycle Constructor                     *
  *------------------------------------------------------*
  * Function: Creates a constructor to construct a bike  *
  *     with 4 paramater variables.                      *
  * -----------------------------------------------------*
  * @param BikeType bikeType                             *
  * @param UserType userType                             *
  * @param FrameMat frame                                *
  * @param Condition condition                           *
  *******************************************************/
  public Bicycle(BikeType bikeType, UserType userType, FrameMat frame, Condition condition) { //Start constuctor
    this.bikeType = bikeType;
    this.userType = userType;
    this.frame = frame;
    this.condition = condition;  
  } //End constructor
  
  /*******************************************************
  *getNumGear method                                     *
  *------------------------------------------------------*
  * Function: returns the number of gears                *
  * -----------------------------------------------------*
  * @return int numGear                                   *
  *******************************************************/
  public int getNumGear() { //Start method
    return numGear;
  } //End method
  
  /*******************************************************
  *getCondition method                                   *
  *------------------------------------------------------*
  * Function: returns the condition                      *
  * -----------------------------------------------------*
  * @return Condition condition                           *
  *******************************************************/
  public Condition getCondition() { //Start method
    return condition; 
  } //End method
  
  /*******************************************************
  *getBikeType method                                    *
  *------------------------------------------------------*
  * Function: returns the bike type                      *
  * -----------------------------------------------------*
  * @return BikeType biketype                            *
  *******************************************************/
  public BikeType getBikeType() { //Start method
    return bikeType;
  } //End method
  
  /*******************************************************
  *getUserType method                                    *
  *------------------------------------------------------*
  * Function: returns the user type                      *
  * -----------------------------------------------------*
  * @return UserType userType                            *
  *******************************************************/
  public UserType getUserType() { //Start method
    return userType; 
  } //End method
  
  /*******************************************************
  *getBrand method                                       *
  *------------------------------------------------------*
  * Function: returns the brand                          *
  * -----------------------------------------------------*
  * @return String brand                                 *
  *******************************************************/
  public String getBrand() { //Start method
    return brand; 
  } //Start method
  
  /*******************************************************
  *getFrameMat method                                    *
  *------------------------------------------------------*
  * Function: returns the frame                          *
  * -----------------------------------------------------*
  * @return FrameMat frame                               *
  *******************************************************/
  public FrameMat getFrame() { //Start method
    return frame;
  } //End method
  
  /*******************************************************
  *getBrakeType method                                   *
  *------------------------------------------------------*
  * Function: returns the brake type                     *
  * -----------------------------------------------------*
  * @return BrakeType brakeType                          *
  *******************************************************/
  public BrakeType getBrakeType() { //Start method
    return brakeType; 
  } //End method
  
  /*******************************************************
  *getWheelSize method                                   *
  *------------------------------------------------------*
  * Function: returns the wheelSize                      *
  * -----------------------------------------------------*
  * @return WheelSize wheelSize                          *
  *******************************************************/
  public WheelSize getWheelSize() { //Start method
    return wheelSize;
  } //End method
  
  /*******************************************************
  *getWeight method                                      *
  *------------------------------------------------------*
  * Function: returns the weight                         *
  * -----------------------------------------------------*
  * @return float weight                                 *
  *******************************************************/
  public float getWeight() { //Start method
    return weight;
  } //End method
  
  /*******************************************************
  *getColor method                                       *
  *------------------------------------------------------*
  * Function: returns the color                          *
  * -----------------------------------------------------*
  * @return String color                                 *
  *******************************************************/
  public String getColor() { //Start method
    return color;
  } //End method
  
  /*******************************************************
  *setBikeType method                                    *
  *------------------------------------------------------*
  * Function: sets explicit equal to implicit            *
  * -----------------------------------------------------*
  * @param void bikeType                                 *
  *******************************************************/
  public void setBikeType(BikeType bikeType) { //Start method
    this.bikeType = bikeType;
  } //End method
  
  /*******************************************************
  *setGear method                                        *
  *------------------------------------------------------*
  * Function: sets numGear to passed parameter           *
  * -----------------------------------------------------*
  * @param void numGear                                  *
  *******************************************************/
  public void setGear(int gear) { //Start method
    /*****************************************************************
    * @code If Statement: Executed if gear number is negative        *
    *****************************************************************/
    if(gear < 0) { //Start if
      throw new IllegalArgumentException("Number of gears cannont be negative");
    } //End if
    this.numGear = numGear;
  } //End method
  
  /*******************************************************
  *setWheelSize method                                   *
  *------------------------------------------------------*
  * Function: sets wheelSize to passed parameter         *
  * -----------------------------------------------------*
  * @param void wheelSize                                *
  *******************************************************/
  public void setWheelSize(WheelSize wheelSize) { //Start method
    this.wheelSize = wheelSize;
  } //End method
  
  /*******************************************************
  *setWeight method                                      *
  *------------------------------------------------------*
  * Function: sets weight to passed parameter            *
  * -----------------------------------------------------*
  * @param void weight                                   *
  *******************************************************/
  public void setWeight(float weight) { //Start method
    /*****************************************************************
    * @code If Statement: Executed if weight is negative             *
    *****************************************************************/
    if(weight <= 0) { //Start if
      throw new IllegalArgumentException("Your weight cannont be less than or equal to zero");
    } //End if
    this.weight = weight;
  } //End method
  
  /*******************************************************
  *setBrake method                                       *
  *------------------------------------------------------*
  * Function: sets brakeType to passed parameter         *
  * -----------------------------------------------------*
  * @param void brakeType                                *
  *******************************************************/
  public void setBrake(BrakeType brakeType) { //Start method
    this.brakeType = brakeType;
  } //Start method
  
  /*******************************************************
  *setBrand method                                       *
  *------------------------------------------------------*
  * Function: sets brand to passed parameter             *
  * -----------------------------------------------------*
  * @param void brand                                    *
  *******************************************************/
  public void setBrand(String brand) { //Start method
    this.brand = brand;
  } //End method
  
  /*******************************************************
  *setColor method                                       *
  *------------------------------------------------------*
  * Function: sets color to passed parameter             *
  * -----------------------------------------------------*
  * @param void color                                    *
  *******************************************************/
  public void setColor(String color) { //Start method
   this.color = color; 
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
      "Bicycle: \n" +
      "Bicycle {Type = " + bikeType + ", " +
      "User = " + userType + ", " +
      "Frame = " + frame + ", \n" +
      "Brakes = " + brakeType + ", " +
      "Condition = " + condition + ", " +
      "WheelSize = " + wheelSize.getValue() + ", \n" +
      "Weight = " + weight + ", " +
      "NumGears = " + numGear + ", " +
      "Brand = " + brand + ", " +
      "Color = " + color + "}" + "\n" +
      banner + "\n";
    
    return output;
  } //End method     
} //End class
  
  
  
  
  
  
  
  
  
  