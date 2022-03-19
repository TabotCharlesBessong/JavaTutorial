import java.awt.FlowLayout; // specifies how components are arranged
import javax.swing.JFrame; // provides basic window features
import javax.swing.JLabel; // displays text and images
import javax.swing.SwingConstants; // common constants used with Swing
import javax.swing.Icon; // interface used to manipulate images
import javax.swing.ImageIcon; // loads images

public class LabelFrame extends JFrame {
  private final JLabel label1;
  private final JLabel label2;
  private final JLabel label3;

  public LabelFrame(){
    super("Testing Jlabels");
    setLayout(new FlowLayout());

    label1 = new JLabel("Label with text");
    label1.setToolTipText("This is label1");
    add(label1);

    Icon navete = new ImageIcon(getClass().getResource("icon2.png"));
    label2 = new JLabel("Label with text and Icon", navete, SwingConstants.LEFT );
    label2.setToolTipText("This is label 2");
    add(label2);

    label3 = new JLabel(); // JLabel constructor no arguments
    label3.setText("Label with icon and text at bottom");
    label3.setIcon(navete); // add icon to JLabel
    label3.setHorizontalTextPosition(SwingConstants.CENTER);
    label3.setVerticalTextPosition(SwingConstants.BOTTOM);
    label3.setToolTipText("This is label3"); 
    add(label3);
  }
}
