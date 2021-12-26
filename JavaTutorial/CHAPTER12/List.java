
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.ListSelectionModel;

public class List extends JFrame {
  private final JList<String> colorJList;
  private static final String[] colorNames = {"BLack","Blue","Cyan","Dark Gray","Gray","Green","Light Gray","magenta","Orange","Pink","Red","White","Yellow"};
  private static final Color[] colors = {Color.BLACK,Color.BLUE,Color.CYAN,Color.DARK_GRAY,Color.GRAY,Color.GREEN,Color.LIGHT_GRAY, Color.MAGENTA,Color.MAGENTA,Color.ORANGE,Color.PINK,Color.RED,Color.WHITE,Color.YELLOW};

  public List(){
    super("List Testing");
    setLayout(new FlowLayout());

    colorJList = new JList<String>(colorNames);
    colorJList.setVisibleRowCount(5);

    // do not allow  multiple slection
    colorJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    // add  a Jscrroll plane containning JLIst to frame
    add(new JScrollPane(colorJList));

    colorJList.addListSelectionListener(
      new ListSelectionListener() {
        public void valueChanged(ListSelectionEvent event){
          getContentPane().setBackground(colors[colorJList.getSelectedIndex()]);
        }
      }
    );
  }
}
