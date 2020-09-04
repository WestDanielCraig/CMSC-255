public class DebitCard extends Card
{
  private int cardNum;
  private int pin;
  
  public DebitCard(String n, int cardNum, int pin)
  {
   super(n);
   this.cardNum = cardNum;
   this.pin = pin;
  }
  
  public String toString()
  {
   return super.toString() + "\nCard Number: " + cardNum + "\nPin Number: " + pin;
  }
  
}