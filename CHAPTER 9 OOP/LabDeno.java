
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JFrame;

public class LabDeno {
  public static void main(String[] args){
    JLabel northLabel = new JLabel("North");
    ImageIcon labelIcon = new ImageIcon("icon2.png");
    JLabel centralLabel = new JLabel(labelIcon);
    JLabel southLabel = new JLabel(labelIcon);
    southLabel.setText("South");
    JFrame application = new JFrame();
    application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    application.add(northLabel,BorderLayout.NORTH);
    application.add(centralLabel,BorderLayout.CENTER);
    application.add(southLabel,BorderLayout.SOUTH);

    application.setSize(300, 300);
    application.setVisible(true);
  }
}
