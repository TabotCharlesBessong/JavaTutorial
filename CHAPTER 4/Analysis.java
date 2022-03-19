
import java.util.Scanner;

public class Analysis {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    int passes = 0;
    int failures = 0;
    int studentCounter = 0;

    while(studentCounter < 10){
      System.out.print("Enter your studentsv marks: ");
      int marks = input.nextInt();
      if(marks >= 50){
        passes +=1;
      }else{
        failures +=1;
      }
      studentCounter +=1;
    }
    System.out.printf("Passes: %d%nFailed%d%n ",passes,failures);
    
  }
}
