/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter16;

/**
 *
 * @author admin
 */
// A simple swing program
import javax.swing.*;
public class SwingDemo {
    
    SwingDemo() {
        // Create a new Jframe container
        JFrame jfrm = new JFrame("A simple swing application");
        
        // Give the frame an initial size. 
        jfrm.setSize(275, 100); 
    
        //Terminate the program when the user closes the application
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Create a text based label
        JLabel jlab = new JLabel("GUI programming is easy with swing.");
        
        //Add the label to the content pane.
        jfrm.add(jlab);
        
        //Display the frame
        jfrm.setVisible(true);
    }
    public static void main(String[] args) {
        //Create the frame on the event dispatching thread.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingDemo();
            }
        });
    }
}
