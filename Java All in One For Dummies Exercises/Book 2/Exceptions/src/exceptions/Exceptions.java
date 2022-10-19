/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ISMAIL
 */
public class Exceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        System.out.print("Enter an integer: ");
        int i = GetAnInteger();
        System.out.println("You entered " + i);
    }
        public static int GetAnInteger()
{
    Scanner sc = new Scanner(System.in);
    
    while (true) {
        try {
            return sc.nextInt();
        } catch (InputMismatchException e) {
            sc.next();
            System.out.print("That's not "
                    + "an integer. Try again: ");
        }
    }
    }
    
}
