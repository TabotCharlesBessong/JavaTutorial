public class HourlyEmployee extends Employee {
  private double wage;
  private double hours;

  public HourlyEmployee(String firstName,String lastName, String socialSecurityNum , double wage , double hours){
    super(firstName,lastName,socialSecurityNum);

    if(wage < 0.0)
      throw new IllegalArgumentException("Hourly wage must be >= 0.0");
    if((hours <0.0) || (hours > 168))
      throw new IllegalArgumentException("Hours worked in a week must be between 0 and 168 hours");
    this.wage = wage;
    this.hours = hours;
  }
  public void setWage(double wage){
    if(wage < 0.0)
      throw new IllegalArgumentException("Hourly wage must be >= 0.0");
    this.wage = wage;
  }
  public double getWage(){
    return wage;
  }
  public void setHour(double hours){
    if((hours <0.0) || (hours > 168))
      throw new IllegalArgumentException("Hours worked in a weekmust be between 0 and 168 hours");
    this.hours = hours;
  }
  public double getHours(){
    return hours;
  }
  public double earnings(){
    if(getHours() <=40)
      return getWage()* getHours();
    else
      return 40 * getHours() + (getHours() - 40) * getWage() * 1.5;
  }
  public String toString(){
    return String.format("hourly employee : %s%n%s : $%,.2f; %s: %,.2f", "hourly wage",getWage(),"hours worked",getHours());
  }
  @Override
  public double getPaymentAmount() {
    // TODO Auto-generated method stub
    return 0;
  }
}
