/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstractclass.pkginterface;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author ISMAIL
 */
public class AbstractClassInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Timer t = new Timer(1000, new Ticker());
        t.start();
// display a message box to prevent the
// program from ending immediately
        JOptionPane.showMessageDialog(null,
                "Click OK to exit program");
    }

}

class Ticker implements ActionListener {

    private boolean tick = true;

    public void actionPerformed(ActionEvent event) {
        if (tick) {
            System.out.println("Tick...");
        } else {
            System.out.println("Tock...");
        }
        tick = !tick;
    }
}
