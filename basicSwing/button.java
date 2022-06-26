
import javax.swing.*;

public class button {
  button(){
    JFrame f = new JFrame();
    JButton b = new JButton("Hello world");
    f.setSize(200,200);
    b.setBounds(50,50,100,30);
    f.add(b);
    f.setLayout(null);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    new button();
  }
}
