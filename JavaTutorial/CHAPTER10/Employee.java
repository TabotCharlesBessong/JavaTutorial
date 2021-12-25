public abstract class Employee implements Payable {
  private final String firstName;
  private final String lastName;
  private final String socialSecurityNum;

  public Employee(String firstName , String lastName,String socialSecurityNum){
    this.firstName = firstName;
    this.lastName = lastName;
    this.socialSecurityNum = socialSecurityNum;
  }
  public String getFirstName(){
    return firstName;
  }
  public String getLastName(){
    return lastName;
  }
  public String getSocialSecurityNum(){
    return socialSecurityNum;
  }
  public String toString(){
    return String.format("%s %s%nsocial security number : %s", getFirstName(),getLastName(),getSocialSecurityNum());
  }

}
