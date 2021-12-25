import javax.swing.JOptionPane;

public class Addition {
  public static void main(String[] args){
    String num1 = JOptionPane.showInputDialog("Enter the first integer");
    String num2 = JOptionPane.showInputDialog("Enter the second integer");
    int number1 = Integer.parseInt(num1);
    int number2 = Integer.parseInt(num2);

    int sum = number1 + number2;
    JOptionPane.showMessageDialog(null, "the sum is " + sum, "Sum of two Integers", JOptionPane.PLAIN_MESSAGE);
  }
}
