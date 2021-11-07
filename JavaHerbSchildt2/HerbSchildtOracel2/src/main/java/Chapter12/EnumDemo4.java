/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter12;

/**
 *
 * @author admin
 */
// Demonstrate ordinal() and compareTo(). 
 
// An enumeration of Transport varieties. 
enum Transport4 {  
  CAR, TRUCK, AIRPLANE, TRAIN, BOAT 
} 
 
class EnumDemo4 { 
  public static void main(String args[])  
  { 
    Transport4 tp, tp2, tp3; 
 
    // Obtain all ordinal values using ordinal(). 
    System.out.println("Here are all Transport constants" + " and their ordinal values: "); 
    for(Transport4 t : Transport4.values()) 
      System.out.println(t + " " + t.ordinal()); 
 
    tp =  Transport4.AIRPLANE; 
    tp2 = Transport4.TRAIN; 
    tp3 = Transport4.AIRPLANE; 
 
    System.out.println(); 
 
    // Demonstrate compareTo() 
    if(tp.compareTo(tp2) < 0) 
      System.out.println(tp + " comes before " + tp2); 
 
    if(tp.compareTo(tp2) > 0) 
      System.out.println(tp2 + " comes before " + tp); 
 
    if(tp.compareTo(tp3) == 0) 
      System.out.println(tp + " equals " + tp3); 
  }
}
