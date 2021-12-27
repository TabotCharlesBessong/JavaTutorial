import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseDetails extends JFrame {
  private String details;
  private final JLabel statusBar;

  public MouseDetails(){
    super("Mouse clicks and buttons");

    statusBar = new JLabel("Click the mouse");
    add(statusBar,BorderLayout.SOUTH);
    addMouseListener(new MouseClickHandler());
  }
  
  private class MouseClickHandler extends MouseAdapter {
    public void mouseClicked(MouseEvent event){
      int x = event.getX();
      int y = event.getY();
      details = String.format("Clicked %d time(s)", event.getClickCount());

      if ( event.isMetaDown()) // right mouse button
        details += " with right mouse button";
      else if ( event.isAltDown()) // middle mouse button
        details += " with center mouse button";
      else // left mouse button
        details += " with left mouse button";       
        statusBar.setText(details); // display message in statusBar

    }
  }

}
