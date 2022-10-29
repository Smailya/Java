/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bulkdata;

/**
 *
 * @author ISMAIL
 */
public class BulkData {

      public enum Reaction {
        KISS, SLAP
    }
   
    public static void main(String[] args) {
       Reaction k ;
     k =  Reaction.KISS;
        
        Spell sp = new Spell("Charm", SpellType.CHARM, "Tendreness");
        
        //how do you pass an enum type to a constructor
        
        
        //displaying using paralell string
        /*
        
            System.out.println("First Parallel stream: ");
spells.parallelStream()
.forEach(s -> System.out.println(s));
System.out.println("\nSecond Parallel stream: ");
spells.parallelStream()
.forEach(s -> System.out.println(s));
        */
        
       /* for (Spell spell : spells)
System.out.println(spell.name);
The equivalent code using the streams looks like this:
spells.stream().forEach(s -> System.out.println(s));*/
    }
    
}
