/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scannerclass;

import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author ISMAIL
 */
public class ScannerClass {

    /**
     * @param args the command line arguments
     */
    
    static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
    
      /*  System.out.println("Enter an int: ");
        int x = in.nextInt();
        System.out.println("You entered: " + x); */
      
      
      
      
      // Using JOptionPane to get input  
    String s = JOptionPane.showInputDialog("Enter an int:");
    int x = Integer.parseInt(s);
        System.out.println("You entere: " + x);
        
      
    
    } 
    
    public static void display(){
        Scanner in = new Scanner(System.in);
        
         System.out.println("Enter a string ");
        String inp = in.nextLine();
        System.out.println("You entered: " + inp);
    }
}
