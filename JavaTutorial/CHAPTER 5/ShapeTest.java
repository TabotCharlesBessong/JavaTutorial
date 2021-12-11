
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ShapeTest {
  public static void main(String[] args){
    String input = JOptionPane.showInputDialog("Enter 1 to drw a rectangle\n" + "Enter 2 to draw an Oval\n" + "Enter 3 to draw a Rounded Rectangle");

    int choice = Integer.parseInt(input);

    Shapes panel = new Shapes(choice);

    JFrame application = new JFrame();
    application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    application.add(panel);
    application.setSize(800,800);
    application.setVisible(true);
  }
}
