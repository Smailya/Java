/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package usingarrays.b4;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ISMAIL
 */
public class UsingArraysB4 {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
        /* int count = 2;
        Scanner sc = new Scanner(System.in);
        
        String[] players = new String[count];
        for (int i = 0; i < count; i++) {
            System.out.print("Enter player name: ");
            players[i] = sc.nextLine(); // sc is a Scanne
        }*/
        //Generating Random Numbers
        /* int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = (int) (Math.random() * 100) + 1;
            System.out.println(numbers[i]);
        }*/
        //locker counter
        // true = open; false = closed
        /* boolean[] lockers = new boolean[1001];
// close all the lockers
        for (int i = 1; i <= 1000; i++) {
            lockers[i] = false;
        }
        for (int skip = 1; skip <= 1000; skip++) {
            System.out.println("Bobo is changing every "
                    + skip + " lockers.");
            for (int locker = skip; locker < 1000;
                    locker += skip) {
                lockers[locker] = !lockers[locker];
            }
        }
        System.out.println("Bobo is bored"
                + " now so he's going home.");
// count and list the open lockers
        String list = "";
        int openCount = 0;
        for (int i = 1; i <= 1000; i++) {
            if (lockers[i]) {
                openCount++;
                list += i + " ";
            }
        }
        System.out.println("Bobo left " + openCount
                + " lockers open.");

        System.out.println("The open lockers are: "
                + list); */
        /*        
// 2D arrays:
      
       // Here’s an example that initializes the sales array
     //  double[][] sales = new double[5][4];
double[][] sales
                = {{23853.0, 22838.0, 36483.0, 31352.0}, // 2004
                {25483.0, 22943.0, 38274.0, 33294.0}, // 2005
                {24872.0, 23049.0, 39002.0, 36888.0}, // 2006
                {28492.0, 23784.0, 42374.0, 39573.0}, // 2007
                {31932.0, 23732.0, 42943.0, 41734.0}}; // 2008

        NumberFormat cf = NumberFormat.getCurrencyInstance();
        System.out.println("\tNorth\t\tSouth\t\tEast\t\tWest");
        int year = 2004;
        for (int y = 0; y < 5; y++) {
            System.out.print(year + "\t");
            for (int region = 0; region < 4; region++) {
                System.out.print(cf.format(sales[y][region]));
                System.out.print("\t");
            }
            year++;
            System.out.println();

        } */

        
        
        //using the array class method to copy values
/*int arrayOriginal[] = {42, 55, 21};
int arrayNew[] =
Arrays.copyOf(arrayOriginal, 3);
printIntArray(arrayNew);*/

int[] lotto = new int[6];
for (int i = 0; i < 6; i++)
lotto[i] = (int)(Math.random() * 100) + 1;
Arrays.sort(lotto);
     
for(int result:lotto){
    System.out.println(result);
}
        
}
  static void printIntArray(int arrayNew[])
{
for (int i : arrayNew)
{
System.out.print(i);
System.out.print(' ');
}
System.out.println();
}
}