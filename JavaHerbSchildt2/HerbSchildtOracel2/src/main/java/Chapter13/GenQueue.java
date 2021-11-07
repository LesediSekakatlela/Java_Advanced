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
// A generic, fixed-size queue class. 
public class GenQueue<T> implements IGenQ<T> {      
  private T q[]; // this array holds the queue      
  private int putloc, getloc; // the put and get indices      
      
  // Construct an empty queue with the given array.     
  public GenQueue(T[] aRef) {   
    q = aRef;  
    putloc = getloc = 0;      
  }      
     
  // Put an item into the queue.      
  @Override
  public void put(T obj)  
    throws QueueFullException {      
  
    if(putloc==q.length)   
      throw new QueueFullException(q.length);  
          
    q[putloc++] = obj;      
  }      
      
  // Get a character from the queue.     
  @Override
  public T get()  
    throws QueueEmptyException {      
  
    if(getloc == putloc)   
      throw new QueueEmptyException();  
        
    return q[getloc++];      
  }      
}
