/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter15.userfuncs.binaryfuncs;

/**
 *
 * @author admin
 */
// This interface defines a function that takes two int 
// arguments and returns an int result. Thus, it can 
// describe any binary operation on two ints that 
// returns an int.
public interface BinaryFunc { 
  // Obtain the name of the function. 
  public String getName(); 
 
  // This is the function to perform. It will be 
  // provided by specific implementations. 
  public int func(int a, int b); 
}
