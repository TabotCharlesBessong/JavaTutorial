import java.awt.Point;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import javax.swing.JPanel;

public class PaintPanel extends JPanel {
  // list of point of reference
  private final ArrayList<Point> points = new ArrayList<>();

  public PaintPanel(){
    addMouseMotionListener(
      new MouseMotionAdapter(){
        public void mouseDragged(MouseEvent event){
          points.add(event.getPoint());
          repaint();
        }
      }
    );
  }
  public void paintComponent(Graphics g){
    super.paintComponent(g);

    // draw all points
    for(Point p : points)
      g.fillOval(p.x, p.y, 4, 4);
  }
}
