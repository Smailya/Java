/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgenum.owndatatypes;

/**
 *
 * @author ISMAIL
 */
public class EnumOwnDataTypes {
    
    public enum Items { Laptop, phone, mouse, screen}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Items L1;
        L1 = Items.Laptop;
        System.out.println(L1);
    }
    
}
