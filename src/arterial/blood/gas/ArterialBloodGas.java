/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arterial.blood.gas;

import javax.swing.JFrame;

/**
 *
 * @author 94764
 */
public class ArterialBloodGas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Abg window1 = new Abg();
       window1.setVisible(true);
       window1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
