/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switchero;

import java.util.Scanner;

/**
 *
 * @author ISMAIL
 */
public class Switchero {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            /* String mesg = ("Welcome to the voting machine "+ "error code decoder.\n\n"+ "If your voting machine generates " + "an error code,\n"+ "you can use this program to determine "
                + "the exact\ncause of the error.\n");
      

        System.out.println(mesg);
        System.out.print("Enter the error code: ");

        int err = sc.nextInt();
        String msg;
        switch (err) {
            case 1:
                msg = "Voter marked more than one "
                        + "candidate.\nBallot rejected.";
                break;
            case 2:
                msg = "Box checked and write-in candidate "
                        + "entered.\nBallot rejected.";
                break;
            case 3:
                msg = "Entire ballot was blank.\n"
                        + "Ballot filled in according to "
                        + "secret plan.";
                break;
            case 4:
                msg = "Nothing unusual about the ballot.\n"
                        + "Voter randomly selected for tax audit.";
                break;
            case 5:
                msg = "Voter filled in every box.\n"
                        + "Ballot counted twice.";
                break;
            case 6:
                msg = "Voter drooled in voting machine.\n"
                        + "Beginning spin cycle.";
                break;
            case 7:
                msg = "Voter lied to pollster after voting.\n"
                        + "Voter's ballot changed "
                        + "to match polling data.";
                break;
            default:
                msg = "Voter filled out ballot correctly.\n"
                        + "Ballot discarded anyway.";
                break;
        }
        System.out.println(msg);*/
       
    //  Using the switch Statement  with car wash application
    
 Scanner sc = new Scanner(System.in);
        System.out.println("The car wash application!\n\n");
        System.out.print("Enter the package code: ");
        String s = sc.next();
        char p = s.charAt(0);
        String details = "";
        switch (p) {
            case 'E':
            case 'e':
                details += "\tNew Car Scent, plus ... \n";
            case 'D':
            case 'd':
                details += "\tTire Treatment, plus ... \n";
            case 'C':
            case 'c':
                details
                        += "\tLeather/Vinyl Treatment, plus ... \n";
            case 'B':
            case 'b':
                details += "\tWax, plus ... \n";
            case 'A':
            case 'a':
                details += "\tWash, vacuum, and hand dry.\n";
                break;
            default:
                details = "That's not one of the codes.";
                break;
        }
        System.out.println("\nThat package includes:\n");
        System.out.println(details);
    }
    
}
