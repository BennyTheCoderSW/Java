package Week7Java2;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
Write a JavaFX application that displays a Label containing the sentence or two from your favorite movie.
Add a button to the frame in the program. 
When the user clicks the button, display the title of the movie that contains the quote in a second label.
 */

public class FXMovieQuote {
    static JFrame frame = new JFrame("Movie GUI");
    static JLabel label = new JLabel("I'll be back, With Weapons!");
    static JLabel label2 = new JLabel("");
    static JLabel label3 = new JLabel("");
    static JButton button = new JButton("Display Movie!");

    public static void main(String[] args) {
      //  Write a JavaFX application that displays a Label containing the sentence or two from your 
      // favorite movie.
      // Add a button to the frame in the program. 

        frame.setVisible(true);
        frame.setSize(500,500);
        label3.setBounds(0, 500, 200, 50);
        label.setBounds(0, 100, 200, 50);
        label2.setBounds(0, 250, 400, 50);
        button.setBounds(0, 175, 200, 25);
        frame.add(button);
        frame.add(label);
        frame.add(label2);
        frame.add(label3);
        setupListener();
    }

public static void setupListener() {
   // When the user clicks the button, 
   //display the title of the movie that contains the quote in a second label.

    ActionListener buttonListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
        button.setEnabled(false);
        label3.setText("Movie: Terminator");
        label2.setText("You'll never catch me John Connor!");
    }
};
button.addActionListener(buttonListener);

};

}

