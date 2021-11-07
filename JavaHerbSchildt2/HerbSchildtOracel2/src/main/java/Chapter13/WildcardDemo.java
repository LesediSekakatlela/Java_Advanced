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
// Use a wildcard. 
class NumericFns1<T extends Number> {  
  T num; 
    
  // Pass the constructor a reference to   
  // a numeric object. 
  NumericFns1(T n) {  
    num = n; 
  }  
  
  // Return the reciprocal. 
  double reciprocal() { 
    return 1 / num.doubleValue(); 
  } 
 
  // Return the fractional component. 
  double fraction() { 
    return num.doubleValue() - num.intValue(); 
  } 
 
  // Determine if the absolute values of two 
  // objects are the same. 
  boolean absEqual(NumericFns1<?> ob) { 
    if(Math.abs(num.doubleValue()) == 
         Math.abs(ob.num.doubleValue())) return true; 
 
    return false; 
  } 
 
  // ... 
}  
  
// Demonstrate a wildcard. 
public class WildcardDemo {  
  public static void main(String args[]) {  
 
    NumericFns1<Integer> iOb = new NumericFns1<Integer>(6);   
 
    NumericFns1<Double> dOb =  new NumericFns1<Double>(-6.0); 
 
    NumericFns1<Long> lOb =  new NumericFns1<Long>(5L); 
  
    System.out.println("Testing iOb and dOb."); 
    if(iOb.absEqual(dOb)) 
      System.out.println("Absolute values are equal."); 
    else 
      System.out.println("Absolute values differ."); 
 
    System.out.println(); 
 
    System.out.println("Testing iOb and lOb."); 
    if(iOb.absEqual(lOb)) 
      System.out.println("Absolute values are equal."); 
    else 
      System.out.println("Absolute values differ."); 
  
  }  
}
