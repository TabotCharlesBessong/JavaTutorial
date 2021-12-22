public class Date {
  private int month ;
  private int day ;
  private int year ;

  private static final int[] daysPerMonth = {0,31,28,31,30,31,30,31,31,30,31,30,31};
  public Date(int month , int day , int year){
    //check if month is in range
    if(month <= 0 || month > 12)
      throw new IllegalArgumentException("month(" + month + ") must be 1-12");
    //check if month is in range
    if(month <= 0 || month > 12)
      throw new IllegalArgumentException("month(" + month + ")must be 1-12");
  }
}
