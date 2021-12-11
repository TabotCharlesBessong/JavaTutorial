import java.util.Scanner;

public class calc {
  // private static Object esle;

  public static void main (String[] args){
    Scanner input = new Scanner(System.in);

    int mass,height,bmi;
    System.out.print("Enter the mass of your body:\t");
    mass = input.nextInt();
    System.out.print("\nEnter your height in \t(Meter):\t");
    height = input.nextInt();
    bmi = mass / (height * height);

    if(bmi <= 25){
      System.out.printf("Your body mass index is %d%n and you are underwighted ",bmi);
    }else if(bmi <=35){
      System.out.printf("Your body mass index is %d%n and you are normal weigth",bmi);
    }else {
      System.out.printf("Your body mass index is %d%n and you are overwigthed",bmi);
    }
  }
}
