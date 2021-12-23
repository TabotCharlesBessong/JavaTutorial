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
    // condition to check if the days of the month is greater than days of the month for that particuler moment and if 
    if(day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29) ))
      throw new IllegalArgumentException("day(" + day + ") out of range for the specified month of the year");
      //check if month is in range
    // this condition holds only when it is a  leap year
    if(month == 2 && day ==29 && !(year % 400 == 0 || (year % 4 == 0 || year % 100 == 0 )) )
      throw new IllegalArgumentException("month(" + month + ") must be 1-12");

    this.month = month ;
    this.day = day;
    this.year = year;

    System.out.printf("Date object constructor for date %s%n", this);

  }
  public String toString(){
    return String.format("%d/%d/%d", month, day ,year);
  }
}
