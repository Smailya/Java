/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loops;

import java.util.Scanner;

/**
 *
 * @author ISMAIL
 */
public class Loops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       /* int num = 1;
        
        while(num<=10){
            System.out.println(num +" ");
            num +=2;
        }*/
       
      
       
       /*int number = 2;
        while (number <= 20) {
            if (number == 12) {
                break;
            }
            System.out.print(number + " ");
            number += 2;
        }
        System.out.println();*/
       
       
       // Letting the user decide when to quit
      
       
       /*Scanner sc = new Scanner(System.in);
       
        int number = 2;
        String input;
        while (true) {
            System.out.println(number + " ");
            System.out.print("Do you want to keep counting?"
                    + " (Y or N)");
            input = sc.next();
            if (input.equalsIgnoreCase("N")) {
                break;
            }
            number += 2;
        }
        System.out.println("\nWhew! That was close.\n");*/
       
      // Using the continue Statement
      
      
            /*  Scanner sc = new Scanner(System.in);
        int number = 2;
        String input = "Y";
        while (input.equalsIgnoreCase("Y")) {
            System.out.println(number + " ");
            System.out.print("Do you want to keep counting?"
                    + " (Y or N)");
            input = sc.next();
            number += 2;
        }
        System.out.println("\nWhew! That was close.");*/
            
       /* int number = 2;
        do {
            System.out.print(number + " ");
            number += 2;
        } while (number > 20);
        System.out.println();*/
       
       //Validating Input from the User
               Scanner sc = new Scanner(System.in); 
      /*  int bank = 1000; // assume the user has $1,000
        int bet; // the bet entered by the user
        System.out.println("You can bet between 1 and "
                + bank);
        do {
            System.out.print("Enter your bet: ");
            bet = sc.nextInt();
        } while ((bet <= 1) || (bet > bank));
       System.out.println("Your money's good here.");*/
      
      
      //for loop, you can count backward by using the -- signs
      
        /*for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }*/
        //System.out.println("The final value of i is " + i);
        
        
        //The Guessing Game
        
   
        /*
        boolean keepPlaying = true;
        System.out.println("Let's play a guessing game!");
        while (keepPlaying) {
            boolean validInput;
            int number, guess;
            String answer;
// Pick a random number
            number = (int) (Math.random() * 10) + 1;
// Get the guess
            System.out.println("\nI'm thinking of a number "
                    + "between 1 and 10.");
            System.out.print("What do you think it is? ");
            do {
                guess = sc.nextInt();
                validInput = true;
                if ((guess < 1) || (guess > 10)) {
                    System.out.print("I said, between 1 and 10. "
                            + "Try again: ");
                    validInput = false;
                }
            } while (!validInput);
// Check the guess
            if (guess == number) {
                System.out.println("You're right!");
            } else {
                System.out.println("You're wrong! "
                        + "The number was " + number);
            }
// Play again?
            do {
                System.out.print("\nPlay again? (Y or N)");
                answer = sc.next();
                validInput = true;
                if (answer.equalsIgnoreCase("Y")); else if (answer.equalsIgnoreCase("N")) {
                    keepPlaying = false;
                } else {
                    validInput = false;
                }
            } while (!validInput);
        }
        System.out.println("\nThank you for playing!");*/
        
        
        // Voting Machine
        
        
   
    
     
    }
    
    
}
