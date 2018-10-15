/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaaticketsapplication;

/**
 *
 * @author grahamfarrell
 * @author richard schmidt de almeida
 * @author boris figeczky
 * 
 */
public class GaaTicketsApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Declares and creates a new instance of GaaTicketsApplicationGUI
        
        GaaTicketsApplicationGUI newGUI = new GaaTicketsApplicationGUI();
        
        // Sets the GUI to be visible to the user
        
        newGUI.setVisible(true);
        
        // Sets the GUI to the center of the screen once the code is executed
        
        newGUI.setLocationRelativeTo(null);
    
    }
    
}
