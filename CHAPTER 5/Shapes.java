
import java.awt.Graphics;
import javax.swing.JPanel; 

public class Shapes extends JPanel {
  public int choice;
  public Shapes(int userChoice){
    choice = userChoice;
  }
  public void paintComponent(Graphics g){
    super.paintComponent(g);
  
    for (int i = 0;i<10;i++){
      switch(choice){
        case 1:
          g.drawRect(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
          break;
        case 2:
          g.drawOval(10 + i * 10, 10 + i * 10, 50 + i * 50, 50 + i * 50);
          break;
        case 3 :
          g.drawRoundRect(15 + i * 12 , 15 + i * 15, 60 + i * 60, 60 + i * 60, 30 * i, 34 * i);
      }
    }
  }
}
