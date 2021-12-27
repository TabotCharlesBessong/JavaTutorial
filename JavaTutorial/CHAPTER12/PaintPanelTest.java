import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class PaintPanelTest {
  public static void main(String[] args){
    JFrame application = new JFrame("A simple paint program");

    PaintPanel paintPanel = new PaintPanel();
    application.add(paintPanel,BorderLayout.CENTER);

    // create a label and place in the south border plaint 
    application.add(new JLabel("Drag the mouse to draw"),BorderLayout.SOUTH);

    application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    application.setSize(400,300);
    application.setVisible(true);
  }
}
