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
// Create a thread by implementing Runnable.
class MyThread2 implements Runnable {
  String thrdName;

  MyThread2(String name) {
    thrdName = name;
  }

  // Entry point of thread.
  public void run() {
    System.out.println(thrdName + " starting.");
    try {
      for(int count=0; count < 10; count++) {
        Thread.sleep(400);
        System.out.println("In " + thrdName +
                           ", count is " + count);
      }
    }
    catch(InterruptedException exc) {
      System.out.println(thrdName + " interrupted.");
    }
    System.out.println(thrdName + " terminating.");
  }
}

public class UseThreads {
  public static void main(String args[]) {
    System.out.println("Main thread starting.");

    // First, construct a MyThread object.
    MyThread2 mt = new MyThread2("Child #1");

    // Next, construct a thread from that object.
    Thread newThrd = new Thread(mt);

    // Finally, start execution of the thread.
    newThrd.start();

    for(int i=0; i<50; i++) {
      System.out.print(".");
      try {
        Thread.sleep(100);
      }
      catch(InterruptedException exc) {
        System.out.println("Main thread interrupted.");
      }
    }

    System.out.println("Main thread ending.");
  }
}
