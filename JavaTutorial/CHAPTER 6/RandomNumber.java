
import java.security.SecureRandom;

public class RandomNumber {
  public static void main(String[] args){
    SecureRandom randomNumbers  = new SecureRandom();

    for(int counter = 1; counter<=30;counter++){
      int face = 1 + randomNumbers.nextInt(6);
      System.out.printf("%d  ", face);

      if(counter % 6 == 0)
        System.out.println();
    }
  }
}
