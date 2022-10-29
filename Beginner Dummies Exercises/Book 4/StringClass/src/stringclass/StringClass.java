/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringclass;

import java.util.Scanner;

/**
 *
 * @author ISMAIL
 */
public class StringClass {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        int vowelCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c == 'A') || (c == 'a')
                    || (c == 'E') || (c == 'e')
                    || (c == 'I') || (c == 'i')
                    || (c == 'O') || (c == 'o')
                    || (c == 'U') || (c == 'u')) {
                vowelCount++;
            }
        }
        System.out.println("That string contains "
                + vowelCount + " vowels.");

        SplitString();
    }

    static void SplitString() {

        String address
                = "1500 N. Third Street:Fresno:CA:93722";
        String[] parts = address.split(":");

        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        String[] word = s.split("\\s+");
        for (String w : word) {
            System.out.println(w);
        }
        
    static void reptring(){

        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        s = s.replaceAll("cat", "dog");
        System.out.println(s);
    }
}


