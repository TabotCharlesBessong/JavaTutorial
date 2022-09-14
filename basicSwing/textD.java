import javax.swing.*;
import java.awt.*;

public class textD {
  textD(){
    JFrame f = new JFrame("Swing");
    JTextField tf = new JTextField();
    tf.setText("Charles Tabot");
    tf.setColumns(18);
    tf.setBackground(Color.RED);
    tf.select(0,15);
    // alternatively , we can still have 
    // tf.setSelectionStart(0);
    // tf.setSelectionEnd(15);
    tf.setSelectionColor(Color.GREEN);
    tf.setSelectedTextColor(Color.BLUE);
    tf.setFont(new Font("Courier",Font.BOLD|Font.ITALIC,16));
    System.out.println(tf.getBackground());
    System.out.println(tf.getCaretPosition());
    System.out.println(tf.getHorizontalAlignment());
    f.add(tf);
    f.setSize(200,200);
    f.setVisible(true);
    f.getContentPane().setLayout(new FlowLayout());
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public static void main(String[] args){
    new textD();
  }
}