
// creating a basic window 
import javax.swing.* ;

// public class window{
//   public static void main(String[] args ){
//     JFrame f = new JFrame("Swing");
//     f.setSize(200,200);
//     f.setVisible(true);
//     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//   }
// }

// creating a window from an extended class

// public class window extends JFrame{
//   window() {
//     setTitle("Java Swing");
//     setSize(200,200);
//     setVisible(true);
//     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//   }
//   public static void main(String[] args) {
//     new window();
    
//   }
// }

// event driven frame creation 

public class window {
  window(){
    JFrame f = new JFrame("Swing");
    f.setSize(350,350);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(
      new Runnable() {
        public void run(){
          new window();
        }
      }
    );
  }
}




