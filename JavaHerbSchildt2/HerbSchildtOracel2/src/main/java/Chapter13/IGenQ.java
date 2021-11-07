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
// A generic queue interface. 
public interface IGenQ<T> {      
  // Put an item into the queue.      
  void put(T ch) throws QueueFullException;   
   
  // Get an item from the queue.     
  T get() throws QueueEmptyException;   
}
