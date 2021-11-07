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
// An exception for queue-empty errors.  
public class QueueEmptyException extends Exception {  
  
  @Override
  public String toString() {  
   return "\nQueue is empty.";  
  }  
}
