/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package random.numbers;

/**
 *
 * @author ISMAIL
 */
public class RandomNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int roll;
        String msg = "Here are 100 random rolls of the dice:";
        System.out.println(msg);
        for (int i = 0; i < 5; i++) {
            
               roll = randomInt(1, 6);
            System.out.print(roll + " ");
        }
        System.out.println();
    }

    
    public static int randomInt(int low, int high) {
        int result = (int) (Math.random()
                * (high - low + 1)) + low;
        return result;
    }
}
