import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Button extends JFrame {
  private final JButton plainJButton;
  private final JButton fancyJButton;

  // Button 
  public Button(){
    super("Testing Button");
    setLayout(new FlowLayout());

    plainJButton = new JButton("Plain Button");
    add(plainJButton);

    Icon bug1 = new ImageIcon(getClass().getResource("icon2.png"));
    Icon bug2 = new ImageIcon(getClass().getResource("icon2.png"));
    fancyJButton = new JButton("Fancy Button",bug1);
    fancyJButton.setRolloverIcon(bug2);
    add(fancyJButton);

    ButtonHandler handler = new ButtonHandler();
    fancyJButton.addActionListener(handler);
    plainJButton.addActionListener(handler);
  }
  private class ButtonHandler implements ActionListener {
    public void actionPerformed(ActionEvent event){
      JOptionPane.showMessageDialog(Button.this, String.format("You pressed: %s", event.getActionCommand()));
    }
  }
}
