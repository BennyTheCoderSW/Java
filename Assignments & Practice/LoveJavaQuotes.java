package Week6Java2;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Write an application that displays a JFrame containing these two phrases:
//“I love Java Programming” & “Java Programming is fun!”.
// ========= First step =============
//Add a button to the frame. When the user clicks the button, display “COP1805 Java 2 is the place to be”
// ========= Second step ============
//Save the file as LoveJavaQuotes.java.
// ======== Last step ===============


public class LoveJavaQuotes {
    static JFrame frame = new JFrame("Week6Assignment6 - Benny");
    static JLabel label = new JLabel("I love Java Programming");
    static JLabel label2 = new JLabel("Java Programming is fun!");
    static JButton button = new JButton("Click me!");

    public static void main(String[] args) {
    //Write an application that displays a JFrame containing these two phrases:
    //“I love Java Programming” & “Java Programming is fun!”.  
    frame.setLayout(new BorderLayout());
    frame.add(label, BorderLayout.NORTH);
    frame.add(label2, BorderLayout.SOUTH);
    frame.add(button, BorderLayout.CENTER);
    frame.setVisible(true);
    frame.setSize(400, 400); 
    setupListener(); 
    } 
//Add a button to the frame. When the user clicks the button, display “COP1805 Java 2 is the place to be”
public static void setupListener() {

    ActionListener buttonListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
        System.out.println("COP1805 Java 2 is the place to be"); 
        }
        };
        button.addActionListener(buttonListener);

    }
}


    
    

