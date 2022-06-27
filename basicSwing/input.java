
import javax.swing.*;
import java.awt.*;

public class input {
  input (){
    JFrame f = new JFrame("Swing");
    ImageIcon im = new ImageIcon("icon2.png");
    JLabel l = new JLabel(im);
    // l.setText("Hello and welcome");
    f.add(l);
    f.setVisible(true);
    f.setSize(300,300);
    f.getContentPane().setLayout(new GridLayout(5,5));
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public static void main (String[] args){
    new input();
  }
}
