package Week6Java2;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;

//Write an application that instantiates a JFrame that contains a JButton. 
// ================= Step 1 ==========================
//Everytime the user clicks the button, display a message how many times you clicked the button. 
// ================= Step 2 ==========================
//After the user types the button 6 times, disable the JButton 
//and display the message “OK you click the button 6 times, enough is enough.
// ================= Step 3 ========================== 
//Make sure the max number of click is a constant so you can change the number of clicks. 
// ================= Final Step ======================

public class JFrameDisableButton {
    static int count = 0;
    static JFrame frame = new JFrame("JFrame Disable Button GUI - Benny");
    static JButton button = new JButton("Click Me!");
    static JLabel label = new JLabel("Number of clicks: " + count);
    static JLabel label2 = new JLabel("OK you click the button 6 times, enough is enough.");
    public static void main(String[] args) {

        //Write an application that instantiates a JFrame that contains a JButton. 
        frame.setSize(300,300);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout());
        frame.add(button);
        frame.add(label);
        button.setBounds(50,50,200,50);
        label.setBounds(150,25,200,50);
        setupListener();
    }

    public static void setupListener() {
        //Everytime the user clicks the button, display a message how many times you clicked the button. 
        ActionListener buttonListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
            count++;
            label.setText("Number of clicks: " + count);
            //After the user types the button 6 times, disable the JButton 
            //and display the message “OK you click the button 6 times, enough is enough.
            //If statement can always be changed at any point*******
            if(count == 6){
            button.setEnabled(false);
            label.setText("");
            frame.add(label2);
            label2.setBounds(150,25,200,50);
        }
    };

};
button.addActionListener(buttonListener);

}
}   
  
       
    
        


