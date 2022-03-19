import java.util.Scanner;

public class operation {
  public static void main (String[] args){
    Scanner input = new Scanner(System.in);
    
    int num1,num2,sum , prod,sub,div,mod;
    System.out.print("Enter your first number:\t");
    num1 = input.nextInt();
    System.out.print("\nEnter yoyr second number:\t");
    num2 = input.nextInt();
    
    sum = num1 + num2; 
    prod = num1 * num2;
    sub = num1 - num2;
    div = num1 / num2;
    mod = num1 % num2;
    System.out.printf("Sum is %d%n\n",sum);
    System.out.printf("Prod is %d%n\n",prod);
    System.out.printf("difference is %d%n\n",sub);
    System.out.printf("divisor is %d%n\n",div);
    System.out.printf("The remainder is %d%n",mod);
    if(num1 == num2){
      System.out.println("The two numbers are equal\n");
    }else if(num1 > num2){
      System.out.println("Number 1 is bigger than number 2");
    }else if(num1 < num2){
      System.out.println("Number 1 is less than number 2");
    }else{
      System.out.println("Error");
    }

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
