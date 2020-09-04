public class Student {
  private String firstName;
  private int knowledge;
  private int exhaustion;
  private double funds;
  
  public Student(String name, int knowledge, int tiredness, double money) {
    firstName = name;
    setKnowledge(knowledge);
    setExhaustion(tiredness);
    setFunds(money);    
  }
  
  public Student(String name) {
    firstName = name;
    knowledge = 0;
    exhaustion = 0;
    funds = 0;   
  }
  
  public Student() {
    firstName = "John";
    knowledge = 0;
    exhaustion = 0;
    funds = 0;
  }
  
  public void setKnowledge(int knowledge) {
    if(knowledge >= 0) {
      this.knowledge = knowledge;
    }
  }
  
  public void setExhaustion(int exhaustion) {
    if(exhaustion >= 0) {
      this.exhaustion = exhaustion;
    }
  }
  
  public void setFunds(double funds) {
    if(funds >= 0) {
      this.funds = funds; 
    }
  }
  
  
  public String getFirstName() {
    return firstName; 
  }
  
  public int getKnowledge() {
    return knowledge;
  }
  
  public int exhaustion() {
    return exhaustion; 
  }
  
  public double getFunds() {
    return funds;
  }
  
  
  
  public void study() {
    knowledge++;
  }
  
  public void sleep() {
    exhaustion--; 
  }
  
  public void spend(double cost) {
    funds = funds - cost; 
  }  
}