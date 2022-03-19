
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class RadioButton extends JFrame {
  private final JTextField textField; 
  private final Font plainFont; 
  private final Font boldFont; 
  private final Font italicFont; 
  private final Font boldItalicFont; 
  private final JRadioButton plainJRadioButton; 
  private final JRadioButton boldJRadioButton; 
  private final JRadioButton italicJRadioButton; 
  private final JRadioButton boldItalicJRadioButton; 
  private final ButtonGroup radioGroup; 

  public RadioButton(){
    super("RadioButton Test");
    setLayout(new FlowLayout());

    textField = new JTextField("Watch the font style change", 25);
    add(textField);

    // create RadioButton
    plainJRadioButton = new JRadioButton("Plain", true);
    boldJRadioButton = new JRadioButton("Bold", false);
    italicJRadioButton = new JRadioButton("Italic", false);
    boldItalicJRadioButton = new JRadioButton("Bold/Italic", false);
    add(plainJRadioButton); // add plain button to JFrame
    add(boldJRadioButton); // add bold button to JFrame
    add(italicJRadioButton); // add italic button to JFrame
    add(boldItalicJRadioButton); // add bold and italic button 

    //create logical relationship between radiobutton
    radioGroup = new ButtonGroup(); // create ButtonGroup
    radioGroup.add(plainJRadioButton); // add plain to group
    radioGroup.add(boldJRadioButton); // add bold to group
    radioGroup.add(italicJRadioButton); // add italic to group
    radioGroup.add(boldItalicJRadioButton); // add bold and italic

    // create font object 
    plainFont = new Font("Serif", Font.PLAIN, 14);
    boldFont = new Font("Serif", Font.BOLD, 14);
    italicFont = new Font("Serif", Font.ITALIC, 14);
    boldItalicFont = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
    textField.setFont(plainFont); 

    // register events for JRadiobuttons
    plainJRadioButton.addItemListener(
      new RadioButtonHandler(plainFont));
    boldJRadioButton.addItemListener(
      new RadioButtonHandler(boldFont));
    italicJRadioButton.addItemListener(
      new RadioButtonHandler(italicFont));
    boldItalicJRadioButton.addItemListener(
      new RadioButtonHandler(boldItalicFont));
  }

  private class RadioButtonHandler implements ItemListener {
    private Font font;
    public RadioButtonHandler(Font f){
      font = f;
    }
    public void itemStateChanged(ItemEvent event){
      textField.setFont(font);
    }
  }
}
