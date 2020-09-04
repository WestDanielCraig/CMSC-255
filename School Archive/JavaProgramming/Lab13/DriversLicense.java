public class DriversLicense extends IDCard
{
  private int year;
  
  public DriversLicense(String n, String m, int year)
  {
   super(n, m);
   this.year = year;
  }
  
  public String toString()
  {
   return super.toString() + "Expiration year: " + year; 
  }
}