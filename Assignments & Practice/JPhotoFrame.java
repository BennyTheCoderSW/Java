package Week6Java2;

import java.awt.*;
import javax.swing.*;

/*Create an application for Keiser’s Portraits, a photography studio. 
The application allows users to compute the price of a photography session. 
Keiser’s base price is $50 for an in-studio photo session with one person.
=================== Define Prices as variables ===========================
The in-studio fee is $80 for a session with two or more subjects, and $75 for a session with a pet. 
=================== Define Prices as variables ===========================
A $100 fee is added if on location instead of in the studio. 
=================== Define Prices as variables ===========================
A $50 fee is added if rushed job. 
=================== Define Prices as variables ===========================
Include a set of mutually exclusive check boxes to select the 
portrait subject and another set of mutually exclusive check boxes for the session location and rush job. 
=================== check boxes for options ==============================
Include labels as appropriate to explain the application’s functionality. 
=================== JLabel the checkboxes ================================
Save the file as JPhotoFrame.java.
*/
public class JPhotoFrame {
    

    public static void main(String[] args) {

        JFrame frame = new JFrame("Photos For Keiser");

        frame.setLayout(new GridLayout(6,1));

        JCheckBox inStudio = new JCheckBox("Base Price In-Studio - $50");
        JCheckBox onLocation = new JCheckBox("On Location not in studio - 100$");
        JCheckBox multinStudio = new JCheckBox("Two or more in Studio - $80");
        JCheckBox soloPets = new JCheckBox("One person In Studio with a pet - $125");
        JCheckBox multiPets = new JCheckBox("Two or more in studio with a pet - $155");
        JCheckBox rushed = new JCheckBox("Rushed Job Fee - $50");

        JPanel panel = new JPanel();
        panel.add(multinStudio);
        panel.add(soloPets);
        panel.add(multiPets);
        frame.add(panel);
        panel.add(inStudio);
        panel.add(onLocation);
        panel.add(rushed);
        

        frame.setSize(1500,600);
        frame.setVisible(true);

    }
}
