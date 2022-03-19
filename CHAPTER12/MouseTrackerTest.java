import javax.swing.JFrame;

public class MouseTrackerTest {
  public static void main(String[] args)
    {
    MouseTracker mouseTrackerFrame = new MouseTracker();
     mouseTrackerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     mouseTrackerFrame.setSize(300, 100);
     mouseTrackerFrame.setVisible(true);
     }
}
