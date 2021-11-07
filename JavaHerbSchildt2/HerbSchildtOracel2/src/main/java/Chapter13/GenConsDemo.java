/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter13;

/**
 *
 * @author admin
 */
// Use a generic constructor. 
class Summation { 
  private int sum; 
 
  <T extends Number> Summation(T arg) { 
    sum = 0; 
 
    for(int i=0; i <= arg.intValue(); i++) 
      sum += i; 
  } 
 
  int getSum() { 
    return sum; 
  } 
} 
 
public class GenConsDemo { 
  public static void main(String args[]) { 
    Summation ob = new Summation(4.0); 
 
    System.out.println("Summation of 4.0 is " + ob.getSum()); 
  } 
}
