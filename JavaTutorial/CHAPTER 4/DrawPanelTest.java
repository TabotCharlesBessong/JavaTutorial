import javax.swing.JFrame;

public class DrawPanelTest {
  public static void main(String[] args){
    DrawPanel panel = new DrawPanel();
    JFrame application = new JFrame();

    application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    application.add(panel);
    application.setSize(300,350);
    application.setVisible(true);
  }
}
