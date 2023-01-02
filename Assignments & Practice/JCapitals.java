package Week6Java2;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Write an application that allows a user to select a country from a 
// list box that contains at least eight options. 
// ================ First Step ====================
// After the user makes a selection, display the country’s capital city. 
// ================ Second Step ===================
// Save the file as JCapitals.java.
// ================ Final Step ====================
public class JCapitals {
// Write an application that allows a user to select a country from a 
// list box that contains at least eight options. 
    static JFrame frame = new JFrame("GUI for Dropdown");

    static String[] options = {"US" , "Germany" , "Russia" , "South Korea" , "China" , "Australia" , "New Zealand" , "Mexico"};

    static String[] capitals = {"Washington D.C." , "Berlin" , "Moscow" , "Seoul" , "Beijing" , "Canberra" , "Wellington" , "Mexico City"};

    static JComboBox<String> jComboBox = new JComboBox<>(options);

    static JLabel label = new JLabel("");


    public static void main(String[] args) {
    
    
    jComboBox.setBounds(80, 50, 140, 20);

    frame.add(jComboBox);
    frame.add(label);
    label.setBounds(20,100, 300, 50);
    frame.setLayout(null);
    frame.setSize(350, 250);
    frame.setVisible(true);
    setup();
    }
// After the user makes a selection, display the country’s capital city. 
public static void setup() {
jComboBox.addActionListener(new ActionListener() {        
    @Override
        public void actionPerformed(ActionEvent ae) {
            if(options[0] == options[0]){
                label.setText("Your Countries capital is: " + capitals[0]);
            }
            if(options[1] == options[1]){
                label.setText("Your Countries capital is: " + capitals[1]);
            }
            if(options[2] == options[2]){
                label.setText("Your Countries capital is: " + capitals[2]);
            }
            if(options[3] == options[3]){
                label.setText("Your Countries capital is: " + capitals[3]);
            }
            if(options[4] == options[4]){
                label.setText("Your Countries capital is: " + capitals[4]);
            }
            if(options[5] == options[5]){
                label.setText("Your Countries capital is: " + capitals[5]);
            }
            if(options[6] == options[6]){
                label.setText("Your Countries capital is: " + capitals[6]);
            }
            if(options[7] == options[7]){
                label.setText("Your Countries capital is: " + capitals[7]);
            }
            else
            label.setText("Please try again!");
        }
    });}}