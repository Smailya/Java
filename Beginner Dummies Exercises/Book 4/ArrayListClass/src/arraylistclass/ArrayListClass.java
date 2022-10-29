/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylistclass;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author ISMAIL
 */
public class ArrayListClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> nums = new ArrayList<String>();
        nums.add("One");
        nums.add("Two");
        nums.add("Three");
      //  nums.add("Four");
      //  nums.add(2, "Two and a half");

        for (String s : nums) {
            System.out.println(s);
        }
        
        //using iterator
    /*    nums.add("Four");
        String s;
        Iterator e = nums.iterator();
        while (e.hasNext()) {
            s = (String) e.next();
            System.out.println(s);
        }*/
        
    
        System.out.println("After changing the list");
        nums.set(0, "Uno");
        nums.set(1, "Dos");
        nums.set(2, "Tres");
        System.out.println(nums);
        
        System.out.println("After Deleting from the list:");
        nums.remove("Dos");
         System.out.println(nums);

    }
    
}
