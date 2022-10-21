/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author ISMAIL
 */
public class Baseball extends Game {
    
    public Baseball(){
        setWeight(5.125);
    }
    
    public void hit()
{
System.out.println("You tore the cover off!");
super.hit();
}
}
