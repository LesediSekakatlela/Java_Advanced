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
// An exception for queue-full errors.  
public class QueueFullException extends Exception {  
  int size;  
  
  QueueFullException(int s) { size = s; }  
  
  @Override
  public String toString() {  
   return "\nQueue is full. Maximum size is " +  
          size;  
  }  
}  
