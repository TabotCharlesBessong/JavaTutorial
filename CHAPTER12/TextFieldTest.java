import javax.swing.JFrame;

public class TextFieldTest {
  public static void main(String[] args){
    TextField textFieldFrame = new TextField();
    textFieldFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    textFieldFrame.setSize(350, 100);
    textFieldFrame.setVisible(true);
  }
}
