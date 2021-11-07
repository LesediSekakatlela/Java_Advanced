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
// Use the built-in enumeration methods. 
// An enumeration of Transport varieties. 
enum Transport1 {  
  CAR, TRUCK, AIRPLANE, TRAIN, BOAT 
} 
 
public class EnumDemo2 { 
  public static void main(String args[])  
  { 
    Transport1 tp; 
 
    System.out.println("Here are all Transport constants"); 
 
    // use values() 
    Transport1 allTransports[] = Transport1.values(); 
    for(Transport1 t : allTransports) 
      System.out.println(t); 
 
    System.out.println(); 
    
    // use valueOf() 
    tp = Transport1.valueOf("AIRPLANE"); 
    System.out.println("tp contains " + tp); 
 
  } 
}
