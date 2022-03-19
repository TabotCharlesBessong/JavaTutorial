import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
// import javax.swing.plaf.basic.BasicTabbedPaneUI.MouseHandler;

public class MouseTracker extends JFrame {
  private final JPanel mousePanel;
  private final JLabel statusBar ; 

  public MouseTracker(){
    super("Demonstrating Mouse events");

    mousePanel = new JPanel();
    mousePanel.setBackground(Color.WHITE);
    add(mousePanel,BorderLayout.CENTER);

    statusBar = new JLabel("Mouse outside JPanel");
    add(statusBar, BorderLayout.SOUTH);

    // create andregister listener listener for mouse event
    MouseHandler handler = new MouseHandler();
    mousePanel.addMouseListener(handler);
    mousePanel.addMouseMotionListener(handler);
  }

  private class MouseHandler implements MouseListener,MouseMotionListener {

    public void mouseClicked(MouseEvent event){
      statusBar.setText(String.format("Clicked at [%d ,%d]",event.getX(),event.getY()));
      mousePanel.setBackground(Color.BLACK);
    }
    public void mousePressed(MouseEvent event){
      statusBar.setText(String.format("Pressed  at [%d ,%d]",event.getX(),event.getY()));
      mousePanel.setBackground(Color.BLUE);
    }
    public void mouseReleased(MouseEvent event){
      statusBar.setText(String.format("Released  at [%d ,%d]",event.getX(),event.getY()));
      // mousePanel.setBackground(Color.GREEN);
    }
    public void mouseEntered(MouseEvent event){
      statusBar.setText(String.format("Entered  at [%d ,%d]",event.getX(),event.getY()));
      mousePanel.setBackground(Color.GREEN);
    }
    public void mouseExited(MouseEvent event){
      statusBar.setText("Mouse outside JPanel");
      mousePanel.setBackground(Color.WHITE);
    }
    public void mouseDragged(MouseEvent event){
      statusBar.setText(String.format("Dragged  at [%d ,%d]",event.getX(),event.getY()));
    }
    public void mouseMoved(MouseEvent event){
      statusBar.setText(String.format("Moved  at [%d ,%d]",
    event.getX(),event.getY()));
    }
  }

}
