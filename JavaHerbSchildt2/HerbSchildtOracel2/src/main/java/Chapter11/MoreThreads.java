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
// Create multiple threads.
class MyThread1 implements Runnable {
  Thread thrd;

  // Construct a new thread.
  MyThread1(String name) {
    thrd = new Thread(this, name);
  }

  // A factory method that creates and starts a thread.
  public static MyThread1 createAndStart(String name) {
    MyThread1 myThrd = new MyThread1(name);
    
    myThrd.thrd.start(); // start the thread
    return myThrd;
  }

  // Entry point of thread.
  public void run() {
    System.out.println(thrd.getName() + " starting.");
    try {
      for(int count=0; count < 10; count++) {
        Thread.sleep(400);
        System.out.println("In " + thrd.getName() +
                           ", count is " + count);
      }
    }
    catch(InterruptedException exc) {
      System.out.println(thrd.getName() + " interrupted.");
    }
    System.out.println(thrd.getName() + " terminating.");
  }
}

public class MoreThreads {
  public static void main(String args[]) {
    System.out.println("Main thread starting.");

    MyThread1 mt1 = MyThread1.createAndStart("Child #1");
    MyThread1 mt2 = MyThread1.createAndStart("Child #2");
    MyThread1 mt3 = MyThread1.createAndStart("Child #3");

//    for(int i=0; i < 50; i++) {
//      System.out.print(".");
//      try {
//        Thread.sleep(100);
//      }
//      catch(InterruptedException exc) {
//        System.out.println("Main thread interrupted.");
//      }
//    } 
//
//    System.out.println("Main thread ending.");
//  }
//}

// Use isAlive(). 
    do { 
      System.out.print("."); 
      try { 
        Thread.sleep(100); 
      } 
      catch(InterruptedException exc) { 
        System.out.println("Main thread interrupted."); 
      } 
    } while (mt1.thrd.isAlive() || 
             mt2.thrd.isAlive() || 
             mt3.thrd.isAlive()); 
 
    System.out.println("Main thread ending."); 
  } 
}
