
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class MultiSelection extends JFrame {
  private final JList<String> colorJList; // list to hold color names
  private final JList<String> copyJList; // list to hold copied names
  private JButton copyJButton; // button to copy selected names
  private static final String[] colorNames = {"Black", "Blue", "Cyan", "Dark Gray", "Gray", "Green", "Light Gray", "Magenta","Orange","Pink", "Red", "White", "Yellow"};

  public MultiSelection(){
    super("Multiple selection list");
    setLayout(new FlowLayout());

    colorJList = new JList<String>(colorNames);
    colorJList.setVisibleRowCount(6);
    colorJList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    add(new JScrollPane(colorJList));

    copyJButton = new JButton("Copy >>>");
    copyJButton.addActionListener(
      new ActionListener(){
        public void actionPerformed(ActionEvent event){
          copyJList.setListData(
            colorJList.getSelectedValuesList().toArray(
              new String[0]
            )
          );
        }
      }
    );
    
    add(copyJButton);

    copyJList = new JList<String>();
    copyJList.setVisibleRowCount(6);
    copyJList.setFixedCellWidth(100);
    copyJList.setFixedCellHeight(18);
    copyJList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
  }
}
