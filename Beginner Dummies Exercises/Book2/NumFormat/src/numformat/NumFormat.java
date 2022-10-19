/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numformat;

import java.text.NumberFormat;

/**
 *
 * @author ISMAIL
 */
public class NumFormat {

    static NumberFormat cf = 
NumberFormat.getCurrencyInstance();
    public static void main(String[] args) {
      double i = 50.0;
double j = 0.0;
double k = i / j;
System.out.println(k);
    }
    
    
    public static void printMyAllowance()
{
        double myAllowance = 5.00;
        cf = NumberFormat.getCurrencyInstance();
        System.out.println("My allowance: "
                + cf.format(myAllowance));
    }

    public static void printCostOfPaintBallGun() {
        double costOfPaintBallGun = 69.95;
        cf = NumberFormat.getCurrencyInstance();
        System.out.println("Cost of Paint Ball Gun: "
                + cf.format(costOfPaintBallGun));
    }
}
