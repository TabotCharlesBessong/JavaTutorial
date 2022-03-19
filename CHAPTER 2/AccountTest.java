import java.util.Scanner;

public class AccountTest {
  public static void main(String[] args){
    Account account1 = new Account("Yimnai Nerus", 50);
    Account account2 = new Account("Balemab Junior", 0);

    System.out.printf("%s balance: $%.2f%n",account1.getName() , account1.getBalance());
    System.out.printf("%s balance: $%.2f%n",account2.getName() , 
    account1.getBalance());

    Scanner input = new Scanner(System.in);

    System.out.print("Enter the deposit amount for acount 1: ");
    double depositAmount = input.nextDouble();
    System.out.printf("%nadding %.2f to account balance%n%n",depositAmount);
    account1.deposit(depositAmount);
    
    System.out.printf("%s balance: $%.2f%n",account1.getName(), account1.getBalance());
    System.out.printf("%s balance: $%.2f%n",account2.getName(), account2.getBalance());

    System.out.print("Enter deposit amount for account2: ");
    depositAmount = input.nextDouble();
    System.out.printf("%nadding %.2f to account2 balance%n%n",depositAmount);
    account2.deposit(depositAmount);

    System.out.printf("%s balance: $%.2f%n",account1.getName() , account1.getBalance());
    System.out.printf("%s balance: $%.2f%n",account2.getName() , 
  account2.getBalance());
  }
}