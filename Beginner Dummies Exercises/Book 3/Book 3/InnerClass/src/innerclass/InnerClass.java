/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package innerclass;

import java.awt.event.*;
import javax.swing.*;

public class InnerClass {

    private String tickMessage = "Tick...";
    private String tockMessage = "Tock...";

    public static void main(String[] args) {
        InnerClass t = new InnerClass();
        t.go();
    }

    private void go() {
// create a timer that calls the Ticker class
// at one second intervals
        Timer t = new Timer(1000, new Ticker());
        t.start();
// display a message box to prevent the
// program from ending immediately
        JOptionPane.showMessageDialog(null,
                "Click OK to exit program");
        System.exit(0);
    }

}

class Ticker implements ActionListener {

    private boolean tick = true;

    public void actionPerformed(ActionEvent event) {
        if (tick) {
            String tickMessage = "tick";
            System.out.println(tickMessage);
        } else {
         String tockMessage = "tock";
            System.out.println(tockMessage);
        }
        tick = !tick;
    }
}
