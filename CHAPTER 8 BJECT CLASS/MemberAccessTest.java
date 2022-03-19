public class MemberAccessTest {
  public static void main(String[] args){
    Time1 time = new Time1();// create a new time object 

    time.hour = 7; //error : hour has private access an it is invisible to other classses
    time.minutes = 15;//error : minute has private access an it is invisible to other classses
    time.second = 30;//error : second has private access an it is invisible to other classses
  }
}
