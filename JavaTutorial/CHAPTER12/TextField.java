
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class TextField extends JFrame {
  private final JTextField textField1; 
  private final JTextField textField2; 
  private final JTextField textField3; 
  private final JPasswordField passwordField; 

  public TextField(){
    super("Testing JText filed and JPasswordField");
    setLayout(new FlowLayout());

    // contruct text field with 10 columns
    textField1 = new JTextField(10);
    add(textField1);

    // construct text field with default text
    textField2 = new JTextField("Enter text here");
    add(textField2);

    // construct text field with default text and 21 columns
    textField3 = new JTextField("Uneditable text field",21);
    textField3.setEditable(false);
    add(textField3);

    // contruct password field with default text as password 
    passwordField = new JPasswordField("Hidden Text");
    add(passwordField);

    // register event handlers 
    TextFieldHandler  handler = new TextFieldHandler();
    textField1.addActionListener(handler);
    textField2.addActionListener(handler);
    textField3.addActionListener(handler);
    passwordField.addActionListener(handler);
  }

  private class TextFieldHandler implements ActionListener{
    public void actionPerformed(ActionEvent event){
      String string = "";
      if(event.getSource() == textField1)
        string = String.format("textField1: %s",event.getActionCommand());
      
      else if(event.getSource() == textField2)
        string = String.format("textField2: %s",event.getActionCommand());
      else if(event.getSource() == textField3)
        string = String.format("textfield3: %s",event.getActionCommand());
      else if(event.getSource() == passwordField)
        string = String.format("passwordField: %s",event.getActionCommand());
      JOptionPane.showMessageDialog(null, string);
    }
  }
}
