/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package roundingapp;

import java.text.NumberFormat;

/**
 *
 * @author ISMAIL
 */
public class RoundingApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double salesTax = 2.425;
        NumberFormat cf = NumberFormat.getCurrencyInstance();
        System.out.println(cf.format(salesTax));
        
        
        /*double x = 29.4;
        double y = 93.5;
        double z = -19.3;
        System.out.println("round(x) = " + Math.round(x));
        System.out.println("round(y) = " + Math.round(y));
        System.out.println("round(z) = " + Math.round(z));
        System.out.println();
        System.out.println("ceil(x) = " + Math.ceil(x));
        System.out.println("ceil(y) = " + Math.ceil(y));
        System.out.println("ceil(z) = " + Math.ceil(z));
        System.out.println();
        System.out.println("floor(x) = " + Math.floor(x));
        System.out.println("floor(y) = " + Math.floor(y));
        System.out.println("floor(z) = " + Math.floor(z));
        System.out.println();
        System.out.println("rint(x) = " + Math.rint(x));
        System.out.println("rint(y) = " + Math.rint(y));
        System.out.println("rint(z) = " + Math.rint(z));*/
    }
    
}
