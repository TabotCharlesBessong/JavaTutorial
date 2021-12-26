import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class ComboBox extends JFrame {
  private final JComboBox<String> imagesJComboBox;
  private final JLabel label;

  private static final String[] names = {"icon2.png","icon3.jfif","food1 (1).jpg","food1 (2).jpg","food1 (3).jpg","food1(4).jpg"};
  private final Icon[] icons = {
    new ImageIcon(getClass().getResource(names[0])),
    new ImageIcon(getClass().getResource(names[1])),
    new ImageIcon(getClass().getResource(names[2])),
    new ImageIcon(getClass().getResource(names[3])),
    new ImageIcon(getClass().getResource(names[4])),
    new ImageIcon(getClass().getResource(names[4])),
  };
  public ComboBox(){
    super("Testing JCombox");
    setLayout(new FlowLayout());

    imagesJComboBox = new JComboBox<String>(names); // set up JComboBox
    imagesJComboBox.setMaximumRowCount(5); // display three rows

    imagesJComboBox.addItemListener(
      new ItemListener() {
        @Override
        public void itemStateChanged(ItemEvent event){
      // determine whether item selected
          if (event.getStateChange() == ItemEvent.SELECTED)
           label.setIcon(icons[imagesJComboBox.getSelectedIndex()]);
        }
      } // end anonymous inner class
    ); // end call to addItemListener 
    add(imagesJComboBox);
    label = new JLabel(icons[0]);
    add(label);
  }
}
