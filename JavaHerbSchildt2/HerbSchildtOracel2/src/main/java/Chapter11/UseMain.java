/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter11;

/**
 *
 * @author admin
 */
public class UseMain { 
  public static void main(String args[]) { 
    Thread thrd; 
 
    // Get the main thread. 
    thrd = Thread.currentThread(); 
 
    // Display main thread's name. 
    System.out.println("Main thread is called: " +  thrd.getName()); 
 
    // Display main thread's priority. 
    System.out.println("Priority: " +  thrd.getPriority()); 
 
    System.out.println(); 
 
    // Set the name and priority. 
    System.out.println("Setting name and priority.\n"); 
    thrd.setName("Thread #1"); 
    thrd.setPriority(Thread.NORM_PRIORITY+3); 
 
    System.out.println("Main thread is now called: " + thrd.getName()); 
 
    System.out.println("Priority is now: " + thrd.getPriority()); 
  } 
}
