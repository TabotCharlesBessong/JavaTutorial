
import javax.swing.JOptionPane;

public class dialog1{
  public static void main(String[] args){
    JOptionPane.showMessageDialog(null, "Welcome to Java programming");

    String name = JOptionPane.showInputDialog("What is your name?");
    String message = String.format("Welcome, %s , to Java Programming!", name);
    JOptionPane.showMessageDialog(null,message);
  }
}