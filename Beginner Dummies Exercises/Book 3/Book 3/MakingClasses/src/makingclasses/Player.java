/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package makingclasses;

/**
 *
 * @author ISMAIL
 */
public class Player {

    private int health;
    private String Name;
      private String LastName;

    //creating a constructor
    
    public Player(String first, String last){
       Name = first;
       LastName = last;
    }
    public int getHealth() {
        return health;
    }

    public void setHealth(int h) {
        health = h;
    }
}
