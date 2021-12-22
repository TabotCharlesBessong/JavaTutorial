public class Time1Test {
  public static void main(String[] args){
    //create and innitialise Time 1 object
    Time1 time = new Time1();
 
    // output string representation of time
    displayTime("After time object is created ",time);
    System.out.println();

    // change time and output time 
    time.setTime(13,27,6);
    displayTime("After calling setTime",time);
    System.out.println(); 

    try {
      time.setTime(99,99,99);
    } catch (IllegalArgumentException e) {
      //TODO: handle exception
      System.out.printf("Exception: %s%n%n", e.getMessage());
    }
    displayTime("After cslling invalid values",time);
  }
  private static void displayTime(String header , Time1 t){
    System.out.printf("%s%nUniversal time : %s%nStandard time : %s%n", header, t.toUniversalString(), t.toString());
  }
}
