package buttons;

import javax.swing.*;
import java.awt.*;

public class JButtonExample {
  JButtonExample() {
    JFrame f = new JFrame("Swing");
    f.setLayout(new FlowLayout());
    // ImageIcon im = new ImageIcon("icon2.png");
    JButton b = new JButton("Click Me");
    f.add(b);
    b.setText("Click Here");
    b.setPreferredSize(new Dimension(100,40));
    b.setHorizontalAlignment(JButton.LEFT);
    b.setVerticalAlignment(JButton.BOTTOM);
    b.setFont(new Font("Helvetica",Font.BOLD,14));
    b.setBackground(Color.GREEN);
    // b.setIcon(im);
    // b.setEnabled(false);
    System.out.println(b.getHorizontalAlignment());
    f.setSize(300,300);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    new JButtonExample();
  }
}
