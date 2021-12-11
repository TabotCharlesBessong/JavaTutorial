public class Time1 {
  private int hour;
  private int minutes;
  private int second;

  public void setTime(int hour , int minute , int second){
    if(hour < 0 || hour >= 24 || minute < 0 || minute >= 60 || second < 0 || second >= 60){
      throw new IllegalArgumentException("Hour minutes and second are out of range")
    }
  }
}
