/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package soccer;

/**
 *
 * @author Administrator
 */
public class Game {
    
  public String des;
  public char cocode;
  public double price;
  public String setFields;
  public char colorcode;
  
 
  
  public void setFields(String desc, double prices, char g){
     this.des = desc;
     this.price = prices;
     
     System.out.print(des + prices);
     
  }
  public int setFields(int price, int quant, int total){
    
      quant = 1;
      total = price * quant;
      return total;
     
  }
  
  
  
public void setColor(String color){
    if(color.length() >0)
        this.cocode=color.charAt(0);
}
  
  
    
  
  public void display(){
      System.out.print(des + price);
  }
  
}
