package Week7Java2;

import java.awt.Component;

import javax.swing.*;
import javax.swing.JCheckBox;

/*
Design a JavaFX application for the Keiser Sandwich Shop. 
The user makes sandwich order choices from list boxes, and the application displays the price. 
The user can choose from four main sandwich ingredients of your choice (for example, chicken) 
at four different prices. The user also can choose from four different bread types (for example, rye) 
from a list of at least four options. 
Use a CSS file to design an interface to reflect the business. 
Save the project as FXSandwich.java
 */


public class FXSandwich {
    static JFrame frame = new JFrame("Sandwich GUI");
    //The user can choose from four main sandwich ingredients of your choice (for example, chicken) 
    static JCheckBox chicken = new JCheckBox("chicken - $2.00");
    static JCheckBox turkey = new JCheckBox("turkey - $3.00");
    static JCheckBox tuna = new JCheckBox("tuna - $1.00");
    static JCheckBox ham = new JCheckBox("ham - $3.00");
    //The user also can choose from four different bread types (for example, rye) 
    //from a list of at least four options. 
    static JCheckBox rye = new JCheckBox("rye - $1.00");
    static JCheckBox white = new JCheckBox("white - $1.00");
    static JCheckBox seeds = new JCheckBox("bread with seeds - $1.00");
    static JCheckBox sourdough = new JCheckBox("sourdough - $1.00");
    static JPanel panel = new JPanel();
    static JPanel panel2 = new JPanel();
    static JLabel label = new JLabel("Please select a bread");
    static JLabel label2 = new JLabel("Please select a meat");
    static JLabel label3 = new JLabel("Your Bread is: ");
    static JLabel label4 = new JLabel("Your Meat is: ");




public static void main(String[] args) {
    frame.setVisible(true);
    frame.setSize(500,500);
    panel.setBounds(0, 150, 500, 200);
    panel2.setBounds(0, 200, 500, 200);
    frame.add(panel);
    frame.add(panel2);
    //panel setup for meat options
    panel.add(chicken);
    panel.add(turkey);
    panel.add(tuna);
    panel.add(ham);
    panel.add(label2);
    // panel2 setup for bread options
    panel2.add(rye);
    panel2.add(white);
    panel2.add(seeds);
    panel2.add(sourdough);
    panel2.add(label);
    // labels for selections

}
}