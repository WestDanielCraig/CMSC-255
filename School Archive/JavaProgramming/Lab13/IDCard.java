public class IDCard extends Card
{
  private String idNum;
  
  public IDCard(String n, String idNum)
  {
   super(n);
   this.idNum = idNum;
  }
  
  public String getName()
  {
   return super.getName(); 
  }
  
  public String toString()
  {
   return super.toString() + "ID Number: " + idNum; 
  }
  
}