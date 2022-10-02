package eventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;
public class textEvent {
  textEvent() {
    JFrame f = new JFrame("Swing");
    f.setLayout(new FlowLayout());
    JTextField tf = new JTextField(15);
    JTextField tf1 = new JTextField(15);
    f.add(tf);
    f.add(tf1);
    tf.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        tf.setText("You have pressed Enter Key");
        System.out.println(new Date(e.getWhen()));
      }
    });

    // focus listener
    tf.addFocusListener(new FocusListener(){
      public void focusGained(FocusEvent e){
        tf.setText("Focus Gained");
      }

      public void focusLost(FocusEvent e){
        tf.setText("Focus Lost");
      }
    });

    // key listener
    // tf.addKeyListener(new KeyListerner(){
    //   public void keyPressed(KeyEvent e){
    //     tf1.setText("Pressing "+e.getKeyChar());
    //   }
    //   public void keyReleased(KeyEvent e){
    //     tf1.setText("Release ");
    //   }
    //   public void keyTyped(KeyEvent e) {}
    // })
    f.setSize(300,300);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public static void main (String[] args) {
    new textEvent();
  }
}


// Hello Sir Mohamed Auf good afternoon I am Charles Tabot from Cameroon. I am presently working on an idea i have started implementing and it is base around real estate , at least just for the start (just as books were to amazon , so is real estate to us) . It will also offer some services similar to that offered by tripAdvisor 

// I use technologies such as 
// #reactjs #nodejs  #postgresql #express #mui #redux 

// I look forward to working with you and learning from your experience

// Hello Sir Mauro Peixe good morning I am Charles Tabot from Cameroon. I am presently working on an idea i have started implementing and it is base around real estate , at least just for the start (just as books were to amazon , so is real estate to us) . And i already have vision on how to grow the idea , and i cant do that alone , i need someone more technical than i am in this tools to be able to build this 

// I use technologies such as 
// #reactjs #nodejs  #postgresql #express #mui #redux 

// I look forward to working with you and learning from your experience

// Hello Ruben Arevalo  guten morgen I am Charles Tabot from Cameroon. I am presently working on an idea i have started implementing and it is base around real estate , at least just for the start (just as books were to amazon , so is real estate to us) . And i already have vision on how to grow the idea , and i cant do that alone , i need someone more technical than i am in this tools to be able to build this 

// I use technologies such as 
// #reactjs #nodejs  #postgresql #express #mui #redux 

// As we will be advancing and to make the services more useful to our users , your data scientist skills in python and sql is very much needed .

// I look forward to working with you and learning from your experience


// New messages 

// Hello Egor good afternoon , i have seen your profile and i really do like it . 

// I am 20 years old ( just turned 20 6 days ago ) in my third year at the university . 

// I will really like to work with a young talent like you as we still have enough time ahead of us . 

// I want to create a startup which will start by the real estate market and will expand bit by bit as amozon did in the 1990s . 

// I see your stack is same as mine , so lets connect and talk more

// Look forward to this   
