/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgif.boll;

import java.util.Scanner;

/**
 *
 * @author ISMAIL
 */
public class IfBoll {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sales amount:");
        double salesTotal = sc.nextDouble();
        
        double commissionRate;
        if (salesTotal <= 10000.0) {
            commissionRate = 0.02;
        System.out.println("Your commission rate is: 0.02");
        } else {
            commissionRate = 0.05;
             System.out.println("Your commission rate is: 0.05");
        }
        
    }
    
}
