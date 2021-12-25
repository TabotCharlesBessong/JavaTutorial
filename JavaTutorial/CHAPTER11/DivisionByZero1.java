import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionByZero1 {
  public static int quotient(int nume,int denome)
    throws ArithmeticException {
      return nume / denome ;
    }
    public static void main (String[] args){
      Scanner scanner = new Scanner(System.in);
      boolean continueLoop = true; 
      do{
        try {
          System.out.print("Please enter an integer as a numerator");
          int nume = scanner.nextInt();
          System.out.print("Please enter an integer as a denominator");
          int denome = scanner.nextInt();
          
          int result = quotient(nume, denome);
          System.out.printf("%nResult: %d / %d = %d%n", nume , denome , result);
          continueLoop = false;
        }
        catch (InputMismatchException inputMismatchException){
          System.err.printf("%nException: %s%n",inputMismatchException);
          scanner.nextLine();
          System.out.printf("Zero devison is invalid");
        }
        catch (ArithmeticException arithmeticException) {
          //TODO: handle exception
          System.err.printf("%nException: %s%n", arithmeticException);
          System.out.printf("Zero is an invalid denominator , please try again");
        }
      }
      while(continueLoop);
    }
}
